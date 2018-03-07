
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour marketDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="marketDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribMarketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribMarketLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribRelevance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marketDto", propOrder = {
    "distribMarketId",
    "distribMarketLbl",
    "distribRelevance"
})
public class MarketDto {

    protected String distribMarketId;
    protected String distribMarketLbl;
    protected Integer distribRelevance;

    /**
     * Obtient la valeur de la propri�t� distribMarketId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribMarketId() {
        return distribMarketId;
    }

    /**
     * D�finit la valeur de la propri�t� distribMarketId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribMarketId(String value) {
        this.distribMarketId = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribMarketLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribMarketLbl() {
        return distribMarketLbl;
    }

    /**
     * D�finit la valeur de la propri�t� distribMarketLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribMarketLbl(String value) {
        this.distribMarketLbl = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribRelevance.
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
     * D�finit la valeur de la propri�t� distribRelevance.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistribRelevance(Integer value) {
        this.distribRelevance = value;
    }

}
