
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour offerOnSaleDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offerOnSaleDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channelList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}channelDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distributor" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}distributorDto" minOccurs="0"/>
 *         &lt;element name="offerList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}offerDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerOnSaleDto", propOrder = {
    "channelList",
    "distributor",
    "offerList"
})
public class OfferOnSaleDto {

    @XmlElement(nillable = true)
    protected List<ChannelDto> channelList;
    protected DistributorDto distributor;
    @XmlElement(nillable = true)
    protected List<OfferDto> offerList;

    /**
     * Gets the value of the channelList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelDto }
     * 
     * 
     */
    public List<ChannelDto> getChannelList() {
        if (channelList == null) {
            channelList = new ArrayList<ChannelDto>();
        }
        return this.channelList;
    }

    /**
     * Obtient la valeur de la propriété distributor.
     * 
     * @return
     *     possible object is
     *     {@link DistributorDto }
     *     
     */
    public DistributorDto getDistributor() {
        return distributor;
    }

    /**
     * Définit la valeur de la propriété distributor.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributorDto }
     *     
     */
    public void setDistributor(DistributorDto value) {
        this.distributor = value;
    }

    /**
     * Gets the value of the offerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferDto }
     * 
     * 
     */
    public List<OfferDto> getOfferList() {
        if (offerList == null) {
            offerList = new ArrayList<OfferDto>();
        }
        return this.offerList;
    }

}
