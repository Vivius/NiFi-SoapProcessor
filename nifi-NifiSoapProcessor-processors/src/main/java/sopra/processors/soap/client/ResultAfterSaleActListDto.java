
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour resultAfterSaleActListDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="resultAfterSaleActListDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="afterSaleElement" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}afterSaleElementDto" minOccurs="0"/>
 *         &lt;element name="dataHeadingTypeList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}dataHeadingTypeDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnContext" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}returnContextDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultAfterSaleActListDto", propOrder = {
    "afterSaleElement",
    "dataHeadingTypeList",
    "returnContext"
})
public class ResultAfterSaleActListDto {

    protected AfterSaleElementDto afterSaleElement;
    @XmlElement(nillable = true)
    protected List<DataHeadingTypeDto> dataHeadingTypeList;
    protected ReturnContextDto returnContext;

    /**
     * Obtient la valeur de la propriété afterSaleElement.
     * 
     * @return
     *     possible object is
     *     {@link AfterSaleElementDto }
     *     
     */
    public AfterSaleElementDto getAfterSaleElement() {
        return afterSaleElement;
    }

    /**
     * Définit la valeur de la propriété afterSaleElement.
     * 
     * @param value
     *     allowed object is
     *     {@link AfterSaleElementDto }
     *     
     */
    public void setAfterSaleElement(AfterSaleElementDto value) {
        this.afterSaleElement = value;
    }

    /**
     * Gets the value of the dataHeadingTypeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataHeadingTypeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataHeadingTypeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataHeadingTypeDto }
     * 
     * 
     */
    public List<DataHeadingTypeDto> getDataHeadingTypeList() {
        if (dataHeadingTypeList == null) {
            dataHeadingTypeList = new ArrayList<DataHeadingTypeDto>();
        }
        return this.dataHeadingTypeList;
    }

    /**
     * Obtient la valeur de la propriété returnContext.
     * 
     * @return
     *     possible object is
     *     {@link ReturnContextDto }
     *     
     */
    public ReturnContextDto getReturnContext() {
        return returnContext;
    }

    /**
     * Définit la valeur de la propriété returnContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnContextDto }
     *     
     */
    public void setReturnContext(ReturnContextDto value) {
        this.returnContext = value;
    }

}
