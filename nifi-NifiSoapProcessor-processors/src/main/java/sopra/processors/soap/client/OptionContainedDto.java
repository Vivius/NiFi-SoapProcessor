
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour optionContainedDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="optionContainedDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogPresenceCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="option" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}optionDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optionContainedDto", propOrder = {
    "catalogPresenceCod",
    "option"
})
public class OptionContainedDto {

    protected String catalogPresenceCod;
    protected OptionDto option;

    /**
     * Obtient la valeur de la propri�t� catalogPresenceCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogPresenceCod() {
        return catalogPresenceCod;
    }

    /**
     * D�finit la valeur de la propri�t� catalogPresenceCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogPresenceCod(String value) {
        this.catalogPresenceCod = value;
    }

    /**
     * Obtient la valeur de la propri�t� option.
     * 
     * @return
     *     possible object is
     *     {@link OptionDto }
     *     
     */
    public OptionDto getOption() {
        return option;
    }

    /**
     * D�finit la valeur de la propri�t� option.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionDto }
     *     
     */
    public void setOption(OptionDto value) {
        this.option = value;
    }

}
