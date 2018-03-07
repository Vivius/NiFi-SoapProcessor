
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour familyUseDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="familyUseDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribFamilyUseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribFamilyUseLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "familyUseDto", propOrder = {
    "distribFamilyUseId",
    "distribFamilyUseLbl"
})
public class FamilyUseDto {

    protected String distribFamilyUseId;
    protected String distribFamilyUseLbl;

    /**
     * Obtient la valeur de la propriété distribFamilyUseId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribFamilyUseId() {
        return distribFamilyUseId;
    }

    /**
     * Définit la valeur de la propriété distribFamilyUseId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribFamilyUseId(String value) {
        this.distribFamilyUseId = value;
    }

    /**
     * Obtient la valeur de la propriété distribFamilyUseLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribFamilyUseLbl() {
        return distribFamilyUseLbl;
    }

    /**
     * Définit la valeur de la propriété distribFamilyUseLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribFamilyUseLbl(String value) {
        this.distribFamilyUseLbl = value;
    }

}
