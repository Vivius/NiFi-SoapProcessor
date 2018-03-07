
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour offerForCommercialEltDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offerForCommercialEltDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commercialEltIdentification" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}commercialEltIdentificationDto" minOccurs="0"/>
 *         &lt;element name="offerOnSaleList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}offerOnSaleDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerForCommercialEltDto", propOrder = {
    "commercialEltIdentification",
    "offerOnSaleList"
})
public class OfferForCommercialEltDto {

    protected CommercialEltIdentificationDto commercialEltIdentification;
    @XmlElement(nillable = true)
    protected List<OfferOnSaleDto> offerOnSaleList;

    /**
     * Obtient la valeur de la propriété commercialEltIdentification.
     * 
     * @return
     *     possible object is
     *     {@link CommercialEltIdentificationDto }
     *     
     */
    public CommercialEltIdentificationDto getCommercialEltIdentification() {
        return commercialEltIdentification;
    }

    /**
     * Définit la valeur de la propriété commercialEltIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialEltIdentificationDto }
     *     
     */
    public void setCommercialEltIdentification(CommercialEltIdentificationDto value) {
        this.commercialEltIdentification = value;
    }

    /**
     * Gets the value of the offerOnSaleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerOnSaleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferOnSaleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferOnSaleDto }
     * 
     * 
     */
    public List<OfferOnSaleDto> getOfferOnSaleList() {
        if (offerOnSaleList == null) {
            offerOnSaleList = new ArrayList<OfferOnSaleDto>();
        }
        return this.offerOnSaleList;
    }

}
