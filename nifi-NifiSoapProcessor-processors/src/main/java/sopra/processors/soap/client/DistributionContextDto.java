
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour distributionContextDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="distributionContextDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="communicationChannelCodList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distributorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distributionContextDto", propOrder = {
    "communicationChannelCodList",
    "distributorId"
})
public class DistributionContextDto {

    @XmlElement(nillable = true)
    protected List<String> communicationChannelCodList;
    protected String distributorId;

    /**
     * Gets the value of the communicationChannelCodList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationChannelCodList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationChannelCodList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCommunicationChannelCodList() {
        if (communicationChannelCodList == null) {
            communicationChannelCodList = new ArrayList<String>();
        }
        return this.communicationChannelCodList;
    }

    /**
     * Obtient la valeur de la propriété distributorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributorId() {
        return distributorId;
    }

    /**
     * Définit la valeur de la propriété distributorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributorId(String value) {
        this.distributorId = value;
    }

}
