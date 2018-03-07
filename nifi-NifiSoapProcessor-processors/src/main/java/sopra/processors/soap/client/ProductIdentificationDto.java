
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productIdentificationDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productIdentificationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productIdentificationDto", propOrder = {
    "distribProductId",
    "distribProductOwnerId"
})
public class ProductIdentificationDto {

    protected String distribProductId;
    protected String distribProductOwnerId;

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

}
