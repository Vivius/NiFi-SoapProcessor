
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour eligibilityReasonDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="eligibilityReasonDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogEligibilityReasonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogEligibilityReasonLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligibilityReasonDto", propOrder = {
    "catalogEligibilityReasonId",
    "catalogEligibilityReasonLbl"
})
public class EligibilityReasonDto {

    protected String catalogEligibilityReasonId;
    protected String catalogEligibilityReasonLbl;

    /**
     * Obtient la valeur de la propriété catalogEligibilityReasonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogEligibilityReasonId() {
        return catalogEligibilityReasonId;
    }

    /**
     * Définit la valeur de la propriété catalogEligibilityReasonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogEligibilityReasonId(String value) {
        this.catalogEligibilityReasonId = value;
    }

    /**
     * Obtient la valeur de la propriété catalogEligibilityReasonLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogEligibilityReasonLbl() {
        return catalogEligibilityReasonLbl;
    }

    /**
     * Définit la valeur de la propriété catalogEligibilityReasonLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogEligibilityReasonLbl(String value) {
        this.catalogEligibilityReasonLbl = value;
    }

}
