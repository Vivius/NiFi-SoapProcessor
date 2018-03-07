
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerContextDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerContextDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribMarketIdList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribSegmentIdList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerContextDto", propOrder = {
    "distribMarketIdList",
    "distribSegmentIdList"
})
public class CustomerContextDto {

    @XmlElement(nillable = true)
    protected List<String> distribMarketIdList;
    @XmlElement(nillable = true)
    protected List<String> distribSegmentIdList;

    /**
     * Gets the value of the distribMarketIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distribMarketIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistribMarketIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistribMarketIdList() {
        if (distribMarketIdList == null) {
            distribMarketIdList = new ArrayList<String>();
        }
        return this.distribMarketIdList;
    }

    /**
     * Gets the value of the distribSegmentIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distribSegmentIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistribSegmentIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistribSegmentIdList() {
        if (distribSegmentIdList == null) {
            distribSegmentIdList = new ArrayList<String>();
        }
        return this.distribSegmentIdList;
    }

}
