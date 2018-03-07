
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour detailLevelDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="detailLevelDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogAddtlPropertyInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catalogAfterSaleDistribInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catalogClassificationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catalogClientTrgtInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catalogDetailLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="catalogEltInRelationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catalogMarketingTrgtInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catalogSaleDistribInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="eligibilityContext" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}specificCustomerContextDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailLevelDto", propOrder = {
    "catalogAddtlPropertyInd",
    "catalogAfterSaleDistribInd",
    "catalogClassificationInd",
    "catalogClientTrgtInd",
    "catalogDetailLevel",
    "catalogEltInRelationInd",
    "catalogMarketingTrgtInd",
    "catalogSaleDistribInd",
    "eligibilityContext"
})
public class DetailLevelDto {

    protected boolean catalogAddtlPropertyInd;
    protected boolean catalogAfterSaleDistribInd;
    protected boolean catalogClassificationInd;
    protected boolean catalogClientTrgtInd;
    protected Integer catalogDetailLevel;
    protected boolean catalogEltInRelationInd;
    protected boolean catalogMarketingTrgtInd;
    protected boolean catalogSaleDistribInd;
    protected SpecificCustomerContextDto eligibilityContext;

    /**
     * Obtient la valeur de la propri�t� catalogAddtlPropertyInd.
     * 
     */
    public boolean isCatalogAddtlPropertyInd() {
        return catalogAddtlPropertyInd;
    }

    /**
     * D�finit la valeur de la propri�t� catalogAddtlPropertyInd.
     * 
     */
    public void setCatalogAddtlPropertyInd(boolean value) {
        this.catalogAddtlPropertyInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogAfterSaleDistribInd.
     * 
     */
    public boolean isCatalogAfterSaleDistribInd() {
        return catalogAfterSaleDistribInd;
    }

    /**
     * D�finit la valeur de la propri�t� catalogAfterSaleDistribInd.
     * 
     */
    public void setCatalogAfterSaleDistribInd(boolean value) {
        this.catalogAfterSaleDistribInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogClassificationInd.
     * 
     */
    public boolean isCatalogClassificationInd() {
        return catalogClassificationInd;
    }

    /**
     * D�finit la valeur de la propri�t� catalogClassificationInd.
     * 
     */
    public void setCatalogClassificationInd(boolean value) {
        this.catalogClassificationInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogClientTrgtInd.
     * 
     */
    public boolean isCatalogClientTrgtInd() {
        return catalogClientTrgtInd;
    }

    /**
     * D�finit la valeur de la propri�t� catalogClientTrgtInd.
     * 
     */
    public void setCatalogClientTrgtInd(boolean value) {
        this.catalogClientTrgtInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogDetailLevel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatalogDetailLevel() {
        return catalogDetailLevel;
    }

    /**
     * D�finit la valeur de la propri�t� catalogDetailLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatalogDetailLevel(Integer value) {
        this.catalogDetailLevel = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogEltInRelationInd.
     * 
     */
    public boolean isCatalogEltInRelationInd() {
        return catalogEltInRelationInd;
    }

    /**
     * D�finit la valeur de la propri�t� catalogEltInRelationInd.
     * 
     */
    public void setCatalogEltInRelationInd(boolean value) {
        this.catalogEltInRelationInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogMarketingTrgtInd.
     * 
     */
    public boolean isCatalogMarketingTrgtInd() {
        return catalogMarketingTrgtInd;
    }

    /**
     * D�finit la valeur de la propri�t� catalogMarketingTrgtInd.
     * 
     */
    public void setCatalogMarketingTrgtInd(boolean value) {
        this.catalogMarketingTrgtInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogSaleDistribInd.
     * 
     */
    public boolean isCatalogSaleDistribInd() {
        return catalogSaleDistribInd;
    }

    /**
     * D�finit la valeur de la propri�t� catalogSaleDistribInd.
     * 
     */
    public void setCatalogSaleDistribInd(boolean value) {
        this.catalogSaleDistribInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� eligibilityContext.
     * 
     * @return
     *     possible object is
     *     {@link SpecificCustomerContextDto }
     *     
     */
    public SpecificCustomerContextDto getEligibilityContext() {
        return eligibilityContext;
    }

    /**
     * D�finit la valeur de la propri�t� eligibilityContext.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificCustomerContextDto }
     *     
     */
    public void setEligibilityContext(SpecificCustomerContextDto value) {
        this.eligibilityContext = value;
    }

}
