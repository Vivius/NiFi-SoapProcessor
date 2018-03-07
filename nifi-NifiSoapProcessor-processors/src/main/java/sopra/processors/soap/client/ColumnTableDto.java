
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour columnTableDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="columnTableDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogDataValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}currencyDto" minOccurs="0"/>
 *         &lt;element name="dhtDataTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dhtMaxLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paramTableColId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "columnTableDto", propOrder = {
    "catalogDataValue",
    "currency",
    "dhtDataTypeId",
    "dhtMaxLength",
    "paramTableColId"
})
public class ColumnTableDto {

    protected String catalogDataValue;
    protected CurrencyDto currency;
    protected String dhtDataTypeId;
    protected Integer dhtMaxLength;
    protected String paramTableColId;

    /**
     * Obtient la valeur de la propri�t� catalogDataValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDataValue() {
        return catalogDataValue;
    }

    /**
     * D�finit la valeur de la propri�t� catalogDataValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDataValue(String value) {
        this.catalogDataValue = value;
    }

    /**
     * Obtient la valeur de la propri�t� currency.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDto }
     *     
     */
    public CurrencyDto getCurrency() {
        return currency;
    }

    /**
     * D�finit la valeur de la propri�t� currency.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDto }
     *     
     */
    public void setCurrency(CurrencyDto value) {
        this.currency = value;
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
     * Obtient la valeur de la propri�t� paramTableColId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamTableColId() {
        return paramTableColId;
    }

    /**
     * D�finit la valeur de la propri�t� paramTableColId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamTableColId(String value) {
        this.paramTableColId = value;
    }

}
