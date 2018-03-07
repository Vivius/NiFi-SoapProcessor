
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getMarketedElementListResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getMarketedElementListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}resultMarketedEltListDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMarketedElementListResponse", propOrder = {
    "_return"
})
public class GetMarketedElementListResponse {

    @XmlElement(name = "return")
    protected ResultMarketedEltListDto _return;

    /**
     * Obtient la valeur de la propri�t� return.
     * 
     * @return
     *     possible object is
     *     {@link ResultMarketedEltListDto }
     *     
     */
    public ResultMarketedEltListDto getReturn() {
        return _return;
    }

    /**
     * D�finit la valeur de la propri�t� return.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultMarketedEltListDto }
     *     
     */
    public void setReturn(ResultMarketedEltListDto value) {
        this._return = value;
    }

}
