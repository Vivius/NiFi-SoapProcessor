
package sopra.processors.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour detailByChannelDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="detailByChannelDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channelList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}channelDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="characteristicEltList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}characteristicDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="characteristicGrpList" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}groupOfCharDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailByChannelDto", propOrder = {
    "channelList",
    "characteristicEltList",
    "characteristicGrpList"
})
public class DetailByChannelDto {

    @XmlElement(nillable = true)
    protected List<ChannelDto> channelList;
    @XmlElement(nillable = true)
    protected List<CharacteristicDto> characteristicEltList;
    @XmlElement(nillable = true)
    protected List<GroupOfCharDto> characteristicGrpList;

    /**
     * Gets the value of the channelList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelDto }
     * 
     * 
     */
    public List<ChannelDto> getChannelList() {
        if (channelList == null) {
            channelList = new ArrayList<ChannelDto>();
        }
        return this.channelList;
    }

    /**
     * Gets the value of the characteristicEltList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicEltList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicEltList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicDto }
     * 
     * 
     */
    public List<CharacteristicDto> getCharacteristicEltList() {
        if (characteristicEltList == null) {
            characteristicEltList = new ArrayList<CharacteristicDto>();
        }
        return this.characteristicEltList;
    }

    /**
     * Gets the value of the characteristicGrpList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicGrpList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicGrpList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfCharDto }
     * 
     * 
     */
    public List<GroupOfCharDto> getCharacteristicGrpList() {
        if (characteristicGrpList == null) {
            characteristicGrpList = new ArrayList<GroupOfCharDto>();
        }
        return this.characteristicGrpList;
    }

}
