
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour needDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="needDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribNeedId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribNeedLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribRelevance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="needTargetElt" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}needTargetEltDto" minOccurs="0"/>
 *         &lt;element name="specializedRelevanceList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}specializedRelevanceDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "needDto", propOrder = {
    "distribNeedId",
    "distribNeedLbl",
    "distribRelevance",
    "needTargetElt",
    "specializedRelevanceList"
})
public class NeedDto {

    protected String distribNeedId;
    protected String distribNeedLbl;
    protected Integer distribRelevance;
    protected NeedTargetEltDto needTargetElt;
    @XmlElement(nillable = true)
    protected List<SpecializedRelevanceDto> specializedRelevanceList;

    /**
     * Obtient la valeur de la propriété distribNeedId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribNeedId() {
        return distribNeedId;
    }

    /**
     * Définit la valeur de la propriété distribNeedId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribNeedId(String value) {
        this.distribNeedId = value;
    }

    /**
     * Obtient la valeur de la propriété distribNeedLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribNeedLbl() {
        return distribNeedLbl;
    }

    /**
     * Définit la valeur de la propriété distribNeedLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribNeedLbl(String value) {
        this.distribNeedLbl = value;
    }

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
     * Obtient la valeur de la propriété needTargetElt.
     * 
     * @return
     *     possible object is
     *     {@link NeedTargetEltDto }
     *     
     */
    public NeedTargetEltDto getNeedTargetElt() {
        return needTargetElt;
    }

    /**
     * Définit la valeur de la propriété needTargetElt.
     * 
     * @param value
     *     allowed object is
     *     {@link NeedTargetEltDto }
     *     
     */
    public void setNeedTargetElt(NeedTargetEltDto value) {
        this.needTargetElt = value;
    }

    /**
     * Gets the value of the specializedRelevanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specializedRelevanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecializedRelevanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecializedRelevanceDto }
     * 
     * 
     */
    public List<SpecializedRelevanceDto> getSpecializedRelevanceList() {
        if (specializedRelevanceList == null) {
            specializedRelevanceList = new ArrayList<SpecializedRelevanceDto>();
        }
        return this.specializedRelevanceList;
    }

}
