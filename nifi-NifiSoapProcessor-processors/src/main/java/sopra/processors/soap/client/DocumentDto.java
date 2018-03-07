
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour documentDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="documentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distribDocumentLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribDocumentRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribDocumentTypId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distribDocumentTypLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentDto", propOrder = {
    "distribDocumentLbl",
    "distribDocumentRef",
    "distribDocumentTypId",
    "distribDocumentTypLbl"
})
public class DocumentDto {

    protected String distribDocumentLbl;
    protected String distribDocumentRef;
    protected String distribDocumentTypId;
    protected String distribDocumentTypLbl;

    /**
     * Obtient la valeur de la propriété distribDocumentLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribDocumentLbl() {
        return distribDocumentLbl;
    }

    /**
     * Définit la valeur de la propriété distribDocumentLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribDocumentLbl(String value) {
        this.distribDocumentLbl = value;
    }

    /**
     * Obtient la valeur de la propriété distribDocumentRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribDocumentRef() {
        return distribDocumentRef;
    }

    /**
     * Définit la valeur de la propriété distribDocumentRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribDocumentRef(String value) {
        this.distribDocumentRef = value;
    }

    /**
     * Obtient la valeur de la propriété distribDocumentTypId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribDocumentTypId() {
        return distribDocumentTypId;
    }

    /**
     * Définit la valeur de la propriété distribDocumentTypId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribDocumentTypId(String value) {
        this.distribDocumentTypId = value;
    }

    /**
     * Obtient la valeur de la propriété distribDocumentTypLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribDocumentTypLbl() {
        return distribDocumentTypLbl;
    }

    /**
     * Définit la valeur de la propriété distribDocumentTypLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribDocumentTypLbl(String value) {
        this.distribDocumentTypLbl = value;
    }

}
