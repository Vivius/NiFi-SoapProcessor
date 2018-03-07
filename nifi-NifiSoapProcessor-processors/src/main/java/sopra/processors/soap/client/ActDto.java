
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour actDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="actDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channelList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}channelDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commercialDocumentList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}documentDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detailByChannel" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}detailByChannelDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribActComrclDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribActComrclNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribActId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribActLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribAfterSaleTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOptionalFctngTransacTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribSaleTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibility" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}eligibilityDto" minOccurs="0"/>
 *         &lt;element name="familyList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}familyDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="needList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}needDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productFctng" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}productDto" minOccurs="0"/>
 *         &lt;element name="templateNature" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}tmplNatureDto" minOccurs="0"/>
 *         &lt;element name="templateNatureType" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}tmplNatureTypeDto" minOccurs="0"/>
 *         &lt;element name="transacCategory" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}transacCategoryDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actDto", propOrder = {
    "channelList",
    "commercialDocumentList",
    "detailByChannel",
    "distribActComrclDesc",
    "distribActComrclNm",
    "distribActId",
    "distribActLbl",
    "distribAfterSaleTyp",
    "distribOptionalFctngTransacTyp",
    "distribSaleTyp",
    "eligibility",
    "familyList",
    "needList",
    "productFctng",
    "templateNature",
    "templateNatureType",
    "transacCategory"
})
public class ActDto {

    @XmlElement(nillable = true)
    protected List<ChannelDto> channelList;
    @XmlElement(nillable = true)
    protected List<DocumentDto> commercialDocumentList;
    @XmlElement(nillable = true)
    protected List<DetailByChannelDto> detailByChannel;
    protected String distribActComrclDesc;
    protected String distribActComrclNm;
    protected String distribActId;
    protected String distribActLbl;
    protected String distribAfterSaleTyp;
    protected String distribOptionalFctngTransacTyp;
    protected String distribSaleTyp;
    protected EligibilityDto eligibility;
    @XmlElement(nillable = true)
    protected List<FamilyDto> familyList;
    @XmlElement(nillable = true)
    protected List<NeedDto> needList;
    protected ProductDto productFctng;
    protected TmplNatureDto templateNature;
    protected TmplNatureTypeDto templateNatureType;
    protected TransacCategoryDto transacCategory;

    /**
     * Gets the value of the channelList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelDto }
     * 
     * 
     */
    public List<ChannelDto> getChannelList() {
        if (channelList == null) {
            channelList = new ArrayList<ChannelDto>();
        }
        return this.channelList;
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
     * Gets the value of the detailByChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailByChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailByChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailByChannelDto }
     * 
     * 
     */
    public List<DetailByChannelDto> getDetailByChannel() {
        if (detailByChannel == null) {
            detailByChannel = new ArrayList<DetailByChannelDto>();
        }
        return this.detailByChannel;
    }

    /**
     * Obtient la valeur de la propriété distribActComrclDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribActComrclDesc() {
        return distribActComrclDesc;
    }

    /**
     * Définit la valeur de la propriété distribActComrclDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribActComrclDesc(String value) {
        this.distribActComrclDesc = value;
    }

    /**
     * Obtient la valeur de la propriété distribActComrclNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribActComrclNm() {
        return distribActComrclNm;
    }

    /**
     * Définit la valeur de la propriété distribActComrclNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribActComrclNm(String value) {
        this.distribActComrclNm = value;
    }

    /**
     * Obtient la valeur de la propriété distribActId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribActId() {
        return distribActId;
    }

    /**
     * Définit la valeur de la propriété distribActId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribActId(String value) {
        this.distribActId = value;
    }

    /**
     * Obtient la valeur de la propriété distribActLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribActLbl() {
        return distribActLbl;
    }

    /**
     * Définit la valeur de la propriété distribActLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribActLbl(String value) {
        this.distribActLbl = value;
    }

    /**
     * Obtient la valeur de la propriété distribAfterSaleTyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAfterSaleTyp() {
        return distribAfterSaleTyp;
    }

    /**
     * Définit la valeur de la propriété distribAfterSaleTyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAfterSaleTyp(String value) {
        this.distribAfterSaleTyp = value;
    }

    /**
     * Obtient la valeur de la propriété distribOptionalFctngTransacTyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOptionalFctngTransacTyp() {
        return distribOptionalFctngTransacTyp;
    }

    /**
     * Définit la valeur de la propriété distribOptionalFctngTransacTyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOptionalFctngTransacTyp(String value) {
        this.distribOptionalFctngTransacTyp = value;
    }

    /**
     * Obtient la valeur de la propriété distribSaleTyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribSaleTyp() {
        return distribSaleTyp;
    }

    /**
     * Définit la valeur de la propriété distribSaleTyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribSaleTyp(String value) {
        this.distribSaleTyp = value;
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
     * Obtient la valeur de la propriété productFctng.
     * 
     * @return
     *     possible object is
     *     {@link ProductDto }
     *     
     */
    public ProductDto getProductFctng() {
        return productFctng;
    }

    /**
     * Définit la valeur de la propriété productFctng.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDto }
     *     
     */
    public void setProductFctng(ProductDto value) {
        this.productFctng = value;
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
     * Obtient la valeur de la propriété transacCategory.
     * 
     * @return
     *     possible object is
     *     {@link TransacCategoryDto }
     *     
     */
    public TransacCategoryDto getTransacCategory() {
        return transacCategory;
    }

    /**
     * Définit la valeur de la propriété transacCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link TransacCategoryDto }
     *     
     */
    public void setTransacCategory(TransacCategoryDto value) {
        this.transacCategory = value;
    }

}
