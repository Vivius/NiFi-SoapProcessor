
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour channelDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="channelDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="communicationChannelCodId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="communicationChannelCodLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channelDto", propOrder = {
    "communicationChannelCodId",
    "communicationChannelCodLbl"
})
public class ChannelDto {

    protected String communicationChannelCodId;
    protected String communicationChannelCodLbl;

    /**
     * Obtient la valeur de la propriété communicationChannelCodId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationChannelCodId() {
        return communicationChannelCodId;
    }

    /**
     * Définit la valeur de la propriété communicationChannelCodId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationChannelCodId(String value) {
        this.communicationChannelCodId = value;
    }

    /**
     * Obtient la valeur de la propriété communicationChannelCodLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationChannelCodLbl() {
        return communicationChannelCodLbl;
    }

    /**
     * Définit la valeur de la propriété communicationChannelCodLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationChannelCodLbl(String value) {
        this.communicationChannelCodLbl = value;
    }

}
