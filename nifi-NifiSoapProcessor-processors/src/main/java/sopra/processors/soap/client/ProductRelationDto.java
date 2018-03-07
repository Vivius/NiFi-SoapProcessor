
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productRelationDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productRelationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "productRelationDto", propOrder = {
    "distribProductId",
    "distribProductOwnerId",
    "relation"
})
public class ProductRelationDto {

    protected String distribProductId;
    protected String distribProductOwnerId;
    protected RelationDto relation;

    /**
     * Obtient la valeur de la propriété distribProductId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribProductId() {
        return distribProductId;
    }

    /**
     * Définit la valeur de la propriété distribProductId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribProductId(String value) {
        this.distribProductId = value;
    }

    /**
     * Obtient la valeur de la propriété distribProductOwnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribProductOwnerId() {
        return distribProductOwnerId;
    }

    /**
     * Définit la valeur de la propriété distribProductOwnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribProductOwnerId(String value) {
        this.distribProductOwnerId = value;
    }

    /**
     * Obtient la valeur de la propriété relation.
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
     * Définit la valeur de la propriété relation.
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
