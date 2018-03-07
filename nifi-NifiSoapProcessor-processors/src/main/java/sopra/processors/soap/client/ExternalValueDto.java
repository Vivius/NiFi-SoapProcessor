
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour externalValueDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="externalValueDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogExternalDataRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dhId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "externalValueDto", propOrder = {
    "catalogExternalDataRef",
    "dhId"
})
public class ExternalValueDto {

    protected String catalogExternalDataRef;
    protected String dhId;

    /**
     * Obtient la valeur de la propriété catalogExternalDataRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogExternalDataRef() {
        return catalogExternalDataRef;
    }

    /**
     * Définit la valeur de la propriété catalogExternalDataRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogExternalDataRef(String value) {
        this.catalogExternalDataRef = value;
    }

    /**
     * Obtient la valeur de la propriété dhId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhId() {
        return dhId;
    }

    /**
     * Définit la valeur de la propriété dhId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhId(String value) {
        this.dhId = value;
    }

}
