
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalProperties" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}additionalPropertyDto" minOccurs="0"/>
 *         &lt;element name="afterSaleActList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assemblyRelationList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}assemblyRelationDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="catalogRefProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogRefProductLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commercialDocumentList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}documentDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commercialOptionChoiceGroupeList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionChoiceGroupDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commercialOptionList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionContainedDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribProductComrclDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductComrclNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductOwnerLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibility" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}eligibilityDto" minOccurs="0"/>
 *         &lt;element name="familyList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}familyDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="familyRelationList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}familyRelationDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="functioningChoiceGroupList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}functioningChoiceGroupDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="functioningEltList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}functioningEltDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inducedTransactionList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}inducedTransactionDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="marketList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}marketDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="producer" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}producerDto" minOccurs="0"/>
 *         &lt;element name="productRelationList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}productRelationDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referenceProductRelationList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}referenceProductRelationDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="saleActList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="templateNature" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}tmplNatureDto" minOccurs="0"/>
 *         &lt;element name="templateNatureType" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}tmplNatureTypeDto" minOccurs="0"/>
 *         &lt;element name="usageTransactionList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}usageTransactionDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productDto", propOrder = {
    "additionalProperties",
    "afterSaleActList",
    "appCod",
    "assemblyRelationList",
    "catalogRefProductId",
    "catalogRefProductLbl",
    "commercialDocumentList",
    "commercialOptionChoiceGroupeList",
    "commercialOptionList",
    "distribProductComrclDesc",
    "distribProductComrclNm",
    "distribProductId",
    "distribProductLbl",
    "distribProductOwnerId",
    "distribProductOwnerLbl",
    "eligibility",
    "familyList",
    "familyRelationList",
    "functioningChoiceGroupList",
    "functioningEltList",
    "inducedTransactionList",
    "marketList",
    "producer",
    "productRelationList",
    "referenceProductRelationList",
    "saleActList",
    "templateNature",
    "templateNatureType",
    "usageTransactionList"
})
public class ProductDto {

    protected AdditionalPropertyDto additionalProperties;
    @XmlElement(nillable = true)
    protected List<ActDto> afterSaleActList;
    protected String appCod;
    @XmlElement(nillable = true)
    protected List<AssemblyRelationDto> assemblyRelationList;
    protected String catalogRefProductId;
    protected String catalogRefProductLbl;
    @XmlElement(nillable = true)
    protected List<DocumentDto> commercialDocumentList;
    @XmlElement(nillable = true)
    protected List<OptionChoiceGroupDto> commercialOptionChoiceGroupeList;
    @XmlElement(nillable = true)
    protected List<OptionContainedDto> commercialOptionList;
    protected String distribProductComrclDesc;
    protected String distribProductComrclNm;
    protected String distribProductId;
    protected String distribProductLbl;
    protected String distribProductOwnerId;
    protected String distribProductOwnerLbl;
    protected EligibilityDto eligibility;
    @XmlElement(nillable = true)
    protected List<FamilyDto> familyList;
    @XmlElement(nillable = true)
    protected List<FamilyRelationDto> familyRelationList;
    @XmlElement(nillable = true)
    protected List<FunctioningChoiceGroupDto> functioningChoiceGroupList;
    @XmlElement(nillable = true)
    protected List<FunctioningEltDto> functioningEltList;
    @XmlElement(nillable = true)
    protected List<InducedTransactionDto> inducedTransactionList;
    @XmlElement(nillable = true)
    protected List<MarketDto> marketList;
    protected ProducerDto producer;
    @XmlElement(nillable = true)
    protected List<ProductRelationDto> productRelationList;
    @XmlElement(nillable = true)
    protected List<ReferenceProductRelationDto> referenceProductRelationList;
    @XmlElement(nillable = true)
    protected List<ActDto> saleActList;
    protected TmplNatureDto templateNature;
    protected TmplNatureTypeDto templateNatureType;
    @XmlElement(nillable = true)
    protected List<UsageTransactionDto> usageTransactionList;

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
     * Obtient la valeur de la propriété catalogRefProductId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogRefProductId() {
        return catalogRefProductId;
    }

    /**
     * Définit la valeur de la propriété catalogRefProductId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogRefProductId(String value) {
        this.catalogRefProductId = value;
    }

    /**
     * Obtient la valeur de la propriété catalogRefProductLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogRefProductLbl() {
        return catalogRefProductLbl;
    }

    /**
     * Définit la valeur de la propriété catalogRefProductLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogRefProductLbl(String value) {
        this.catalogRefProductLbl = value;
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
     * Gets the value of the commercialOptionChoiceGroupeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialOptionChoiceGroupeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialOptionChoiceGroupeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionChoiceGroupDto }
     * 
     * 
     */
    public List<OptionChoiceGroupDto> getCommercialOptionChoiceGroupeList() {
        if (commercialOptionChoiceGroupeList == null) {
            commercialOptionChoiceGroupeList = new ArrayList<OptionChoiceGroupDto>();
        }
        return this.commercialOptionChoiceGroupeList;
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
     * Obtient la valeur de la propriété distribProductComrclDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribProductComrclDesc() {
        return distribProductComrclDesc;
    }

    /**
     * Définit la valeur de la propriété distribProductComrclDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribProductComrclDesc(String value) {
        this.distribProductComrclDesc = value;
    }

    /**
     * Obtient la valeur de la propriété distribProductComrclNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribProductComrclNm() {
        return distribProductComrclNm;
    }

    /**
     * Définit la valeur de la propriété distribProductComrclNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribProductComrclNm(String value) {
        this.distribProductComrclNm = value;
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
     * Obtient la valeur de la propriété distribProductLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribProductLbl() {
        return distribProductLbl;
    }

    /**
     * Définit la valeur de la propriété distribProductLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribProductLbl(String value) {
        this.distribProductLbl = value;
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
     * Gets the value of the functioningChoiceGroupList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functioningChoiceGroupList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctioningChoiceGroupList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctioningChoiceGroupDto }
     * 
     * 
     */
    public List<FunctioningChoiceGroupDto> getFunctioningChoiceGroupList() {
        if (functioningChoiceGroupList == null) {
            functioningChoiceGroupList = new ArrayList<FunctioningChoiceGroupDto>();
        }
        return this.functioningChoiceGroupList;
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
     * Gets the value of the inducedTransactionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inducedTransactionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInducedTransactionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InducedTransactionDto }
     * 
     * 
     */
    public List<InducedTransactionDto> getInducedTransactionList() {
        if (inducedTransactionList == null) {
            inducedTransactionList = new ArrayList<InducedTransactionDto>();
        }
        return this.inducedTransactionList;
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
     * Obtient la valeur de la propriété producer.
     * 
     * @return
     *     possible object is
     *     {@link ProducerDto }
     *     
     */
    public ProducerDto getProducer() {
        return producer;
    }

    /**
     * Définit la valeur de la propriété producer.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerDto }
     *     
     */
    public void setProducer(ProducerDto value) {
        this.producer = value;
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
     * Gets the value of the referenceProductRelationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceProductRelationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceProductRelationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceProductRelationDto }
     * 
     * 
     */
    public List<ReferenceProductRelationDto> getReferenceProductRelationList() {
        if (referenceProductRelationList == null) {
            referenceProductRelationList = new ArrayList<ReferenceProductRelationDto>();
        }
        return this.referenceProductRelationList;
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

    /**
     * Gets the value of the usageTransactionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageTransactionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageTransactionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageTransactionDto }
     * 
     * 
     */
    public List<UsageTransactionDto> getUsageTransactionList() {
        if (usageTransactionList == null) {
            usageTransactionList = new ArrayList<UsageTransactionDto>();
        }
        return this.usageTransactionList;
    }

}
