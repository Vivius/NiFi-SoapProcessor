
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour currencyDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="currencyDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogCurNbDecimal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="curCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currencyDto", propOrder = {
    "catalogCurNbDecimal",
    "curCod",
    "curLbl"
})
public class CurrencyDto {

    protected Integer catalogCurNbDecimal;
    protected String curCod;
    protected String curLbl;

    /**
     * Obtient la valeur de la propriété catalogCurNbDecimal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatalogCurNbDecimal() {
        return catalogCurNbDecimal;
    }

    /**
     * Définit la valeur de la propriété catalogCurNbDecimal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatalogCurNbDecimal(Integer value) {
        this.catalogCurNbDecimal = value;
    }

    /**
     * Obtient la valeur de la propriété curCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCod() {
        return curCod;
    }

    /**
     * Définit la valeur de la propriété curCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCod(String value) {
        this.curCod = value;
    }

    /**
     * Obtient la valeur de la propriété curLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurLbl() {
        return curLbl;
    }

    /**
     * Définit la valeur de la propriété curLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurLbl(String value) {
        this.curLbl = value;
    }

}
