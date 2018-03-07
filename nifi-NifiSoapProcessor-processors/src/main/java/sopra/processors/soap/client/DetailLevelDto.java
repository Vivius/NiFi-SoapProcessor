
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour detailLevelDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété catalogAddtlPropertyInd.
     * 
     */
    public boolean isCatalogAddtlPropertyInd() {
        return catalogAddtlPropertyInd;
    }

    /**
     * Définit la valeur de la propriété catalogAddtlPropertyInd.
     * 
     */
    public void setCatalogAddtlPropertyInd(boolean value) {
        this.catalogAddtlPropertyInd = value;
    }

    /**
     * Obtient la valeur de la propriété catalogAfterSaleDistribInd.
     * 
     */
    public boolean isCatalogAfterSaleDistribInd() {
        return catalogAfterSaleDistribInd;
    }

    /**
     * Définit la valeur de la propriété catalogAfterSaleDistribInd.
     * 
     */
    public void setCatalogAfterSaleDistribInd(boolean value) {
        this.catalogAfterSaleDistribInd = value;
    }

    /**
     * Obtient la valeur de la propriété catalogClassificationInd.
     * 
     */
    public boolean isCatalogClassificationInd() {
        return catalogClassificationInd;
    }

    /**
     * Définit la valeur de la propriété catalogClassificationInd.
     * 
     */
    public void setCatalogClassificationInd(boolean value) {
        this.catalogClassificationInd = value;
    }

    /**
     * Obtient la valeur de la propriété catalogClientTrgtInd.
     * 
     */
    public boolean isCatalogClientTrgtInd() {
        return catalogClientTrgtInd;
    }

    /**
     * Définit la valeur de la propriété catalogClientTrgtInd.
     * 
     */
    public void setCatalogClientTrgtInd(boolean value) {
        this.catalogClientTrgtInd = value;
    }

    /**
     * Obtient la valeur de la propriété catalogDetailLevel.
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
     * Définit la valeur de la propriété catalogDetailLevel.
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
     * Obtient la valeur de la propriété catalogEltInRelationInd.
     * 
     */
    public boolean isCatalogEltInRelationInd() {
        return catalogEltInRelationInd;
    }

    /**
     * Définit la valeur de la propriété catalogEltInRelationInd.
     * 
     */
    public void setCatalogEltInRelationInd(boolean value) {
        this.catalogEltInRelationInd = value;
    }

    /**
     * Obtient la valeur de la propriété catalogMarketingTrgtInd.
     * 
     */
    public boolean isCatalogMarketingTrgtInd() {
        return catalogMarketingTrgtInd;
    }

    /**
     * Définit la valeur de la propriété catalogMarketingTrgtInd.
     * 
     */
    public void setCatalogMarketingTrgtInd(boolean value) {
        this.catalogMarketingTrgtInd = value;
    }

    /**
     * Obtient la valeur de la propriété catalogSaleDistribInd.
     * 
     */
    public boolean isCatalogSaleDistribInd() {
        return catalogSaleDistribInd;
    }

    /**
     * Définit la valeur de la propriété catalogSaleDistribInd.
     * 
     */
    public void setCatalogSaleDistribInd(boolean value) {
        this.catalogSaleDistribInd = value;
    }

    /**
     * Obtient la valeur de la propriété eligibilityContext.
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
     * Définit la valeur de la propriété eligibilityContext.
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
