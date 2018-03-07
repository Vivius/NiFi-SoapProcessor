
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour functioningEltDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="functioningEltDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogPresenceCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="characteristicElt" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}characteristicDto" minOccurs="0"/>
 *         &lt;element name="characteristicGrp" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}groupOfCharDto" minOccurs="0"/>
 *         &lt;element name="eligibility" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}eligibilityDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functioningEltDto", propOrder = {
    "catalogPresenceCod",
    "characteristicElt",
    "characteristicGrp",
    "eligibility"
})
public class FunctioningEltDto {

    protected String catalogPresenceCod;
    protected CharacteristicDto characteristicElt;
    protected GroupOfCharDto characteristicGrp;
    protected EligibilityDto eligibility;

    /**
     * Obtient la valeur de la propri�t� catalogPresenceCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogPresenceCod() {
        return catalogPresenceCod;
    }

    /**
     * D�finit la valeur de la propri�t� catalogPresenceCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogPresenceCod(String value) {
        this.catalogPresenceCod = value;
    }

    /**
     * Obtient la valeur de la propri�t� characteristicElt.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicDto }
     *     
     */
    public CharacteristicDto getCharacteristicElt() {
        return characteristicElt;
    }

    /**
     * D�finit la valeur de la propri�t� characteristicElt.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicDto }
     *     
     */
    public void setCharacteristicElt(CharacteristicDto value) {
        this.characteristicElt = value;
    }

    /**
     * Obtient la valeur de la propri�t� characteristicGrp.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfCharDto }
     *     
     */
    public GroupOfCharDto getCharacteristicGrp() {
        return characteristicGrp;
    }

    /**
     * D�finit la valeur de la propri�t� characteristicGrp.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfCharDto }
     *     
     */
    public void setCharacteristicGrp(GroupOfCharDto value) {
        this.characteristicGrp = value;
    }

    /**
     * Obtient la valeur de la propri�t� eligibility.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityDto }
     *     
     */
    public EligibilityDto getEligibility() {
        return eligibility;
    }

    /**
     * D�finit la valeur de la propri�t� eligibility.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityDto }
     *     
     */
    public void setEligibility(EligibilityDto value) {
        this.eligibility = value;
    }

}
