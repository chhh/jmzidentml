
package uk.ac.ebi.jmzidml.model.mzidml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import uk.ac.ebi.jmzidml.model.MzIdentMLObject;


/**
 * A subclass of the abstract Material class, which should be used in conjunction with
 *                 controlled vocabulary terms to describe Materials of any types used in an investigation.
 *             
 * 
 * <p>Java class for FuGE.Bio.Material.GenericMaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FuGE.Bio.Material.GenericMaterialType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psidev.info/psi/pi/mzIdentML/1.0}FuGE.Bio.Material.MaterialType">
 *       &lt;sequence>
 *         &lt;element name="components" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="GenericMaterial_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuGE.Bio.Material.GenericMaterialType", propOrder = {
    "components"
})
public class GenericMaterial
    extends Material
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    protected List<GenericMaterial.Components> components;

    /**
     * Gets the value of the components property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericMaterial.Components }
     * 
     * 
     */
    public List<GenericMaterial.Components> getComponents() {
        if (components == null) {
            components = new ArrayList<GenericMaterial.Components>();
        }
        return this.components;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="GenericMaterial_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Components
        implements Serializable, MzIdentMLObject
    {

        private final static long serialVersionUID = 100L;
        @XmlAttribute(name = "GenericMaterial_ref", required = true)
        protected String genericMaterialRef;

        /**
         * Gets the value of the genericMaterialRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenericMaterialRef() {
            return genericMaterialRef;
        }

        /**
         * Sets the value of the genericMaterialRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenericMaterialRef(String value) {
            this.genericMaterialRef = value;
        }

    }

}
