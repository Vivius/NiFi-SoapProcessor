
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour segmentDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="segmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribRelevance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distribSegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribSegmentLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentation" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}segmentationDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentDto", propOrder = {
    "distribRelevance",
    "distribSegmentId",
    "distribSegmentLbl",
    "segmentation"
})
public class SegmentDto {

    protected Integer distribRelevance;
    protected String distribSegmentId;
    protected String distribSegmentLbl;
    protected SegmentationDto segmentation;

    /**
     * Obtient la valeur de la propriété distribRelevance.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistribRelevance() {
        return distribRelevance;
    }

    /**
     * Définit la valeur de la propriété distribRelevance.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistribRelevance(Integer value) {
        this.distribRelevance = value;
    }

    /**
     * Obtient la valeur de la propriété distribSegmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribSegmentId() {
        return distribSegmentId;
    }

    /**
     * Définit la valeur de la propriété distribSegmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribSegmentId(String value) {
        this.distribSegmentId = value;
    }

    /**
     * Obtient la valeur de la propriété distribSegmentLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribSegmentLbl() {
        return distribSegmentLbl;
    }

    /**
     * Définit la valeur de la propriété distribSegmentLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribSegmentLbl(String value) {
        this.distribSegmentLbl = value;
    }

    /**
     * Obtient la valeur de la propriété segmentation.
     * 
     * @return
     *     possible object is
     *     {@link SegmentationDto }
     *     
     */
    public SegmentationDto getSegmentation() {
        return segmentation;
    }

    /**
     * Définit la valeur de la propriété segmentation.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentationDto }
     *     
     */
    public void setSegmentation(SegmentationDto value) {
        this.segmentation = value;
    }

}
