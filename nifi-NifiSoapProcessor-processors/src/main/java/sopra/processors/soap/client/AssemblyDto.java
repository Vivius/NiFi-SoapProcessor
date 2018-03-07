
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour assemblyDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="assemblyDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalProperties" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}additionalPropertyDto" minOccurs="0"/>
 *         &lt;element name="afterSaleActList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assemblyRelationList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}assemblyRelationDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="choiceGroupList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}choiceGroupDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commercialDocumentList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}documentDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commercialOptionList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionContainedDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribAssemblyComrclDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribAssemblyComrclNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribAssemblyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribAssemblyLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribAssemblyOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribAssemblyOwnerLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibility" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}eligibilityDto" minOccurs="0"/>
 *         &lt;element name="familyList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}familyDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="familyRelationList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}familyRelationDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="functioningEltList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}functioningEltDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inseparableDistribProductInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="marketList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}marketDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}productContainedDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productRelationList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}productRelationDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="saleActList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="templateNature" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}tmplNatureDto" minOccurs="0"/>
 *         &lt;element name="templateNatureType" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}tmplNatureTypeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assemblyDto", propOrder = {
    "additionalProperties",
    "afterSaleActList",
    "assemblyRelationList",
    "choiceGroupList",
    "commercialDocumentList",
    "commercialOptionList",
    "distribAssemblyComrclDesc",
    "distribAssemblyComrclNm",
    "distribAssemblyId",
    "distribAssemblyLbl",
    "distribAssemblyOwnerId",
    "distribAssemblyOwnerLbl",
    "eligibility",
    "familyList",
    "familyRelationList",
    "functioningEltList",
    "inseparableDistribProductInd",
    "marketList",
    "productList",
    "productRelationList",
    "saleActList",
    "templateNature",
    "templateNatureType"
})
public class AssemblyDto {

    protected AdditionalPropertyDto additionalProperties;
    @XmlElement(nillable = true)
    protected List<ActDto> afterSaleActList;
    @XmlElement(nillable = true)
    protected List<AssemblyRelationDto> assemblyRelationList;
    @XmlElement(nillable = true)
    protected List<ChoiceGroupDto> choiceGroupList;
    @XmlElement(nillable = true)
    protected List<DocumentDto> commercialDocumentList;
    @XmlElement(nillable = true)
    protected List<OptionContainedDto> commercialOptionList;
    protected String distribAssemblyComrclDesc;
    protected String distribAssemblyComrclNm;
    protected String distribAssemblyId;
    protected String distribAssemblyLbl;
    protected String distribAssemblyOwnerId;
    protected String distribAssemblyOwnerLbl;
    protected EligibilityDto eligibility;
    @XmlElement(nillable = true)
    protected List<FamilyDto> familyList;
    @XmlElement(nillable = true)
    protected List<FamilyRelationDto> familyRelationList;
    @XmlElement(nillable = true)
    protected List<FunctioningEltDto> functioningEltList;
    protected boolean inseparableDistribProductInd;
    @XmlElement(nillable = true)
    protected List<MarketDto> marketList;
    @XmlElement(nillable = true)
    protected List<ProductContainedDto> productList;
    @XmlElement(nillable = true)
    protected List<ProductRelationDto> productRelationList;
    @XmlElement(nillable = true)
    protected List<ActDto> saleActList;
    protected TmplNatureDto templateNature;
    protected TmplNatureTypeDto templateNatureType;

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
     * Gets the value of the assemblyRelationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyRelationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyRelationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblyRelationDto }
     * 
     * 
     */
    public List<AssemblyRelationDto> getAssemblyRelationList() {
        if (assemblyRelationList == null) {
            assemblyRelationList = new ArrayList<AssemblyRelationDto>();
        }
        return this.assemblyRelationList;
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
     * Obtient la valeur de la propriété distribAssemblyComrclDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAssemblyComrclDesc() {
        return distribAssemblyComrclDesc;
    }

    /**
     * Définit la valeur de la propriété distribAssemblyComrclDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAssemblyComrclDesc(String value) {
        this.distribAssemblyComrclDesc = value;
    }

    /**
     * Obtient la valeur de la propriété distribAssemblyComrclNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAssemblyComrclNm() {
        return distribAssemblyComrclNm;
    }

    /**
     * Définit la valeur de la propriété distribAssemblyComrclNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAssemblyComrclNm(String value) {
        this.distribAssemblyComrclNm = value;
    }

    /**
     * Obtient la valeur de la propriété distribAssemblyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAssemblyId() {
        return distribAssemblyId;
    }

    /**
     * Définit la valeur de la propriété distribAssemblyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAssemblyId(String value) {
        this.distribAssemblyId = value;
    }

    /**
     * Obtient la valeur de la propriété distribAssemblyLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAssemblyLbl() {
        return distribAssemblyLbl;
    }

    /**
     * Définit la valeur de la propriété distribAssemblyLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAssemblyLbl(String value) {
        this.distribAssemblyLbl = value;
    }

    /**
     * Obtient la valeur de la propriété distribAssemblyOwnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAssemblyOwnerId() {
        return distribAssemblyOwnerId;
    }

    /**
     * Définit la valeur de la propriété distribAssemblyOwnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAssemblyOwnerId(String value) {
        this.distribAssemblyOwnerId = value;
    }

    /**
     * Obtient la valeur de la propriété distribAssemblyOwnerLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAssemblyOwnerLbl() {
        return distribAssemblyOwnerLbl;
    }

    /**
     * Définit la valeur de la propriété distribAssemblyOwnerLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAssemblyOwnerLbl(String value) {
        this.distribAssemblyOwnerLbl = value;
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
     * Gets the value of the familyRelationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyRelationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyRelationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyRelationDto }
     * 
     * 
     */
    public List<FamilyRelationDto> getFamilyRelationList() {
        if (familyRelationList == null) {
            familyRelationList = new ArrayList<FamilyRelationDto>();
        }
        return this.familyRelationList;
    }

    /**
     * Gets the value of the functioningEltList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functioningEltList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctioningEltList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctioningEltDto }
     * 
     * 
     */
    public List<FunctioningEltDto> getFunctioningEltList() {
        if (functioningEltList == null) {
            functioningEltList = new ArrayList<FunctioningEltDto>();
        }
        return this.functioningEltList;
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
     * Gets the value of the productRelationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productRelationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductRelationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductRelationDto }
     * 
     * 
     */
    public List<ProductRelationDto> getProductRelationList() {
        if (productRelationList == null) {
            productRelationList = new ArrayList<ProductRelationDto>();
        }
        return this.productRelationList;
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

    /**
     * Obtient la valeur de la propriété templateNature.
     * 
     * @return
     *     possible object is
     *     {@link TmplNatureDto }
     *     
     */
    public TmplNatureDto getTemplateNature() {
        return templateNature;
    }

    /**
     * Définit la valeur de la propriété templateNature.
     * 
     * @param value
     *     allowed object is
     *     {@link TmplNatureDto }
     *     
     */
    public void setTemplateNature(TmplNatureDto value) {
        this.templateNature = value;
    }

    /**
     * Obtient la valeur de la propriété templateNatureType.
     * 
     * @return
     *     possible object is
     *     {@link TmplNatureTypeDto }
     *     
     */
    public TmplNatureTypeDto getTemplateNatureType() {
        return templateNatureType;
    }

    /**
     * Définit la valeur de la propriété templateNatureType.
     * 
     * @param value
     *     allowed object is
     *     {@link TmplNatureTypeDto }
     *     
     */
    public void setTemplateNatureType(TmplNatureTypeDto value) {
        this.templateNatureType = value;
    }

}
