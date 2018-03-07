
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour optionChoiceGroupDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="optionChoiceGroupDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogPresenceCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commercialOptionList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionContainedDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribOptionChcGrpComrclDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOptionChcGrpComrclNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOptionChcGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOptionChcGrpLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibility" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}eligibilityDto" minOccurs="0"/>
 *         &lt;element name="maxDistribChoice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minDistribChoice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optionChoiceGroupDto", propOrder = {
    "catalogPresenceCod",
    "commercialOptionList",
    "distribOptionChcGrpComrclDesc",
    "distribOptionChcGrpComrclNm",
    "distribOptionChcGrpId",
    "distribOptionChcGrpLbl",
    "eligibility",
    "maxDistribChoice",
    "minDistribChoice"
})
public class OptionChoiceGroupDto {

    protected String catalogPresenceCod;
    @XmlElement(nillable = true)
    protected List<OptionContainedDto> commercialOptionList;
    protected String distribOptionChcGrpComrclDesc;
    protected String distribOptionChcGrpComrclNm;
    protected String distribOptionChcGrpId;
    protected String distribOptionChcGrpLbl;
    protected EligibilityDto eligibility;
    protected Integer maxDistribChoice;
    protected Integer minDistribChoice;

    /**
     * Obtient la valeur de la propriété catalogPresenceCod.
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
     * Définit la valeur de la propriété catalogPresenceCod.
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
     * Obtient la valeur de la propriété distribOptionChcGrpComrclDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOptionChcGrpComrclDesc() {
        return distribOptionChcGrpComrclDesc;
    }

    /**
     * Définit la valeur de la propriété distribOptionChcGrpComrclDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOptionChcGrpComrclDesc(String value) {
        this.distribOptionChcGrpComrclDesc = value;
    }

    /**
     * Obtient la valeur de la propriété distribOptionChcGrpComrclNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOptionChcGrpComrclNm() {
        return distribOptionChcGrpComrclNm;
    }

    /**
     * Définit la valeur de la propriété distribOptionChcGrpComrclNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOptionChcGrpComrclNm(String value) {
        this.distribOptionChcGrpComrclNm = value;
    }

    /**
     * Obtient la valeur de la propriété distribOptionChcGrpId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOptionChcGrpId() {
        return distribOptionChcGrpId;
    }

    /**
     * Définit la valeur de la propriété distribOptionChcGrpId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOptionChcGrpId(String value) {
        this.distribOptionChcGrpId = value;
    }

    /**
     * Obtient la valeur de la propriété distribOptionChcGrpLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOptionChcGrpLbl() {
        return distribOptionChcGrpLbl;
    }

    /**
     * Définit la valeur de la propriété distribOptionChcGrpLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOptionChcGrpLbl(String value) {
        this.distribOptionChcGrpLbl = value;
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
     * Obtient la valeur de la propriété maxDistribChoice.
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
     * Définit la valeur de la propriété maxDistribChoice.
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
     * Obtient la valeur de la propriété minDistribChoice.
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
     * Définit la valeur de la propriété minDistribChoice.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDistribChoice(Integer value) {
        this.minDistribChoice = value;
    }

}
