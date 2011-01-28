
package uk.ac.ebi.jmzidml.model.mzidml;

import uk.ac.ebi.jmzidml.model.MzIdentMLObject;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ModificationParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModificationParamsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchModification" type="{http://psidev.info/psi/pi/mzIdentML/1.0}PSI-PI.analysis.search.SearchModificationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationParamsType", propOrder = {
    "searchModification"
})
public class ModificationParams
    implements Serializable, MzIdentMLObject
{
    @XmlTransient
    private Long hid;

    public Long getHid() {
        return hid;
    }



    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SearchModification", required = true)
    protected List<SearchModification> searchModification;

    /**
     * Gets the value of the searchModification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchModification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchModification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchModification }
     * 
     * 
     */
    public List<SearchModification> getSearchModification() {
        if (searchModification == null) {
            searchModification = new ArrayList<SearchModification>();
        }
        return this.searchModification;
    }

}
