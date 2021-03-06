
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getOfferOnSaleList complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getOfferOnSaleList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessContext" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}businessContextDto" minOccurs="0"/>
 *         &lt;element name="distributionContext" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}distributionContextDto" minOccurs="0"/>
 *         &lt;element name="customerContext" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}customerContextDto" minOccurs="0"/>
 *         &lt;element name="classificationContext" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}classificationContextDto" minOccurs="0"/>
 *         &lt;element name="marketingContext" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}marketingContextDto" minOccurs="0"/>
 *         &lt;element name="detailLevel" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}detailLevelDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOfferOnSaleList", propOrder = {
    "businessContext",
    "distributionContext",
    "customerContext",
    "classificationContext",
    "marketingContext",
    "detailLevel"
})
public class GetOfferOnSaleList {

    protected BusinessContextDto businessContext;
    protected DistributionContextDto distributionContext;
    protected CustomerContextDto customerContext;
    protected ClassificationContextDto classificationContext;
    protected MarketingContextDto marketingContext;
    protected DetailLevelDto detailLevel;

    /**
     * Obtient la valeur de la propri�t� businessContext.
     * 
     * @return
     *     possible object is
     *     {@link BusinessContextDto }
     *     
     */
    public BusinessContextDto getBusinessContext() {
        return businessContext;
    }

    /**
     * D�finit la valeur de la propri�t� businessContext.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessContextDto }
     *     
     */
    public void setBusinessContext(BusinessContextDto value) {
        this.businessContext = value;
    }

    /**
     * Obtient la valeur de la propri�t� distributionContext.
     * 
     * @return
     *     possible object is
     *     {@link DistributionContextDto }
     *     
     */
    public DistributionContextDto getDistributionContext() {
        return distributionContext;
    }

    /**
     * D�finit la valeur de la propri�t� distributionContext.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionContextDto }
     *     
     */
    public void setDistributionContext(DistributionContextDto value) {
        this.distributionContext = value;
    }

    /**
     * Obtient la valeur de la propri�t� customerContext.
     * 
     * @return
     *     possible object is
     *     {@link CustomerContextDto }
     *     
     */
    public CustomerContextDto getCustomerContext() {
        return customerContext;
    }

    /**
     * D�finit la valeur de la propri�t� customerContext.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerContextDto }
     *     
     */
    public void setCustomerContext(CustomerContextDto value) {
        this.customerContext = value;
    }

    /**
     * Obtient la valeur de la propri�t� classificationContext.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationContextDto }
     *     
     */
    public ClassificationContextDto getClassificationContext() {
        return classificationContext;
    }

    /**
     * D�finit la valeur de la propri�t� classificationContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationContextDto }
     *     
     */
    public void setClassificationContext(ClassificationContextDto value) {
        this.classificationContext = value;
    }

    /**
     * Obtient la valeur de la propri�t� marketingContext.
     * 
     * @return
     *     possible object is
     *     {@link MarketingContextDto }
     *     
     */
    public MarketingContextDto getMarketingContext() {
        return marketingContext;
    }

    /**
     * D�finit la valeur de la propri�t� marketingContext.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingContextDto }
     *     
     */
    public void setMarketingContext(MarketingContextDto value) {
        this.marketingContext = value;
    }

    /**
     * Obtient la valeur de la propri�t� detailLevel.
     * 
     * @return
     *     possible object is
     *     {@link DetailLevelDto }
     *     
     */
    public DetailLevelDto getDetailLevel() {
        return detailLevel;
    }

    /**
     * D�finit la valeur de la propri�t� detailLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailLevelDto }
     *     
     */
    public void setDetailLevel(DetailLevelDto value) {
        this.detailLevel = value;
    }

}
