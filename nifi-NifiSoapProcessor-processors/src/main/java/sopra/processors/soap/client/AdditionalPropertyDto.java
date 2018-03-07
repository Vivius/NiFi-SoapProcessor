
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour additionalPropertyDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="additionalPropertyDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="characteristicEltList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}characteristicDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="characteristicGrpList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}groupOfCharDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="templateNature" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}tmplNatureDto" minOccurs="0"/>
 *         &lt;element name="templateNatureType" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}tmplNatureTypeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalPropertyDto", propOrder = {
    "characteristicEltList",
    "characteristicGrpList",
    "templateNature",
    "templateNatureType"
})
public class AdditionalPropertyDto {

    @XmlElement(nillable = true)
    protected List<CharacteristicDto> characteristicEltList;
    @XmlElement(nillable = true)
    protected List<GroupOfCharDto> characteristicGrpList;
    protected TmplNatureDto templateNature;
    protected TmplNatureTypeDto templateNatureType;

    /**
     * Gets the value of the characteristicEltList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicEltList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicEltList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicDto }
     * 
     * 
     */
    public List<CharacteristicDto> getCharacteristicEltList() {
        if (characteristicEltList == null) {
            characteristicEltList = new ArrayList<CharacteristicDto>();
        }
        return this.characteristicEltList;
    }

    /**
     * Gets the value of the characteristicGrpList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicGrpList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicGrpList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfCharDto }
     * 
     * 
     */
    public List<GroupOfCharDto> getCharacteristicGrpList() {
        if (characteristicGrpList == null) {
            characteristicGrpList = new ArrayList<GroupOfCharDto>();
        }
        return this.characteristicGrpList;
    }

    /**
     * Obtient la valeur de la propriété templateNature.
     * 
     * @return
     *     possible object is
     *     {@link TmplNatureDto }
     *     
     */
    public TmplNatureDto getTemplateNature() {
        return templateNature;
    }

    /**
     * Définit la valeur de la propriété templateNature.
     * 
     * @param value
     *     allowed object is
     *     {@link TmplNatureDto }
     *     
     */
    public void setTemplateNature(TmplNatureDto value) {
        this.templateNature = value;
    }

    /**
     * Obtient la valeur de la propriété templateNatureType.
     * 
     * @return
     *     possible object is
     *     {@link TmplNatureTypeDto }
     *     
     */
    public TmplNatureTypeDto getTemplateNatureType() {
        return templateNatureType;
    }

    /**
     * Définit la valeur de la propriété templateNatureType.
     * 
     * @param value
     *     allowed object is
     *     {@link TmplNatureTypeDto }
     *     
     */
    public void setTemplateNatureType(TmplNatureTypeDto value) {
        this.templateNatureType = value;
    }

}
