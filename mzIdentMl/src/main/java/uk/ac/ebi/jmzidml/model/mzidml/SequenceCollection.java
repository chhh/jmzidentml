
package uk.ac.ebi.jmzidml.model.mzidml;

import uk.ac.ebi.jmzidml.model.MzIdentMLObject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SequenceCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBSequence" type="{http://psidev.info/psi/pi/mzIdentML/1.1}DBSequenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Peptide" type="{http://psidev.info/psi/pi/mzIdentML/1.1}PeptideType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PeptideEvidenceList" type="{http://psidev.info/psi/pi/mzIdentML/1.1}PeptideEvidenceListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceCollectionType", propOrder = {
    "dbSequence",
    "peptide",
    "peptideEvidenceList"
})
public class SequenceCollection
    extends MzIdentMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "DBSequence")
    protected List<DBSequence> dbSequence;
    @XmlElement(name = "Peptide")
    protected List<Peptide> peptide;
    @XmlElement(name = "PeptideEvidenceList")
    protected List<PeptideEvidenceList> peptideEvidenceList;

    /**
     * Gets the value of the dbSequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbSequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDBSequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DBSequence }
     * 
     * 
     */
    public List<DBSequence> getDBSequence() {
        if (dbSequence == null) {
            dbSequence = new ArrayList<DBSequence>();
        }
        return this.dbSequence;
    }

    /**
     * Gets the value of the peptide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peptide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeptide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Peptide }
     * 
     * 
     */
    public List<Peptide> getPeptide() {
        if (peptide == null) {
            peptide = new ArrayList<Peptide>();
        }
        return this.peptide;
    }

    /**
     * Gets the value of the peptideEvidenceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peptideEvidenceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeptideEvidenceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeptideEvidenceList }
     * 
     * 
     */
    public List<PeptideEvidenceList> getPeptideEvidenceList() {
        if (peptideEvidenceList == null) {
            peptideEvidenceList = new ArrayList<PeptideEvidenceList>();
        }
        return this.peptideEvidenceList;
    }

}
