
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour equipmentDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="equipmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assemblyEquipment" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}assemblyEquipmentDto" minOccurs="0"/>
 *         &lt;element name="optionEquipment" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionEquipmentDto" minOccurs="0"/>
 *         &lt;element name="productEquipment" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}productEquipmentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipmentDto", propOrder = {
    "assemblyEquipment",
    "optionEquipment",
    "productEquipment"
})
public class EquipmentDto {

    protected AssemblyEquipmentDto assemblyEquipment;
    protected OptionEquipmentDto optionEquipment;
    protected ProductEquipmentDto productEquipment;

    /**
     * Obtient la valeur de la propriété assemblyEquipment.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyEquipmentDto }
     *     
     */
    public AssemblyEquipmentDto getAssemblyEquipment() {
        return assemblyEquipment;
    }

    /**
     * Définit la valeur de la propriété assemblyEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyEquipmentDto }
     *     
     */
    public void setAssemblyEquipment(AssemblyEquipmentDto value) {
        this.assemblyEquipment = value;
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

    /**
     * Obtient la valeur de la propriété productEquipment.
     * 
     * @return
     *     possible object is
     *     {@link ProductEquipmentDto }
     *     
     */
    public ProductEquipmentDto getProductEquipment() {
        return productEquipment;
    }

    /**
     * Définit la valeur de la propriété productEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductEquipmentDto }
     *     
     */
    public void setProductEquipment(ProductEquipmentDto value) {
        this.productEquipment = value;
    }

}
