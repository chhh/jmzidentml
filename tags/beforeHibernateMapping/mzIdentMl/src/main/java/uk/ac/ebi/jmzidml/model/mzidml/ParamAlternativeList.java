
package uk.ac.ebi.jmzidml.model.mzidml;

import uk.ac.ebi.jmzidml.model.AbstractParamGroup;
import uk.ac.ebi.jmzidml.model.MzIdentMLObject;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ParamListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://psidev.info/psi/pi/mzIdentML/1.0}ParamGroup" maxOccurs="unbounded"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamListType", propOrder = {
    "paramGroup"
})
public class ParamAlternativeList
    extends AbstractParamGroup
    implements Serializable, MzIdentMLObject
{

    private final static long serialVersionUID = 100L;
    @XmlElements({
        @XmlElement(name = "userParam", type = UserParam.class),
        @XmlElement(name = "cvParam", type = CvParam.class)
    })
    protected List<Param> paramGroup;

    /**
     * Gets the value of the paramGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserParam }
     * {@link CvParam }
     * 
     * 
     */
    public List<Param> getParamGroup() {
        if (paramGroup == null) {
            paramGroup = new ArrayList<Param>();
        }
        return this.paramGroup;
    }

}