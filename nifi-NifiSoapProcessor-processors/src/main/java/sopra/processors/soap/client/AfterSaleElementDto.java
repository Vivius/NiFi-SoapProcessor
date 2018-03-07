
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour afterSaleElementDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="afterSaleElementDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="afterSaleForAssemblyEquipmentList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}afterSaleForAssemblyEquipmentDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="afterSaleForOptionEquipmentList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}afterSaleForOptionEquipmentDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="afterSaleForProductEquipmentList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}afterSaleForProductEquipmentDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afterSaleElementDto", propOrder = {
    "afterSaleForAssemblyEquipmentList",
    "afterSaleForOptionEquipmentList",
    "afterSaleForProductEquipmentList"
})
public class AfterSaleElementDto {

    @XmlElement(nillable = true)
    protected List<AfterSaleForAssemblyEquipmentDto> afterSaleForAssemblyEquipmentList;
    @XmlElement(nillable = true)
    protected List<AfterSaleForOptionEquipmentDto> afterSaleForOptionEquipmentList;
    @XmlElement(nillable = true)
    protected List<AfterSaleForProductEquipmentDto> afterSaleForProductEquipmentList;

    /**
     * Gets the value of the afterSaleForAssemblyEquipmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the afterSaleForAssemblyEquipmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAfterSaleForAssemblyEquipmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AfterSaleForAssemblyEquipmentDto }
     * 
     * 
     */
    public List<AfterSaleForAssemblyEquipmentDto> getAfterSaleForAssemblyEquipmentList() {
        if (afterSaleForAssemblyEquipmentList == null) {
            afterSaleForAssemblyEquipmentList = new ArrayList<AfterSaleForAssemblyEquipmentDto>();
        }
        return this.afterSaleForAssemblyEquipmentList;
    }

    /**
     * Gets the value of the afterSaleForOptionEquipmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the afterSaleForOptionEquipmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAfterSaleForOptionEquipmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AfterSaleForOptionEquipmentDto }
     * 
     * 
     */
    public List<AfterSaleForOptionEquipmentDto> getAfterSaleForOptionEquipmentList() {
        if (afterSaleForOptionEquipmentList == null) {
            afterSaleForOptionEquipmentList = new ArrayList<AfterSaleForOptionEquipmentDto>();
        }
        return this.afterSaleForOptionEquipmentList;
    }

    /**
     * Gets the value of the afterSaleForProductEquipmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the afterSaleForProductEquipmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAfterSaleForProductEquipmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AfterSaleForProductEquipmentDto }
     * 
     * 
     */
    public List<AfterSaleForProductEquipmentDto> getAfterSaleForProductEquipmentList() {
        if (afterSaleForProductEquipmentList == null) {
            afterSaleForProductEquipmentList = new ArrayList<AfterSaleForProductEquipmentDto>();
        }
        return this.afterSaleForProductEquipmentList;
    }

}
