
package sopra.processors.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour assemblyContainedDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="assemblyContainedDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assembly" type="{http://published.service.v3_0.endpoint.catalog.evolan.sopra.com/}assemblyDto" minOccurs="0"/>
 *         &lt;element name="catalogPresenceCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assemblyContainedDto", propOrder = {
    "assembly",
    "catalogPresenceCod"
})
public class AssemblyContainedDto {

    protected AssemblyDto assembly;
    protected String catalogPresenceCod;

    /**
     * Obtient la valeur de la propriété assembly.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyDto }
     *     
     */
    public AssemblyDto getAssembly() {
        return assembly;
    }

    /**
     * Définit la valeur de la propriété assembly.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyDto }
     *     
     */
    public void setAssembly(AssemblyDto value) {
        this.assembly = value;
    }

    /**
     * Obtient la valeur de la propriété catalogPresenceCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogPresenceCod() {
        return catalogPresenceCod;
    }

    /**
     * Définit la valeur de la propriété catalogPresenceCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogPresenceCod(String value) {
        this.catalogPresenceCod = value;
    }

}
