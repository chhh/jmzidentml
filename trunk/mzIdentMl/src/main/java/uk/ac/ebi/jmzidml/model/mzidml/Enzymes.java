package uk.ac.ebi.jmzidml.model.mzidml;

import uk.ac.ebi.jmzidml.model.MzIdentMLObject;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * The list of enzymes used in experiment
 * <p/>
 * <p>Java class for PSI-PI.analysis.search.EnzymesType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="PSI-PI.analysis.search.EnzymesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enzyme" type="{http://psidev.info/psi/pi/mzIdentML/1.0}PSI-PI.analysis.search.EnzymeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="independent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSI-PI.analysis.search.EnzymesType", propOrder = {
        "enzyme"
})
public class Enzymes
        implements Serializable, MzIdentMLObject {

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Enzyme", required = true)
    protected List<Enzyme> enzyme;
    @XmlAttribute
    protected Boolean independent;

    /**
     * Gets the value of the enzyme property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enzyme property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnzyme().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Enzyme }
     */
    public List<Enzyme> getEnzyme() {
        if (enzyme == null) {
            enzyme = new ArrayList<Enzyme>();
        }
        return this.enzyme;
    }

    /**
     * Gets the value of the independent property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isIndependent() {
        return independent;
    }

    /**
     * Sets the value of the independent property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIndependent(Boolean value) {
        this.independent = value;
    }

}
