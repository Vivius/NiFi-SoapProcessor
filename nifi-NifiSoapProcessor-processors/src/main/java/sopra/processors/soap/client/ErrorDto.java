
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour errorDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="errorDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorSeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorSubTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorDto", propOrder = {
    "errorCod",
    "errorLbl",
    "errorSeverity",
    "errorSource",
    "errorSubTyp",
    "errorTyp"
})
public class ErrorDto {

    protected String errorCod;
    protected String errorLbl;
    protected String errorSeverity;
    protected String errorSource;
    protected String errorSubTyp;
    protected String errorTyp;

    /**
     * Obtient la valeur de la propriété errorCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCod() {
        return errorCod;
    }

    /**
     * Définit la valeur de la propriété errorCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCod(String value) {
        this.errorCod = value;
    }

    /**
     * Obtient la valeur de la propriété errorLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLbl() {
        return errorLbl;
    }

    /**
     * Définit la valeur de la propriété errorLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLbl(String value) {
        this.errorLbl = value;
    }

    /**
     * Obtient la valeur de la propriété errorSeverity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSeverity() {
        return errorSeverity;
    }

    /**
     * Définit la valeur de la propriété errorSeverity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSeverity(String value) {
        this.errorSeverity = value;
    }

    /**
     * Obtient la valeur de la propriété errorSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSource() {
        return errorSource;
    }

    /**
     * Définit la valeur de la propriété errorSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSource(String value) {
        this.errorSource = value;
    }

    /**
     * Obtient la valeur de la propriété errorSubTyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSubTyp() {
        return errorSubTyp;
    }

    /**
     * Définit la valeur de la propriété errorSubTyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSubTyp(String value) {
        this.errorSubTyp = value;
    }

    /**
     * Obtient la valeur de la propriété errorTyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorTyp() {
        return errorTyp;
    }

    /**
     * Définit la valeur de la propriété errorTyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorTyp(String value) {
        this.errorTyp = value;
    }

}
