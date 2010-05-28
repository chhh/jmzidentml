package uk.ac.ebi.jmzidml.model.mzidml;

import uk.ac.ebi.jmzidml.model.MzIdentMLObject;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DatabaseTranslationType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="DatabaseTranslationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TranslationTable" type="{http://psidev.info/psi/pi/mzIdentML/1.0}TranslationTableType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="frames" type="{http://psidev.info/psi/pi/mzIdentML/1.0}listOfAllowedFrames" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseTranslationType", propOrder = {
        "translationTable"
})
public class DatabaseTranslation
        implements Serializable, MzIdentMLObject {

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TranslationTable", required = true)
    protected List<TranslationTable> translationTable;
    @XmlAttribute
    protected List<Integer> frames;

    /**
     * Gets the value of the translationTable property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translationTable property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslationTable().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link TranslationTable }
     */
    public List<TranslationTable> getTranslationTable() {
        if (translationTable == null) {
            translationTable = new ArrayList<TranslationTable>();
        }
        return this.translationTable;
    }

    /**
     * Gets the value of the frames property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frames property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrames().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     */
    public List<Integer> getFrames() {
        if (frames == null) {
            frames = new ArrayList<Integer>();
        }
        return this.frames;
    }

}
