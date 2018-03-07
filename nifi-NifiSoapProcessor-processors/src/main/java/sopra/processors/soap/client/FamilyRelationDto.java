
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour familyRelationDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="familyRelationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="family" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}familyDto" minOccurs="0"/>
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
@XmlType(name = "familyRelationDto", propOrder = {
    "family",
    "relation"
})
public class FamilyRelationDto {

    protected FamilyDto family;
    protected RelationDto relation;

    /**
     * Obtient la valeur de la propriété family.
     * 
     * @return
     *     possible object is
     *     {@link FamilyDto }
     *     
     */
    public FamilyDto getFamily() {
        return family;
    }

    /**
     * Définit la valeur de la propriété family.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyDto }
     *     
     */
    public void setFamily(FamilyDto value) {
        this.family = value;
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
