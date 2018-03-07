
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour choiceGroupDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="choiceGroupDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogPresenceCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commercialOptionList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionContainedDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribChoiceGrpComrclDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribChoiceGrpComrclNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribChoiceGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribChoiceGrpLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibility" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}eligibilityDto" minOccurs="0"/>
 *         &lt;element name="maxDistribChoice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minDistribChoice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}productContainedDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choiceGroupDto", propOrder = {
    "catalogPresenceCod",
    "commercialOptionList",
    "distribChoiceGrpComrclDesc",
    "distribChoiceGrpComrclNm",
    "distribChoiceGrpId",
    "distribChoiceGrpLbl",
    "eligibility",
    "maxDistribChoice",
    "minDistribChoice",
    "productList"
})
public class ChoiceGroupDto {

    protected String catalogPresenceCod;
    @XmlElement(nillable = true)
    protected List<OptionContainedDto> commercialOptionList;
    protected String distribChoiceGrpComrclDesc;
    protected String distribChoiceGrpComrclNm;
    protected String distribChoiceGrpId;
    protected String distribChoiceGrpLbl;
    protected EligibilityDto eligibility;
    protected Integer maxDistribChoice;
    protected Integer minDistribChoice;
    @XmlElement(nillable = true)
    protected List<ProductContainedDto> productList;

    /**
     * Obtient la valeur de la propri�t� catalogPresenceCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogPresenceCod() {
        return catalogPresenceCod;
    }

    /**
     * D�finit la valeur de la propri�t� catalogPresenceCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogPresenceCod(String value) {
        this.catalogPresenceCod = value;
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
     * Obtient la valeur de la propri�t� distribChoiceGrpComrclDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribChoiceGrpComrclDesc() {
        return distribChoiceGrpComrclDesc;
    }

    /**
     * D�finit la valeur de la propri�t� distribChoiceGrpComrclDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribChoiceGrpComrclDesc(String value) {
        this.distribChoiceGrpComrclDesc = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribChoiceGrpComrclNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribChoiceGrpComrclNm() {
        return distribChoiceGrpComrclNm;
    }

    /**
     * D�finit la valeur de la propri�t� distribChoiceGrpComrclNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribChoiceGrpComrclNm(String value) {
        this.distribChoiceGrpComrclNm = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribChoiceGrpId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribChoiceGrpId() {
        return distribChoiceGrpId;
    }

    /**
     * D�finit la valeur de la propri�t� distribChoiceGrpId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribChoiceGrpId(String value) {
        this.distribChoiceGrpId = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribChoiceGrpLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribChoiceGrpLbl() {
        return distribChoiceGrpLbl;
    }

    /**
     * D�finit la valeur de la propri�t� distribChoiceGrpLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribChoiceGrpLbl(String value) {
        this.distribChoiceGrpLbl = value;
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
     * Obtient la valeur de la propri�t� maxDistribChoice.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDistribChoice() {
        return maxDistribChoice;
    }

    /**
     * D�finit la valeur de la propri�t� maxDistribChoice.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDistribChoice(Integer value) {
        this.maxDistribChoice = value;
    }

    /**
     * Obtient la valeur de la propri�t� minDistribChoice.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinDistribChoice() {
        return minDistribChoice;
    }

    /**
     * D�finit la valeur de la propri�t� minDistribChoice.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDistribChoice(Integer value) {
        this.minDistribChoice = value;
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

}
