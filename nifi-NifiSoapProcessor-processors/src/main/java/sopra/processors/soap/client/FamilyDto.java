
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour familyDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="familyDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribFamilyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribFamilyLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribFamilyLngLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribFamilyRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="familyUse" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}familyUseDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "familyDto", propOrder = {
    "distribFamilyId",
    "distribFamilyLbl",
    "distribFamilyLngLbl",
    "distribFamilyRank",
    "familyUse"
})
public class FamilyDto {

    protected String distribFamilyId;
    protected String distribFamilyLbl;
    protected String distribFamilyLngLbl;
    protected Integer distribFamilyRank;
    protected FamilyUseDto familyUse;

    /**
     * Obtient la valeur de la propri�t� distribFamilyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribFamilyId() {
        return distribFamilyId;
    }

    /**
     * D�finit la valeur de la propri�t� distribFamilyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribFamilyId(String value) {
        this.distribFamilyId = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribFamilyLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribFamilyLbl() {
        return distribFamilyLbl;
    }

    /**
     * D�finit la valeur de la propri�t� distribFamilyLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribFamilyLbl(String value) {
        this.distribFamilyLbl = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribFamilyLngLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribFamilyLngLbl() {
        return distribFamilyLngLbl;
    }

    /**
     * D�finit la valeur de la propri�t� distribFamilyLngLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribFamilyLngLbl(String value) {
        this.distribFamilyLngLbl = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribFamilyRank.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistribFamilyRank() {
        return distribFamilyRank;
    }

    /**
     * D�finit la valeur de la propri�t� distribFamilyRank.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistribFamilyRank(Integer value) {
        this.distribFamilyRank = value;
    }

    /**
     * Obtient la valeur de la propri�t� familyUse.
     * 
     * @return
     *     possible object is
     *     {@link FamilyUseDto }
     *     
     */
    public FamilyUseDto getFamilyUse() {
        return familyUse;
    }

    /**
     * D�finit la valeur de la propri�t� familyUse.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyUseDto }
     *     
     */
    public void setFamilyUse(FamilyUseDto value) {
        this.familyUse = value;
    }

}
