
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour inputValueDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="inputValueDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogContractualDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catalogDataMaxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogDataMinValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogDataValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogDefaultValueInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catalogDhDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogDhLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogDhValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogMultipleValueInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="choice" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}choiceDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}currencyDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dhId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dhtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribPricingInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputValueDto", propOrder = {
    "catalogContractualDataInd",
    "catalogDataMaxValue",
    "catalogDataMinValue",
    "catalogDataValue",
    "catalogDefaultValueInd",
    "catalogDhDescr",
    "catalogDhLbl",
    "catalogDhValueType",
    "catalogMultipleValueInd",
    "choice",
    "currency",
    "dhId",
    "dhtId",
    "distribPricingInd"
})
public class InputValueDto {

    protected boolean catalogContractualDataInd;
    protected String catalogDataMaxValue;
    protected String catalogDataMinValue;
    protected String catalogDataValue;
    protected boolean catalogDefaultValueInd;
    protected String catalogDhDescr;
    protected String catalogDhLbl;
    protected String catalogDhValueType;
    protected boolean catalogMultipleValueInd;
    @XmlElement(nillable = true)
    protected List<ChoiceDto> choice;
    @XmlElement(nillable = true)
    protected List<CurrencyDto> currency;
    protected String dhId;
    protected String dhtId;
    protected boolean distribPricingInd;

    /**
     * Obtient la valeur de la propri�t� catalogContractualDataInd.
     * 
     */
    public boolean isCatalogContractualDataInd() {
        return catalogContractualDataInd;
    }

    /**
     * D�finit la valeur de la propri�t� catalogContractualDataInd.
     * 
     */
    public void setCatalogContractualDataInd(boolean value) {
        this.catalogContractualDataInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogDataMaxValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDataMaxValue() {
        return catalogDataMaxValue;
    }

    /**
     * D�finit la valeur de la propri�t� catalogDataMaxValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDataMaxValue(String value) {
        this.catalogDataMaxValue = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogDataMinValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDataMinValue() {
        return catalogDataMinValue;
    }

    /**
     * D�finit la valeur de la propri�t� catalogDataMinValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDataMinValue(String value) {
        this.catalogDataMinValue = value;
    }

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
     * Obtient la valeur de la propri�t� catalogDefaultValueInd.
     * 
     */
    public boolean isCatalogDefaultValueInd() {
        return catalogDefaultValueInd;
    }

    /**
     * D�finit la valeur de la propri�t� catalogDefaultValueInd.
     * 
     */
    public void setCatalogDefaultValueInd(boolean value) {
        this.catalogDefaultValueInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogDhDescr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDhDescr() {
        return catalogDhDescr;
    }

    /**
     * D�finit la valeur de la propri�t� catalogDhDescr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDhDescr(String value) {
        this.catalogDhDescr = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogDhLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDhLbl() {
        return catalogDhLbl;
    }

    /**
     * D�finit la valeur de la propri�t� catalogDhLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDhLbl(String value) {
        this.catalogDhLbl = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogDhValueType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDhValueType() {
        return catalogDhValueType;
    }

    /**
     * D�finit la valeur de la propri�t� catalogDhValueType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDhValueType(String value) {
        this.catalogDhValueType = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogMultipleValueInd.
     * 
     */
    public boolean isCatalogMultipleValueInd() {
        return catalogMultipleValueInd;
    }

    /**
     * D�finit la valeur de la propri�t� catalogMultipleValueInd.
     * 
     */
    public void setCatalogMultipleValueInd(boolean value) {
        this.catalogMultipleValueInd = value;
    }

    /**
     * Gets the value of the choice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChoiceDto }
     * 
     * 
     */
    public List<ChoiceDto> getChoice() {
        if (choice == null) {
            choice = new ArrayList<ChoiceDto>();
        }
        return this.choice;
    }

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyDto }
     * 
     * 
     */
    public List<CurrencyDto> getCurrency() {
        if (currency == null) {
            currency = new ArrayList<CurrencyDto>();
        }
        return this.currency;
    }

    /**
     * Obtient la valeur de la propri�t� dhId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhId() {
        return dhId;
    }

    /**
     * D�finit la valeur de la propri�t� dhId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhId(String value) {
        this.dhId = value;
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
     * Obtient la valeur de la propri�t� distribPricingInd.
     * 
     */
    public boolean isDistribPricingInd() {
        return distribPricingInd;
    }

    /**
     * D�finit la valeur de la propri�t� distribPricingInd.
     * 
     */
    public void setDistribPricingInd(boolean value) {
        this.distribPricingInd = value;
    }

}
