
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour producerDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="producerDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogProducerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogProducerLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producerDto", propOrder = {
    "catalogProducerId",
    "catalogProducerLbl"
})
public class ProducerDto {

    protected String catalogProducerId;
    protected String catalogProducerLbl;

    /**
     * Obtient la valeur de la propriété catalogProducerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogProducerId() {
        return catalogProducerId;
    }

    /**
     * Définit la valeur de la propriété catalogProducerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogProducerId(String value) {
        this.catalogProducerId = value;
    }

    /**
     * Obtient la valeur de la propriété catalogProducerLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogProducerLbl() {
        return catalogProducerLbl;
    }

    /**
     * Définit la valeur de la propriété catalogProducerLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogProducerLbl(String value) {
        this.catalogProducerLbl = value;
    }

}
