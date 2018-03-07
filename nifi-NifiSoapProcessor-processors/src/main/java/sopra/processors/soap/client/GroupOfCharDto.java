
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour groupOfCharDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="groupOfCharDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="characteristicList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}characteristicDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribGroupOfChrctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribGroupOfChrctLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupOfCharList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}groupOfCharDto" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "groupOfCharDto", propOrder = {
    "characteristicList",
    "distribGroupOfChrctId",
    "distribGroupOfChrctLbl",
    "groupOfCharList",
    "templateNature",
    "templateNatureType"
})
public class GroupOfCharDto {

    @XmlElement(nillable = true)
    protected List<CharacteristicDto> characteristicList;
    protected String distribGroupOfChrctId;
    protected String distribGroupOfChrctLbl;
    @XmlElement(nillable = true)
    protected List<GroupOfCharDto> groupOfCharList;
    protected TmplNatureDto templateNature;
    protected TmplNatureTypeDto templateNatureType;

    /**
     * Gets the value of the characteristicList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicDto }
     * 
     * 
     */
    public List<CharacteristicDto> getCharacteristicList() {
        if (characteristicList == null) {
            characteristicList = new ArrayList<CharacteristicDto>();
        }
        return this.characteristicList;
    }

    /**
     * Obtient la valeur de la propriété distribGroupOfChrctId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribGroupOfChrctId() {
        return distribGroupOfChrctId;
    }

    /**
     * Définit la valeur de la propriété distribGroupOfChrctId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribGroupOfChrctId(String value) {
        this.distribGroupOfChrctId = value;
    }

    /**
     * Obtient la valeur de la propriété distribGroupOfChrctLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribGroupOfChrctLbl() {
        return distribGroupOfChrctLbl;
    }

    /**
     * Définit la valeur de la propriété distribGroupOfChrctLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribGroupOfChrctLbl(String value) {
        this.distribGroupOfChrctLbl = value;
    }

    /**
     * Gets the value of the groupOfCharList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfCharList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfCharList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfCharDto }
     * 
     * 
     */
    public List<GroupOfCharDto> getGroupOfCharList() {
        if (groupOfCharList == null) {
            groupOfCharList = new ArrayList<GroupOfCharDto>();
        }
        return this.groupOfCharList;
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
