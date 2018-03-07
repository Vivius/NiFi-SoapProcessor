
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour transacCategoryDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="transacCategoryDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribTransacCtgyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribTransacCtgyLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transacCategoryDto", propOrder = {
    "distribTransacCtgyId",
    "distribTransacCtgyLbl"
})
public class TransacCategoryDto {

    protected String distribTransacCtgyId;
    protected String distribTransacCtgyLbl;

    /**
     * Obtient la valeur de la propriété distribTransacCtgyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribTransacCtgyId() {
        return distribTransacCtgyId;
    }

    /**
     * Définit la valeur de la propriété distribTransacCtgyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribTransacCtgyId(String value) {
        this.distribTransacCtgyId = value;
    }

    /**
     * Obtient la valeur de la propriété distribTransacCtgyLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribTransacCtgyLbl() {
        return distribTransacCtgyLbl;
    }

    /**
     * Définit la valeur de la propriété distribTransacCtgyLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribTransacCtgyLbl(String value) {
        this.distribTransacCtgyLbl = value;
    }

}
