
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour functioningChoiceGroupDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="functioningChoiceGroupDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribFctngGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribFctngGrpLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribFctngGrpMndtryChoiceInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="eligibility" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}eligibilityDto" minOccurs="0"/>
 *         &lt;element name="functioningEltList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}functioningEltDto" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "functioningChoiceGroupDto", propOrder = {
    "distribFctngGrpId",
    "distribFctngGrpLbl",
    "distribFctngGrpMndtryChoiceInd",
    "eligibility",
    "functioningEltList",
    "maxDistribChoice",
    "minDistribChoice"
})
public class FunctioningChoiceGroupDto {

    protected String distribFctngGrpId;
    protected String distribFctngGrpLbl;
    protected boolean distribFctngGrpMndtryChoiceInd;
    protected EligibilityDto eligibility;
    @XmlElement(nillable = true)
    protected List<FunctioningEltDto> functioningEltList;
    protected Integer maxDistribChoice;
    protected Integer minDistribChoice;

    /**
     * Obtient la valeur de la propriété distribFctngGrpId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribFctngGrpId() {
        return distribFctngGrpId;
    }

    /**
     * Définit la valeur de la propriété distribFctngGrpId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribFctngGrpId(String value) {
        this.distribFctngGrpId = value;
    }

    /**
     * Obtient la valeur de la propriété distribFctngGrpLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribFctngGrpLbl() {
        return distribFctngGrpLbl;
    }

    /**
     * Définit la valeur de la propriété distribFctngGrpLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribFctngGrpLbl(String value) {
        this.distribFctngGrpLbl = value;
    }

    /**
     * Obtient la valeur de la propriété distribFctngGrpMndtryChoiceInd.
     * 
     */
    public boolean isDistribFctngGrpMndtryChoiceInd() {
        return distribFctngGrpMndtryChoiceInd;
    }

    /**
     * Définit la valeur de la propriété distribFctngGrpMndtryChoiceInd.
     * 
     */
    public void setDistribFctngGrpMndtryChoiceInd(boolean value) {
        this.distribFctngGrpMndtryChoiceInd = value;
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
