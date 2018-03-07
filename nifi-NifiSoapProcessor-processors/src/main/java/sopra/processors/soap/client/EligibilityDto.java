
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour eligibilityDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="eligibilityDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibilityReasonList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}eligibilityReasonDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligibilityDto", propOrder = {
    "distribEligibility",
    "eligibilityReasonList"
})
public class EligibilityDto {

    protected String distribEligibility;
    @XmlElement(nillable = true)
    protected List<EligibilityReasonDto> eligibilityReasonList;

    /**
     * Obtient la valeur de la propriété distribEligibility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribEligibility() {
        return distribEligibility;
    }

    /**
     * Définit la valeur de la propriété distribEligibility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribEligibility(String value) {
        this.distribEligibility = value;
    }

    /**
     * Gets the value of the eligibilityReasonList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibilityReasonList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibilityReasonList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EligibilityReasonDto }
     * 
     * 
     */
    public List<EligibilityReasonDto> getEligibilityReasonList() {
        if (eligibilityReasonList == null) {
            eligibilityReasonList = new ArrayList<EligibilityReasonDto>();
        }
        return this.eligibilityReasonList;
    }

}
