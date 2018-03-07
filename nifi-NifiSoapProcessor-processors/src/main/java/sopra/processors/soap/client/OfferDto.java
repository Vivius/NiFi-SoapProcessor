
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour offerDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offerDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalProperties" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}additionalPropertyDto" minOccurs="0"/>
 *         &lt;element name="assemblyList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}assemblyContainedDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="choiceGroupList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}choiceGroupDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commercialDocumentList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}documentDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commercialOptionList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionContainedDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribOfferCmrclNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOfferCompositionTyp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distribOfferComrclDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOfferLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOfferOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOfferOwnerLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribPricingInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="eligibility" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}eligibilityDto" minOccurs="0"/>
 *         &lt;element name="familyList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}familyDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inseparableDistribProductInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="marketList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}marketDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="needList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}needDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offerRelationList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}offerRelationDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}productContainedDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="segmentList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}segmentDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerDto", propOrder = {
    "additionalProperties",
    "assemblyList",
    "choiceGroupList",
    "commercialDocumentList",
    "commercialOptionList",
    "distribOfferCmrclNm",
    "distribOfferCompositionTyp",
    "distribOfferComrclDesc",
    "distribOfferId",
    "distribOfferLbl",
    "distribOfferOwnerId",
    "distribOfferOwnerLbl",
    "distribPricingInd",
    "eligibility",
    "familyList",
    "inseparableDistribProductInd",
    "marketList",
    "needList",
    "offerRelationList",
    "productList",
    "segmentList"
})
public class OfferDto {

    protected AdditionalPropertyDto additionalProperties;
    @XmlElement(nillable = true)
    protected List<AssemblyContainedDto> assemblyList;
    @XmlElement(nillable = true)
    protected List<ChoiceGroupDto> choiceGroupList;
    @XmlElement(nillable = true)
    protected List<DocumentDto> commercialDocumentList;
    @XmlElement(nillable = true)
    protected List<OptionContainedDto> commercialOptionList;
    protected String distribOfferCmrclNm;
    protected Integer distribOfferCompositionTyp;
    protected String distribOfferComrclDesc;
    protected String distribOfferId;
    protected String distribOfferLbl;
    protected String distribOfferOwnerId;
    protected String distribOfferOwnerLbl;
    protected boolean distribPricingInd;
    protected EligibilityDto eligibility;
    @XmlElement(nillable = true)
    protected List<FamilyDto> familyList;
    protected boolean inseparableDistribProductInd;
    @XmlElement(nillable = true)
    protected List<MarketDto> marketList;
    @XmlElement(nillable = true)
    protected List<NeedDto> needList;
    @XmlElement(nillable = true)
    protected List<OfferRelationDto> offerRelationList;
    @XmlElement(nillable = true)
    protected List<ProductContainedDto> productList;
    @XmlElement(nillable = true)
    protected List<SegmentDto> segmentList;

    /**
     * Obtient la valeur de la propriété additionalProperties.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalPropertyDto }
     *     
     */
    public AdditionalPropertyDto getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Définit la valeur de la propriété additionalProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalPropertyDto }
     *     
     */
    public void setAdditionalProperties(AdditionalPropertyDto value) {
        this.additionalProperties = value;
    }

    /**
     * Gets the value of the assemblyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblyContainedDto }
     * 
     * 
     */
    public List<AssemblyContainedDto> getAssemblyList() {
        if (assemblyList == null) {
            assemblyList = new ArrayList<AssemblyContainedDto>();
        }
        return this.assemblyList;
    }

    /**
     * Gets the value of the choiceGroupList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choiceGroupList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoiceGroupList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChoiceGroupDto }
     * 
     * 
     */
    public List<ChoiceGroupDto> getChoiceGroupList() {
        if (choiceGroupList == null) {
            choiceGroupList = new ArrayList<ChoiceGroupDto>();
        }
        return this.choiceGroupList;
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
     * Gets the value of the commercialOptionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialOptionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialOptionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionContainedDto }
     * 
     * 
     */
    public List<OptionContainedDto> getCommercialOptionList() {
        if (commercialOptionList == null) {
            commercialOptionList = new ArrayList<OptionContainedDto>();
        }
        return this.commercialOptionList;
    }

    /**
     * Obtient la valeur de la propriété distribOfferCmrclNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOfferCmrclNm() {
        return distribOfferCmrclNm;
    }

    /**
     * Définit la valeur de la propriété distribOfferCmrclNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOfferCmrclNm(String value) {
        this.distribOfferCmrclNm = value;
    }

    /**
     * Obtient la valeur de la propriété distribOfferCompositionTyp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistribOfferCompositionTyp() {
        return distribOfferCompositionTyp;
    }

    /**
     * Définit la valeur de la propriété distribOfferCompositionTyp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistribOfferCompositionTyp(Integer value) {
        this.distribOfferCompositionTyp = value;
    }

    /**
     * Obtient la valeur de la propriété distribOfferComrclDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOfferComrclDesc() {
        return distribOfferComrclDesc;
    }

    /**
     * Définit la valeur de la propriété distribOfferComrclDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOfferComrclDesc(String value) {
        this.distribOfferComrclDesc = value;
    }

    /**
     * Obtient la valeur de la propriété distribOfferId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOfferId() {
        return distribOfferId;
    }

    /**
     * Définit la valeur de la propriété distribOfferId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOfferId(String value) {
        this.distribOfferId = value;
    }

    /**
     * Obtient la valeur de la propriété distribOfferLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOfferLbl() {
        return distribOfferLbl;
    }

    /**
     * Définit la valeur de la propriété distribOfferLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOfferLbl(String value) {
        this.distribOfferLbl = value;
    }

    /**
     * Obtient la valeur de la propriété distribOfferOwnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOfferOwnerId() {
        return distribOfferOwnerId;
    }

    /**
     * Définit la valeur de la propriété distribOfferOwnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOfferOwnerId(String value) {
        this.distribOfferOwnerId = value;
    }

    /**
     * Obtient la valeur de la propriété distribOfferOwnerLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOfferOwnerLbl() {
        return distribOfferOwnerLbl;
    }

    /**
     * Définit la valeur de la propriété distribOfferOwnerLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOfferOwnerLbl(String value) {
        this.distribOfferOwnerLbl = value;
    }

    /**
     * Obtient la valeur de la propriété distribPricingInd.
     * 
     */
    public boolean isDistribPricingInd() {
        return distribPricingInd;
    }

    /**
     * Définit la valeur de la propriété distribPricingInd.
     * 
     */
    public void setDistribPricingInd(boolean value) {
        this.distribPricingInd = value;
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
     * Gets the value of the familyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyDto }
     * 
     * 
     */
    public List<FamilyDto> getFamilyList() {
        if (familyList == null) {
            familyList = new ArrayList<FamilyDto>();
        }
        return this.familyList;
    }

    /**
     * Obtient la valeur de la propriété inseparableDistribProductInd.
     * 
     */
    public boolean isInseparableDistribProductInd() {
        return inseparableDistribProductInd;
    }

    /**
     * Définit la valeur de la propriété inseparableDistribProductInd.
     * 
     */
    public void setInseparableDistribProductInd(boolean value) {
        this.inseparableDistribProductInd = value;
    }

    /**
     * Gets the value of the marketList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketDto }
     * 
     * 
     */
    public List<MarketDto> getMarketList() {
        if (marketList == null) {
            marketList = new ArrayList<MarketDto>();
        }
        return this.marketList;
    }

    /**
     * Gets the value of the needList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the needList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeedList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeedDto }
     * 
     * 
     */
    public List<NeedDto> getNeedList() {
        if (needList == null) {
            needList = new ArrayList<NeedDto>();
        }
        return this.needList;
    }

    /**
     * Gets the value of the offerRelationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerRelationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferRelationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferRelationDto }
     * 
     * 
     */
    public List<OfferRelationDto> getOfferRelationList() {
        if (offerRelationList == null) {
            offerRelationList = new ArrayList<OfferRelationDto>();
        }
        return this.offerRelationList;
    }

    /**
     * Gets the value of the productList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductContainedDto }
     * 
     * 
     */
    public List<ProductContainedDto> getProductList() {
        if (productList == null) {
            productList = new ArrayList<ProductContainedDto>();
        }
        return this.productList;
    }

    /**
     * Gets the value of the segmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentDto }
     * 
     * 
     */
    public List<SegmentDto> getSegmentList() {
        if (segmentList == null) {
            segmentList = new ArrayList<SegmentDto>();
        }
        return this.segmentList;
    }

}
