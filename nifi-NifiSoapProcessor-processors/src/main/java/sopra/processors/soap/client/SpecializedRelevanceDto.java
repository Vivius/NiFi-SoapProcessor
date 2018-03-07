
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour specializedRelevanceDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="specializedRelevanceDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribRelevance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="market" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}marketDto" minOccurs="0"/>
 *         &lt;element name="segment" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}segmentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specializedRelevanceDto", propOrder = {
    "distribRelevance",
    "market",
    "segment"
})
public class SpecializedRelevanceDto {

    protected Integer distribRelevance;
    protected MarketDto market;
    protected SegmentDto segment;

    /**
     * Obtient la valeur de la propriété distribRelevance.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistribRelevance() {
        return distribRelevance;
    }

    /**
     * Définit la valeur de la propriété distribRelevance.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistribRelevance(Integer value) {
        this.distribRelevance = value;
    }

    /**
     * Obtient la valeur de la propriété market.
     * 
     * @return
     *     possible object is
     *     {@link MarketDto }
     *     
     */
    public MarketDto getMarket() {
        return market;
    }

    /**
     * Définit la valeur de la propriété market.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketDto }
     *     
     */
    public void setMarket(MarketDto value) {
        this.market = value;
    }

    /**
     * Obtient la valeur de la propriété segment.
     * 
     * @return
     *     possible object is
     *     {@link SegmentDto }
     *     
     */
    public SegmentDto getSegment() {
        return segment;
    }

    /**
     * Définit la valeur de la propriété segment.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentDto }
     *     
     */
    public void setSegment(SegmentDto value) {
        this.segment = value;
    }

}
