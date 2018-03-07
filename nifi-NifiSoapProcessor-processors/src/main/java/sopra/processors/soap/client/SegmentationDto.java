
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour segmentationDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="segmentationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribSegmentationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribSegmentationLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationDto", propOrder = {
    "distribSegmentationId",
    "distribSegmentationLbl"
})
public class SegmentationDto {

    protected String distribSegmentationId;
    protected String distribSegmentationLbl;

    /**
     * Obtient la valeur de la propriété distribSegmentationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribSegmentationId() {
        return distribSegmentationId;
    }

    /**
     * Définit la valeur de la propriété distribSegmentationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribSegmentationId(String value) {
        this.distribSegmentationId = value;
    }

    /**
     * Obtient la valeur de la propriété distribSegmentationLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribSegmentationLbl() {
        return distribSegmentationLbl;
    }

    /**
     * Définit la valeur de la propriété distribSegmentationLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribSegmentationLbl(String value) {
        this.distribSegmentationLbl = value;
    }

}
