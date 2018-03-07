
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getOfferOnSaleListForCommercialEltResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getOfferOnSaleListForCommercialEltResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}resultOfferForCommercialEltListDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOfferOnSaleListForCommercialEltResponse", propOrder = {
    "_return"
})
public class GetOfferOnSaleListForCommercialEltResponse {

    @XmlElement(name = "return")
    protected ResultOfferForCommercialEltListDto _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     * @return
     *     possible object is
     *     {@link ResultOfferForCommercialEltListDto }
     *     
     */
    public ResultOfferForCommercialEltListDto getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfferForCommercialEltListDto }
     *     
     */
    public void setReturn(ResultOfferForCommercialEltListDto value) {
        this._return = value;
    }

}
