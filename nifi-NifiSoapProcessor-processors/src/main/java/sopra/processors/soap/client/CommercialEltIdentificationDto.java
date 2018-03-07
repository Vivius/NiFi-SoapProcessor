
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour commercialEltIdentificationDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commercialEltIdentificationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assemblyIdentification" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}assemblyIdentificationDto" minOccurs="0"/>
 *         &lt;element name="optionIdentification" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionIdentificationDto" minOccurs="0"/>
 *         &lt;element name="productIdentification" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}productIdentificationDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commercialEltIdentificationDto", propOrder = {
    "assemblyIdentification",
    "optionIdentification",
    "productIdentification"
})
public class CommercialEltIdentificationDto {

    protected AssemblyIdentificationDto assemblyIdentification;
    protected OptionIdentificationDto optionIdentification;
    protected ProductIdentificationDto productIdentification;

    /**
     * Obtient la valeur de la propriété assemblyIdentification.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyIdentificationDto }
     *     
     */
    public AssemblyIdentificationDto getAssemblyIdentification() {
        return assemblyIdentification;
    }

    /**
     * Définit la valeur de la propriété assemblyIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyIdentificationDto }
     *     
     */
    public void setAssemblyIdentification(AssemblyIdentificationDto value) {
        this.assemblyIdentification = value;
    }

    /**
     * Obtient la valeur de la propriété optionIdentification.
     * 
     * @return
     *     possible object is
     *     {@link OptionIdentificationDto }
     *     
     */
    public OptionIdentificationDto getOptionIdentification() {
        return optionIdentification;
    }

    /**
     * Définit la valeur de la propriété optionIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionIdentificationDto }
     *     
     */
    public void setOptionIdentification(OptionIdentificationDto value) {
        this.optionIdentification = value;
    }

    /**
     * Obtient la valeur de la propriété productIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDto }
     *     
     */
    public ProductIdentificationDto getProductIdentification() {
        return productIdentification;
    }

    /**
     * Définit la valeur de la propriété productIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDto }
     *     
     */
    public void setProductIdentification(ProductIdentificationDto value) {
        this.productIdentification = value;
    }

}
