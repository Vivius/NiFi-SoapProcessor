
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour businessContextDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="businessContextDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpyCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchgMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalbankingOpRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalbankingOpRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgActionTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgHeaderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgVersionNb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="operationalPosId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="structureEltId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="treatmentDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessContextDto", propOrder = {
    "appCod",
    "cpyCod",
    "exchgMessageType",
    "externalbankingOpRef",
    "internalbankingOpRef",
    "languageCod",
    "msgActionTyp",
    "msgHeaderType",
    "msgVersionNb",
    "operationalPosId",
    "structureEltId",
    "treatmentDt",
    "userId"
})
public class BusinessContextDto {

    protected String appCod;
    protected String cpyCod;
    protected String exchgMessageType;
    protected String externalbankingOpRef;
    protected String internalbankingOpRef;
    protected String languageCod;
    protected String msgActionTyp;
    protected String msgHeaderType;
    protected Integer msgVersionNb;
    protected String operationalPosId;
    protected String structureEltId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar treatmentDt;
    protected String userId;

    /**
     * Obtient la valeur de la propriété appCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCod() {
        return appCod;
    }

    /**
     * Définit la valeur de la propriété appCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCod(String value) {
        this.appCod = value;
    }

    /**
     * Obtient la valeur de la propriété cpyCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpyCod() {
        return cpyCod;
    }

    /**
     * Définit la valeur de la propriété cpyCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpyCod(String value) {
        this.cpyCod = value;
    }

    /**
     * Obtient la valeur de la propriété exchgMessageType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchgMessageType() {
        return exchgMessageType;
    }

    /**
     * Définit la valeur de la propriété exchgMessageType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchgMessageType(String value) {
        this.exchgMessageType = value;
    }

    /**
     * Obtient la valeur de la propriété externalbankingOpRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalbankingOpRef() {
        return externalbankingOpRef;
    }

    /**
     * Définit la valeur de la propriété externalbankingOpRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalbankingOpRef(String value) {
        this.externalbankingOpRef = value;
    }

    /**
     * Obtient la valeur de la propriété internalbankingOpRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalbankingOpRef() {
        return internalbankingOpRef;
    }

    /**
     * Définit la valeur de la propriété internalbankingOpRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalbankingOpRef(String value) {
        this.internalbankingOpRef = value;
    }

    /**
     * Obtient la valeur de la propriété languageCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCod() {
        return languageCod;
    }

    /**
     * Définit la valeur de la propriété languageCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCod(String value) {
        this.languageCod = value;
    }

    /**
     * Obtient la valeur de la propriété msgActionTyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgActionTyp() {
        return msgActionTyp;
    }

    /**
     * Définit la valeur de la propriété msgActionTyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgActionTyp(String value) {
        this.msgActionTyp = value;
    }

    /**
     * Obtient la valeur de la propriété msgHeaderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgHeaderType() {
        return msgHeaderType;
    }

    /**
     * Définit la valeur de la propriété msgHeaderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgHeaderType(String value) {
        this.msgHeaderType = value;
    }

    /**
     * Obtient la valeur de la propriété msgVersionNb.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMsgVersionNb() {
        return msgVersionNb;
    }

    /**
     * Définit la valeur de la propriété msgVersionNb.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMsgVersionNb(Integer value) {
        this.msgVersionNb = value;
    }

    /**
     * Obtient la valeur de la propriété operationalPosId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalPosId() {
        return operationalPosId;
    }

    /**
     * Définit la valeur de la propriété operationalPosId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalPosId(String value) {
        this.operationalPosId = value;
    }

    /**
     * Obtient la valeur de la propriété structureEltId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureEltId() {
        return structureEltId;
    }

    /**
     * Définit la valeur de la propriété structureEltId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureEltId(String value) {
        this.structureEltId = value;
    }

    /**
     * Obtient la valeur de la propriété treatmentDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTreatmentDt() {
        return treatmentDt;
    }

    /**
     * Définit la valeur de la propriété treatmentDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTreatmentDt(XMLGregorianCalendar value) {
        this.treatmentDt = value;
    }

    /**
     * Obtient la valeur de la propriété userId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Définit la valeur de la propriété userId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
