
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour tmplNatureTypeDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tmplNatureTypeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogTmplNatTypId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogTmplNatTypLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tmplNatureTypeDto", propOrder = {
    "catalogTmplNatTypId",
    "catalogTmplNatTypLbl"
})
public class TmplNatureTypeDto {

    protected String catalogTmplNatTypId;
    protected String catalogTmplNatTypLbl;

    /**
     * Obtient la valeur de la propriété catalogTmplNatTypId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogTmplNatTypId() {
        return catalogTmplNatTypId;
    }

    /**
     * Définit la valeur de la propriété catalogTmplNatTypId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogTmplNatTypId(String value) {
        this.catalogTmplNatTypId = value;
    }

    /**
     * Obtient la valeur de la propriété catalogTmplNatTypLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogTmplNatTypLbl() {
        return catalogTmplNatTypLbl;
    }

    /**
     * Définit la valeur de la propriété catalogTmplNatTypLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogTmplNatTypLbl(String value) {
        this.catalogTmplNatTypLbl = value;
    }

}
