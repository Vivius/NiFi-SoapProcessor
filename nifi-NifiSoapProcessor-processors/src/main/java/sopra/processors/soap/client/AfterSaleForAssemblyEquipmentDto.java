
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour afterSaleForAssemblyEquipmentDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="afterSaleForAssemblyEquipmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assemblyActList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actWithIdDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assemblyEquipment" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}assemblyEquipmentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afterSaleForAssemblyEquipmentDto", propOrder = {
    "assemblyActList",
    "assemblyEquipment"
})
public class AfterSaleForAssemblyEquipmentDto {

    @XmlElement(nillable = true)
    protected List<ActWithIdDto> assemblyActList;
    protected AssemblyEquipmentDto assemblyEquipment;

    /**
     * Gets the value of the assemblyActList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyActList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyActList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActWithIdDto }
     * 
     * 
     */
    public List<ActWithIdDto> getAssemblyActList() {
        if (assemblyActList == null) {
            assemblyActList = new ArrayList<ActWithIdDto>();
        }
        return this.assemblyActList;
    }

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

}
