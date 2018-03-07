
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour classificationContextDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="classificationContextDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribFamilyIdList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribFamilyUseIdList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classificationContextDto", propOrder = {
    "distribFamilyIdList",
    "distribFamilyUseIdList"
})
public class ClassificationContextDto {

    @XmlElement(nillable = true)
    protected List<String> distribFamilyIdList;
    @XmlElement(nillable = true)
    protected List<String> distribFamilyUseIdList;

    /**
     * Gets the value of the distribFamilyIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distribFamilyIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistribFamilyIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistribFamilyIdList() {
        if (distribFamilyIdList == null) {
            distribFamilyIdList = new ArrayList<String>();
        }
        return this.distribFamilyIdList;
    }

    /**
     * Gets the value of the distribFamilyUseIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distribFamilyUseIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistribFamilyUseIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistribFamilyUseIdList() {
        if (distribFamilyUseIdList == null) {
            distribFamilyUseIdList = new ArrayList<String>();
        }
        return this.distribFamilyUseIdList;
    }

}
