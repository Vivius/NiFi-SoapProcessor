
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getAfterSaleElementList complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getAfterSaleElementList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessContext" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}businessContextDto" minOccurs="0"/>
 *         &lt;element name="distributionContext" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}distributionContextDto" minOccurs="0"/>
 *         &lt;element name="marketingContext" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}marketingContextDto" minOccurs="0"/>
 *         &lt;element name="equipmentList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}equipmentDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detailLevel" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}detailLevelDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAfterSaleElementList", propOrder = {
    "businessContext",
    "distributionContext",
    "marketingContext",
    "equipmentList",
    "detailLevel"
})
public class GetAfterSaleElementList {

    protected BusinessContextDto businessContext;
    protected DistributionContextDto distributionContext;
    protected MarketingContextDto marketingContext;
    protected List<EquipmentDto> equipmentList;
    protected DetailLevelDto detailLevel;

    /**
     * Obtient la valeur de la propri�t� businessContext.
     * 
     * @return
     *     possible object is
     *     {@link BusinessContextDto }
     *     
     */
    public BusinessContextDto getBusinessContext() {
        return businessContext;
    }

    /**
     * D�finit la valeur de la propri�t� businessContext.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessContextDto }
     *     
     */
    public void setBusinessContext(BusinessContextDto value) {
        this.businessContext = value;
    }

    /**
     * Obtient la valeur de la propri�t� distributionContext.
     * 
     * @return
     *     possible object is
     *     {@link DistributionContextDto }
     *     
     */
    public DistributionContextDto getDistributionContext() {
        return distributionContext;
    }

    /**
     * D�finit la valeur de la propri�t� distributionContext.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionContextDto }
     *     
     */
    public void setDistributionContext(DistributionContextDto value) {
        this.distributionContext = value;
    }

    /**
     * Obtient la valeur de la propri�t� marketingContext.
     * 
     * @return
     *     possible object is
     *     {@link MarketingContextDto }
     *     
     */
    public MarketingContextDto getMarketingContext() {
        return marketingContext;
    }

    /**
     * D�finit la valeur de la propri�t� marketingContext.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingContextDto }
     *     
     */
    public void setMarketingContext(MarketingContextDto value) {
        this.marketingContext = value;
    }

    /**
     * Gets the value of the equipmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentDto }
     * 
     * 
     */
    public List<EquipmentDto> getEquipmentList() {
        if (equipmentList == null) {
            equipmentList = new ArrayList<EquipmentDto>();
        }
        return this.equipmentList;
    }

    /**
     * Obtient la valeur de la propri�t� detailLevel.
     * 
     * @return
     *     possible object is
     *     {@link DetailLevelDto }
     *     
     */
    public DetailLevelDto getDetailLevel() {
        return detailLevel;
    }

    /**
     * D�finit la valeur de la propri�t� detailLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailLevelDto }
     *     
     */
    public void setDetailLevel(DetailLevelDto value) {
        this.detailLevel = value;
    }

}
