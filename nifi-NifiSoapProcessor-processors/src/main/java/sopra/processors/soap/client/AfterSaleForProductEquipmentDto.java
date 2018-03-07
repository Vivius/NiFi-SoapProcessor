
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour afterSaleForProductEquipmentDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="afterSaleForProductEquipmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="optionActList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actWithIdDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productActList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actWithIdDto" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "afterSaleForProductEquipmentDto", propOrder = {
    "optionActList",
    "productActList",
    "productEquipment"
})
public class AfterSaleForProductEquipmentDto {

    @XmlElement(nillable = true)
    protected List<ActWithIdDto> optionActList;
    @XmlElement(nillable = true)
    protected List<ActWithIdDto> productActList;
    protected ProductEquipmentDto productEquipment;

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
     * Gets the value of the productActList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productActList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductActList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActWithIdDto }
     * 
     * 
     */
    public List<ActWithIdDto> getProductActList() {
        if (productActList == null) {
            productActList = new ArrayList<ActWithIdDto>();
        }
        return this.productActList;
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
