/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sopra.processors.soap;

import org.apache.commons.io.IOUtils;
import org.apache.nifi.util.MockFlowFile;
import org.apache.nifi.util.TestRunner;
import org.apache.nifi.util.TestRunners;
import org.junit.Before;
import org.junit.Test;
import sopra.processors.soap.client.*;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class SoapProcessorTest {

    private TestRunner testRunner;

    @Before
    public void init() {
        testRunner = TestRunners.newTestRunner(SoapProcessor.class);
    }

    @Test
    public void testProcessor() throws IOException {
        trustEveryone();

        // Récupération du XML Soap.
        MarketedElementEndPoint endPoint = new MarketedElementEndPointService().getMarketedElementEndPointPort();
        ResultOfferOnSaleListDto res = endPoint.getOfferOnSaleList(
                new BusinessContextDto(),
                new DistributionContextDto(),
                new CustomerContextDto(),
                new ClassificationContextDto(),
                new MarketingContextDto(),
                new DetailLevelDto()
        );

        // testRunner.setProperty(SoapProcessor.MY_PROPERTY, "HEADER");

        testRunner.enqueue(res.getOfferOnSaleList().toString());
        testRunner.run(1);
        testRunner.assertQueueEmpty();

        List<MockFlowFile> results = testRunner.getFlowFilesForRelationship(SoapProcessor.SUCCESS);
        // assertTrue("Conversion failed", results.size() == 1);
        MockFlowFile result = results.get(0);

        System.out.println("Résultat = \n" + IOUtils.toString(testRunner.getContentAsByteArray(result)));
        System.out.println("Longueur du résultat = " + result.getSize());

        // Test attributes and content
        /*
        result.assertAttributeEquals(JsonProcessor.MATCH_ATTR, "nifi rocks");
        result.assertContentEquals("nifi rocks");
        */
    }

    /**
     * Permet d'accepter même les certificats SSL invalides.
     */
    private void trustEveryone() {
        try {
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier(){
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }});
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(null, new X509TrustManager[]{new X509TrustManager(){
                public void checkClientTrusted(X509Certificate[] chain,
                                               String authType) throws CertificateException {}
                public void checkServerTrusted(X509Certificate[] chain,
                                               String authType) throws CertificateException {}
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }}}, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(
                    context.getSocketFactory());
        } catch (Exception e) { // should never happen
            e.printStackTrace();
        }
    }
}
