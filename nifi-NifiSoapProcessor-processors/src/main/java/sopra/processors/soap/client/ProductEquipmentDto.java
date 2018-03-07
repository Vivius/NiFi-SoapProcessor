
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour productEquipmentDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productEquipmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractSbcptDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="distribAssemblyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribAssemblyOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionEquipmentDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productEquipmentDto", propOrder = {
    "contractSbcptDt",
    "distribAssemblyId",
    "distribAssemblyOwnerId",
    "distribContractId",
    "distribProductId",
    "distribProductOwnerId",
    "optionList"
})
public class ProductEquipmentDto {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractSbcptDt;
    protected String distribAssemblyId;
    protected String distribAssemblyOwnerId;
    protected String distribContractId;
    protected String distribProductId;
    protected String distribProductOwnerId;
    @XmlElement(nillable = true)
    protected List<OptionEquipmentDto> optionList;

    /**
     * Obtient la valeur de la propriété contractSbcptDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractSbcptDt() {
        return contractSbcptDt;
    }

    /**
     * Définit la valeur de la propriété contractSbcptDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractSbcptDt(XMLGregorianCalendar value) {
        this.contractSbcptDt = value;
    }

    /**
     * Obtient la valeur de la propriété distribAssemblyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAssemblyId() {
        return distribAssemblyId;
    }

    /**
     * Définit la valeur de la propriété distribAssemblyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAssemblyId(String value) {
        this.distribAssemblyId = value;
    }

    /**
     * Obtient la valeur de la propriété distribAssemblyOwnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAssemblyOwnerId() {
        return distribAssemblyOwnerId;
    }

    /**
     * Définit la valeur de la propriété distribAssemblyOwnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAssemblyOwnerId(String value) {
        this.distribAssemblyOwnerId = value;
    }

    /**
     * Obtient la valeur de la propriété distribContractId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribContractId() {
        return distribContractId;
    }

    /**
     * Définit la valeur de la propriété distribContractId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribContractId(String value) {
        this.distribContractId = value;
    }

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
     * Gets the value of the optionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionEquipmentDto }
     * 
     * 
     */
    public List<OptionEquipmentDto> getOptionList() {
        if (optionList == null) {
            optionList = new ArrayList<OptionEquipmentDto>();
        }
        return this.optionList;
    }

}
