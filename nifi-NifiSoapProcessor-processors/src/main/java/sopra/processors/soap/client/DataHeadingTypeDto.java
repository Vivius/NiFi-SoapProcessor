
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour dataHeadingTypeDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="dataHeadingTypeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogDhtLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dhtAccuracy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dhtDataTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dhtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dhtMaxLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dhtNonEnumFilterLowerLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dhtNonEnumFilterUpperLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataHeadingTypeDto", propOrder = {
    "catalogDhtLbl",
    "dhtAccuracy",
    "dhtDataTypeId",
    "dhtId",
    "dhtMaxLength",
    "dhtNonEnumFilterLowerLimit",
    "dhtNonEnumFilterUpperLimit"
})
public class DataHeadingTypeDto {

    protected String catalogDhtLbl;
    protected Integer dhtAccuracy;
    protected String dhtDataTypeId;
    protected String dhtId;
    protected Integer dhtMaxLength;
    protected String dhtNonEnumFilterLowerLimit;
    protected String dhtNonEnumFilterUpperLimit;

    /**
     * Obtient la valeur de la propri�t� catalogDhtLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDhtLbl() {
        return catalogDhtLbl;
    }

    /**
     * D�finit la valeur de la propri�t� catalogDhtLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDhtLbl(String value) {
        this.catalogDhtLbl = value;
    }

    /**
     * Obtient la valeur de la propri�t� dhtAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDhtAccuracy() {
        return dhtAccuracy;
    }

    /**
     * D�finit la valeur de la propri�t� dhtAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDhtAccuracy(Integer value) {
        this.dhtAccuracy = value;
    }

    /**
     * Obtient la valeur de la propri�t� dhtDataTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhtDataTypeId() {
        return dhtDataTypeId;
    }

    /**
     * D�finit la valeur de la propri�t� dhtDataTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhtDataTypeId(String value) {
        this.dhtDataTypeId = value;
    }

    /**
     * Obtient la valeur de la propri�t� dhtId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhtId() {
        return dhtId;
    }

    /**
     * D�finit la valeur de la propri�t� dhtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhtId(String value) {
        this.dhtId = value;
    }

    /**
     * Obtient la valeur de la propri�t� dhtMaxLength.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDhtMaxLength() {
        return dhtMaxLength;
    }

    /**
     * D�finit la valeur de la propri�t� dhtMaxLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDhtMaxLength(Integer value) {
        this.dhtMaxLength = value;
    }

    /**
     * Obtient la valeur de la propri�t� dhtNonEnumFilterLowerLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhtNonEnumFilterLowerLimit() {
        return dhtNonEnumFilterLowerLimit;
    }

    /**
     * D�finit la valeur de la propri�t� dhtNonEnumFilterLowerLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhtNonEnumFilterLowerLimit(String value) {
        this.dhtNonEnumFilterLowerLimit = value;
    }

    /**
     * Obtient la valeur de la propri�t� dhtNonEnumFilterUpperLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhtNonEnumFilterUpperLimit() {
        return dhtNonEnumFilterUpperLimit;
    }

    /**
     * D�finit la valeur de la propri�t� dhtNonEnumFilterUpperLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhtNonEnumFilterUpperLimit(String value) {
        this.dhtNonEnumFilterUpperLimit = value;
    }

}
