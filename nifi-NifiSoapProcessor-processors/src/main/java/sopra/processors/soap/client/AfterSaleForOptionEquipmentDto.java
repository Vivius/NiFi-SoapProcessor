
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour afterSaleForOptionEquipmentDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="afterSaleForOptionEquipmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="optionActList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actWithIdDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="optionEquipment" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionEquipmentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afterSaleForOptionEquipmentDto", propOrder = {
    "optionActList",
    "optionEquipment"
})
public class AfterSaleForOptionEquipmentDto {

    @XmlElement(nillable = true)
    protected List<ActWithIdDto> optionActList;
    protected OptionEquipmentDto optionEquipment;

    /**
     * Gets the value of the optionActList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionActList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionActList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActWithIdDto }
     * 
     * 
     */
    public List<ActWithIdDto> getOptionActList() {
        if (optionActList == null) {
            optionActList = new ArrayList<ActWithIdDto>();
        }
        return this.optionActList;
    }

    /**
     * Obtient la valeur de la propriété optionEquipment.
     * 
     * @return
     *     possible object is
     *     {@link OptionEquipmentDto }
     *     
     */
    public OptionEquipmentDto getOptionEquipment() {
        return optionEquipment;
    }

    /**
     * Définit la valeur de la propriété optionEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionEquipmentDto }
     *     
     */
    public void setOptionEquipment(OptionEquipmentDto value) {
        this.optionEquipment = value;
    }

}
