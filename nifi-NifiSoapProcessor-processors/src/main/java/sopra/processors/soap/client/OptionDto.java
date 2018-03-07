
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour optionDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="optionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="afterSaleActList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="characteristicElt" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}characteristicDto" minOccurs="0"/>
 *         &lt;element name="characteristicGrp" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}groupOfCharDto" minOccurs="0"/>
 *         &lt;element name="commercialDocumentList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}documentDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribOptionComrclDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOptionComrclNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOptionLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductOwnerLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibility" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}eligibilityDto" minOccurs="0"/>
 *         &lt;element name="saleActList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optionDto", propOrder = {
    "afterSaleActList",
    "characteristicElt",
    "characteristicGrp",
    "commercialDocumentList",
    "distribOptionComrclDescr",
    "distribOptionComrclNm",
    "distribOptionId",
    "distribOptionLbl",
    "distribProductId",
    "distribProductOwnerId",
    "distribProductOwnerLbl",
    "eligibility",
    "saleActList"
})
public class OptionDto {

    @XmlElement(nillable = true)
    protected List<ActDto> afterSaleActList;
    protected CharacteristicDto characteristicElt;
    protected GroupOfCharDto characteristicGrp;
    @XmlElement(nillable = true)
    protected List<DocumentDto> commercialDocumentList;
    protected String distribOptionComrclDescr;
    protected String distribOptionComrclNm;
    protected String distribOptionId;
    protected String distribOptionLbl;
    protected String distribProductId;
    protected String distribProductOwnerId;
    protected String distribProductOwnerLbl;
    protected EligibilityDto eligibility;
    @XmlElement(nillable = true)
    protected List<ActDto> saleActList;

    /**
     * Gets the value of the afterSaleActList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the afterSaleActList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAfterSaleActList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActDto }
     * 
     * 
     */
    public List<ActDto> getAfterSaleActList() {
        if (afterSaleActList == null) {
            afterSaleActList = new ArrayList<ActDto>();
        }
        return this.afterSaleActList;
    }

    /**
     * Obtient la valeur de la propriété characteristicElt.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicDto }
     *     
     */
    public CharacteristicDto getCharacteristicElt() {
        return characteristicElt;
    }

    /**
     * Définit la valeur de la propriété characteristicElt.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicDto }
     *     
     */
    public void setCharacteristicElt(CharacteristicDto value) {
        this.characteristicElt = value;
    }

    /**
     * Obtient la valeur de la propriété characteristicGrp.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfCharDto }
     *     
     */
    public GroupOfCharDto getCharacteristicGrp() {
        return characteristicGrp;
    }

    /**
     * Définit la valeur de la propriété characteristicGrp.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfCharDto }
     *     
     */
    public void setCharacteristicGrp(GroupOfCharDto value) {
        this.characteristicGrp = value;
    }

    /**
     * Gets the value of the commercialDocumentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialDocumentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialDocumentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentDto }
     * 
     * 
     */
    public List<DocumentDto> getCommercialDocumentList() {
        if (commercialDocumentList == null) {
            commercialDocumentList = new ArrayList<DocumentDto>();
        }
        return this.commercialDocumentList;
    }

    /**
     * Obtient la valeur de la propriété distribOptionComrclDescr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOptionComrclDescr() {
        return distribOptionComrclDescr;
    }

    /**
     * Définit la valeur de la propriété distribOptionComrclDescr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOptionComrclDescr(String value) {
        this.distribOptionComrclDescr = value;
    }

    /**
     * Obtient la valeur de la propriété distribOptionComrclNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOptionComrclNm() {
        return distribOptionComrclNm;
    }

    /**
     * Définit la valeur de la propriété distribOptionComrclNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOptionComrclNm(String value) {
        this.distribOptionComrclNm = value;
    }

    /**
     * Obtient la valeur de la propriété distribOptionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOptionId() {
        return distribOptionId;
    }

    /**
     * Définit la valeur de la propriété distribOptionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOptionId(String value) {
        this.distribOptionId = value;
    }

    /**
     * Obtient la valeur de la propriété distribOptionLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOptionLbl() {
        return distribOptionLbl;
    }

    /**
     * Définit la valeur de la propriété distribOptionLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOptionLbl(String value) {
        this.distribOptionLbl = value;
    }

    /**
     * Obtient la valeur de la propriété distribProductId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribProductId() {
        return distribProductId;
    }

    /**
     * Définit la valeur de la propriété distribProductId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribProductId(String value) {
        this.distribProductId = value;
    }

    /**
     * Obtient la valeur de la propriété distribProductOwnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribProductOwnerId() {
        return distribProductOwnerId;
    }

    /**
     * Définit la valeur de la propriété distribProductOwnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribProductOwnerId(String value) {
        this.distribProductOwnerId = value;
    }

    /**
     * Obtient la valeur de la propriété distribProductOwnerLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribProductOwnerLbl() {
        return distribProductOwnerLbl;
    }

    /**
     * Définit la valeur de la propriété distribProductOwnerLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribProductOwnerLbl(String value) {
        this.distribProductOwnerLbl = value;
    }

    /**
     * Obtient la valeur de la propriété eligibility.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityDto }
     *     
     */
    public EligibilityDto getEligibility() {
        return eligibility;
    }

    /**
     * Définit la valeur de la propriété eligibility.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityDto }
     *     
     */
    public void setEligibility(EligibilityDto value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the saleActList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleActList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleActList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActDto }
     * 
     * 
     */
    public List<ActDto> getSaleActList() {
        if (saleActList == null) {
            saleActList = new ArrayList<ActDto>();
        }
        return this.saleActList;
    }

}
