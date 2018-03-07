
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour offerRelationDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offerRelationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOfferOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relation" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}relationDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerRelationDto", propOrder = {
    "distribOfferId",
    "distribOfferOwnerId",
    "relation"
})
public class OfferRelationDto {

    protected String distribOfferId;
    protected String distribOfferOwnerId;
    protected RelationDto relation;

    /**
     * Obtient la valeur de la propri�t� distribOfferId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOfferId() {
        return distribOfferId;
    }

    /**
     * D�finit la valeur de la propri�t� distribOfferId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOfferId(String value) {
        this.distribOfferId = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribOfferOwnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOfferOwnerId() {
        return distribOfferOwnerId;
    }

    /**
     * D�finit la valeur de la propri�t� distribOfferOwnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOfferOwnerId(String value) {
        this.distribOfferOwnerId = value;
    }

    /**
     * Obtient la valeur de la propri�t� relation.
     * 
     * @return
     *     possible object is
     *     {@link RelationDto }
     *     
     */
    public RelationDto getRelation() {
        return relation;
    }

    /**
     * D�finit la valeur de la propri�t� relation.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationDto }
     *     
     */
    public void setRelation(RelationDto value) {
        this.relation = value;
    }

}
