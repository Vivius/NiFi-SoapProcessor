
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour distributorDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="distributorDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distributorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributorLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distributorDto", propOrder = {
    "distributorId",
    "distributorLbl"
})
public class DistributorDto {

    protected String distributorId;
    protected String distributorLbl;

    /**
     * Obtient la valeur de la propriété distributorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributorId() {
        return distributorId;
    }

    /**
     * Définit la valeur de la propriété distributorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributorId(String value) {
        this.distributorId = value;
    }

    /**
     * Obtient la valeur de la propriété distributorLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributorLbl() {
        return distributorLbl;
    }

    /**
     * Définit la valeur de la propriété distributorLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributorLbl(String value) {
        this.distributorLbl = value;
    }

}
