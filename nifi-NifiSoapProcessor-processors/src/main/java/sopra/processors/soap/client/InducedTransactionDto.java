
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour inducedTransactionDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="inducedTransactionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribTransacId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribTransacLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inducedTransactionDto", propOrder = {
    "distribTransacId",
    "distribTransacLbl"
})
public class InducedTransactionDto {

    protected String distribTransacId;
    protected String distribTransacLbl;

    /**
     * Obtient la valeur de la propriété distribTransacId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribTransacId() {
        return distribTransacId;
    }

    /**
     * Définit la valeur de la propriété distribTransacId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribTransacId(String value) {
        this.distribTransacId = value;
    }

    /**
     * Obtient la valeur de la propriété distribTransacLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribTransacLbl() {
        return distribTransacLbl;
    }

    /**
     * Définit la valeur de la propriété distribTransacLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribTransacLbl(String value) {
        this.distribTransacLbl = value;
    }

}
