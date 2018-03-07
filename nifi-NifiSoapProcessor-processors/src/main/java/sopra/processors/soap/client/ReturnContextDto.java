
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour returnContextDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="returnContextDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}errorDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exchangeReturnCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnContextDto", propOrder = {
    "errorList",
    "exchangeReturnCod"
})
public class ReturnContextDto {

    @XmlElement(nillable = true)
    protected List<ErrorDto> errorList;
    protected Integer exchangeReturnCod;

    /**
     * Gets the value of the errorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDto }
     * 
     * 
     */
    public List<ErrorDto> getErrorList() {
        if (errorList == null) {
            errorList = new ArrayList<ErrorDto>();
        }
        return this.errorList;
    }

    /**
     * Obtient la valeur de la propriété exchangeReturnCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExchangeReturnCod() {
        return exchangeReturnCod;
    }

    /**
     * Définit la valeur de la propriété exchangeReturnCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExchangeReturnCod(Integer value) {
        this.exchangeReturnCod = value;
    }

}
