
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour actWithIdDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="actWithIdDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="act" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}actDto" minOccurs="0"/>
 *         &lt;element name="distribAssemblyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribAssemblyOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribOptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribProductOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actWithIdDto", propOrder = {
    "act",
    "distribAssemblyId",
    "distribAssemblyOwnerId",
    "distribOptionId",
    "distribProductId",
    "distribProductOwnerId"
})
public class ActWithIdDto {

    protected ActDto act;
    protected String distribAssemblyId;
    protected String distribAssemblyOwnerId;
    protected String distribOptionId;
    protected String distribProductId;
    protected String distribProductOwnerId;

    /**
     * Obtient la valeur de la propri�t� act.
     * 
     * @return
     *     possible object is
     *     {@link ActDto }
     *     
     */
    public ActDto getAct() {
        return act;
    }

    /**
     * D�finit la valeur de la propri�t� act.
     * 
     * @param value
     *     allowed object is
     *     {@link ActDto }
     *     
     */
    public void setAct(ActDto value) {
        this.act = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribAssemblyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAssemblyId() {
        return distribAssemblyId;
    }

    /**
     * D�finit la valeur de la propri�t� distribAssemblyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAssemblyId(String value) {
        this.distribAssemblyId = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribAssemblyOwnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribAssemblyOwnerId() {
        return distribAssemblyOwnerId;
    }

    /**
     * D�finit la valeur de la propri�t� distribAssemblyOwnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribAssemblyOwnerId(String value) {
        this.distribAssemblyOwnerId = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribOptionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribOptionId() {
        return distribOptionId;
    }

    /**
     * D�finit la valeur de la propri�t� distribOptionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribOptionId(String value) {
        this.distribOptionId = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribProductId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribProductId() {
        return distribProductId;
    }

    /**
     * D�finit la valeur de la propri�t� distribProductId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribProductId(String value) {
        this.distribProductId = value;
    }

    /**
     * Obtient la valeur de la propri�t� distribProductOwnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribProductOwnerId() {
        return distribProductOwnerId;
    }

    /**
     * D�finit la valeur de la propri�t� distribProductOwnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribProductOwnerId(String value) {
        this.distribProductOwnerId = value;
    }

}
