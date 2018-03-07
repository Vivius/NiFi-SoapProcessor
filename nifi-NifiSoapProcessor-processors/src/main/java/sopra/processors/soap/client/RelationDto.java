
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour relationDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="relationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribEltRelationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribEltRelationLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationDto", propOrder = {
    "distribEltRelationId",
    "distribEltRelationLbl"
})
public class RelationDto {

    protected String distribEltRelationId;
    protected String distribEltRelationLbl;

    /**
     * Obtient la valeur de la propri�t� distribEltRelationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribEltRelationId() {
        return distribEltRelationId;
    }

    /**
     * D�finit la valeur de la propri�t� distribEltRelationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribEltRelationId(String value) {
        this.distribEltRelationId = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribEltRelationLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribEltRelationLbl() {
        return distribEltRelationLbl;
    }

    /**
     * D�finit la valeur de la propri�t� distribEltRelationLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribEltRelationLbl(String value) {
        this.distribEltRelationLbl = value;
    }

}
