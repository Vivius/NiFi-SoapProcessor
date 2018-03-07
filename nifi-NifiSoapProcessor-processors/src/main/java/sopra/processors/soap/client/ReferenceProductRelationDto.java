
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour referenceProductRelationDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="referenceProductRelationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogRefProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "referenceProductRelationDto", propOrder = {
    "catalogRefProductId",
    "relation"
})
public class ReferenceProductRelationDto {

    protected String catalogRefProductId;
    protected RelationDto relation;

    /**
     * Obtient la valeur de la propri�t� catalogRefProductId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogRefProductId() {
        return catalogRefProductId;
    }

    /**
     * D�finit la valeur de la propri�t� catalogRefProductId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogRefProductId(String value) {
        this.catalogRefProductId = value;
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
