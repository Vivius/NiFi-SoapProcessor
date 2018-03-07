
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour marketingContextDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="marketingContextDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribNeedIdList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribNeedUniverseIdList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marketingContextDto", propOrder = {
    "distribNeedIdList",
    "distribNeedUniverseIdList"
})
public class MarketingContextDto {

    @XmlElement(nillable = true)
    protected List<String> distribNeedIdList;
    @XmlElement(nillable = true)
    protected List<String> distribNeedUniverseIdList;

    /**
     * Gets the value of the distribNeedIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distribNeedIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistribNeedIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistribNeedIdList() {
        if (distribNeedIdList == null) {
            distribNeedIdList = new ArrayList<String>();
        }
        return this.distribNeedIdList;
    }

    /**
     * Gets the value of the distribNeedUniverseIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distribNeedUniverseIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistribNeedUniverseIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistribNeedUniverseIdList() {
        if (distribNeedUniverseIdList == null) {
            distribNeedUniverseIdList = new ArrayList<String>();
        }
        return this.distribNeedUniverseIdList;
    }

}
