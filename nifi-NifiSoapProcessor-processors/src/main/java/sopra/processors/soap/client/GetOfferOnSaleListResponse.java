
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getOfferOnSaleListResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getOfferOnSaleListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}resultOfferOnSaleListDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOfferOnSaleListResponse", propOrder = {
    "_return"
})
public class GetOfferOnSaleListResponse {

    @XmlElement(name = "return")
    protected ResultOfferOnSaleListDto _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     * @return
     *     possible object is
     *     {@link ResultOfferOnSaleListDto }
     *     
     */
    public ResultOfferOnSaleListDto getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfferOnSaleListDto }
     *     
     */
    public void setReturn(ResultOfferOnSaleListDto value) {
        this._return = value;
    }

}
