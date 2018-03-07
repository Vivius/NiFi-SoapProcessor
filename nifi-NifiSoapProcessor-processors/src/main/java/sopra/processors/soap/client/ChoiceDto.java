
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour choiceDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="choiceDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogColumnLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogDataValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogSelectedValueInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columnList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}columnTableDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choiceDto", propOrder = {
    "catalogColumnLbl",
    "catalogDataValue",
    "catalogSelectedValueInd",
    "columnList"
})
public class ChoiceDto {

    protected String catalogColumnLbl;
    protected String catalogDataValue;
    protected String catalogSelectedValueInd;
    @XmlElement(nillable = true)
    protected List<ColumnTableDto> columnList;

    /**
     * Obtient la valeur de la propriété catalogColumnLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogColumnLbl() {
        return catalogColumnLbl;
    }

    /**
     * Définit la valeur de la propriété catalogColumnLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogColumnLbl(String value) {
        this.catalogColumnLbl = value;
    }

    /**
     * Obtient la valeur de la propriété catalogDataValue.
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
     * Définit la valeur de la propriété catalogDataValue.
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
     * Obtient la valeur de la propriété catalogSelectedValueInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogSelectedValueInd() {
        return catalogSelectedValueInd;
    }

    /**
     * Définit la valeur de la propriété catalogSelectedValueInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogSelectedValueInd(String value) {
        this.catalogSelectedValueInd = value;
    }

    /**
     * Gets the value of the columnList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnTableDto }
     * 
     * 
     */
    public List<ColumnTableDto> getColumnList() {
        if (columnList == null) {
            columnList = new ArrayList<ColumnTableDto>();
        }
        return this.columnList;
    }

}
