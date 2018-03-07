
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour characteristicDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="characteristicDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribChrctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribChrctLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalValueList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}externalValueDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="internalValueList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}inputValueDto" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "characteristicDto", propOrder = {
    "distribChrctId",
    "distribChrctLbl",
    "externalValueList",
    "internalValueList",
    "templateNature",
    "templateNatureType"
})
public class CharacteristicDto {

    protected String distribChrctId;
    protected String distribChrctLbl;
    @XmlElement(nillable = true)
    protected List<ExternalValueDto> externalValueList;
    @XmlElement(nillable = true)
    protected List<InputValueDto> internalValueList;
    protected TmplNatureDto templateNature;
    protected TmplNatureTypeDto templateNatureType;

    /**
     * Obtient la valeur de la propriété distribChrctId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribChrctId() {
        return distribChrctId;
    }

    /**
     * Définit la valeur de la propriété distribChrctId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribChrctId(String value) {
        this.distribChrctId = value;
    }

    /**
     * Obtient la valeur de la propriété distribChrctLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribChrctLbl() {
        return distribChrctLbl;
    }

    /**
     * Définit la valeur de la propriété distribChrctLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribChrctLbl(String value) {
        this.distribChrctLbl = value;
    }

    /**
     * Gets the value of the externalValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalValueDto }
     * 
     * 
     */
    public List<ExternalValueDto> getExternalValueList() {
        if (externalValueList == null) {
            externalValueList = new ArrayList<ExternalValueDto>();
        }
        return this.externalValueList;
    }

    /**
     * Gets the value of the internalValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputValueDto }
     * 
     * 
     */
    public List<InputValueDto> getInternalValueList() {
        if (internalValueList == null) {
            internalValueList = new ArrayList<InputValueDto>();
        }
        return this.internalValueList;
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
