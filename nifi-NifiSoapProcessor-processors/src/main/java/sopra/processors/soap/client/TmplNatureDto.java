
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour tmplNatureDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tmplNatureDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogTmplNatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogTmplNatLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateNatureType" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}tmplNatureTypeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tmplNatureDto", propOrder = {
    "catalogTmplNatId",
    "catalogTmplNatLbl",
    "templateNatureType"
})
public class TmplNatureDto {

    protected String catalogTmplNatId;
    protected String catalogTmplNatLbl;
    protected TmplNatureTypeDto templateNatureType;

    /**
     * Obtient la valeur de la propri�t� catalogTmplNatId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogTmplNatId() {
        return catalogTmplNatId;
    }

    /**
     * D�finit la valeur de la propri�t� catalogTmplNatId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogTmplNatId(String value) {
        this.catalogTmplNatId = value;
    }

    /**
     * Obtient la valeur de la propri�t� catalogTmplNatLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogTmplNatLbl() {
        return catalogTmplNatLbl;
    }

    /**
     * D�finit la valeur de la propri�t� catalogTmplNatLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogTmplNatLbl(String value) {
        this.catalogTmplNatLbl = value;
    }

    /**
     * Obtient la valeur de la propri�t� templateNatureType.
     * 
     * @return
     *     possible object is
     *     {@link TmplNatureTypeDto }
     *     
     */
    public TmplNatureTypeDto getTemplateNatureType() {
        return templateNatureType;
    }

    /**
     * D�finit la valeur de la propri�t� templateNatureType.
     * 
     * @param value
     *     allowed object is
     *     {@link TmplNatureTypeDto }
     *     
     */
    public void setTemplateNatureType(TmplNatureTypeDto value) {
        this.templateNatureType = value;
    }

}
