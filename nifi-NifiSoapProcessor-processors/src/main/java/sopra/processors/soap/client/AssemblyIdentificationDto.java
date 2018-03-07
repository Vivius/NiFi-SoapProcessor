
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour assemblyIdentificationDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="assemblyIdentificationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribAssemblyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribAssemblyOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assemblyIdentificationDto", propOrder = {
    "distribAssemblyId",
    "distribAssemblyOwnerId"
})
public class AssemblyIdentificationDto {

    protected String distribAssemblyId;
    protected String distribAssemblyOwnerId;

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

}
