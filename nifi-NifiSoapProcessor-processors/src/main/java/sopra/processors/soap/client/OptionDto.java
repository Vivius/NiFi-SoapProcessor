
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
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� characteristicElt.
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
     * D�finit la valeur de la propri�t� characteristicElt.
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
     * Obtient la valeur de la propri�t� characteristicGrp.
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
     * D�finit la valeur de la propri�t� characteristicGrp.
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
     * Obtient la valeur de la propri�t� distribOptionComrclDescr.
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
     * D�finit la valeur de la propri�t� distribOptionComrclDescr.
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
     * Obtient la valeur de la propri�t� distribOptionComrclNm.
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
     * D�finit la valeur de la propri�t� distribOptionComrclNm.
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
     * Obtient la valeur de la propri�t� distribOptionId.
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
     * D�finit la valeur de la propri�t� distribOptionId.
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
     * Obtient la valeur de la propri�t� distribOptionLbl.
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
     * D�finit la valeur de la propri�t� distribOptionLbl.
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
     * Obtient la valeur de la propri�t� distribProductId.
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
     * D�finit la valeur de la propri�t� distribProductId.
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
     * Obtient la valeur de la propri�t� distribProductOwnerId.
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
     * D�finit la valeur de la propri�t� distribProductOwnerId.
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
     * Obtient la valeur de la propri�t� distribProductOwnerLbl.
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
     * D�finit la valeur de la propri�t� distribProductOwnerLbl.
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
     * Obtient la valeur de la propri�t� eligibility.
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
     * D�finit la valeur de la propri�t� eligibility.
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
