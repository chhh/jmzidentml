
package uk.ac.ebi.jmzidml.model.mzidml;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * A database sequence from the specified SearchDatabase (nucleic acid or amino acid). If
 *                 the sequence is nucleic acid, the source nucleic acid sequence should be given in the seq attribute
 *                 rather than a translated sequence.
 *             
 * 
 * <p>Java class for PSI-PI.analysis.search.DBSequenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSI-PI.analysis.search.DBSequenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psidev.info/psi/pi/mzIdentML/1.0}FuGE.Bio.ConceptualMolecule.ConceptualMoleculeType">
 *       &lt;sequence>
 *         &lt;element name="seq" type="{http://psidev.info/psi/pi/mzIdentML/1.0}sequence" minOccurs="0"/>
 *         &lt;group ref="{http://psidev.info/psi/pi/mzIdentML/1.0}ParamGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SearchDatabase_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSI-PI.analysis.search.DBSequenceType", propOrder = {
    "seq",
    "paramGroup"
})
public class DBSequence
    extends ConceptualMolecule
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    protected String seq;
    @XmlElements({
        @XmlElement(name = "cvParam", type = CvParam.class),
        @XmlElement(name = "userParam", type = UserParam.class)
    })
    protected List<Param> paramGroup;
    @XmlAttribute
    protected Integer length;
    @XmlAttribute(name = "SearchDatabase_ref", required = true)
    protected String searchDatabaseRef;
    @XmlAttribute(required = true)
    protected String accession;

    public AnalysisSearchDatabase getAnalysisSearchDatabase() {
        return analysisSearchDatabase;
    }

    public void setAnalysisSearchDatabase(AnalysisSearchDatabase analysisSearchDatabase) {
        this.analysisSearchDatabase = analysisSearchDatabase;
    }

    @XmlTransient
    private AnalysisSearchDatabase analysisSearchDatabase;

    public AnalysisSearchDatabase getSearchDatabase() {
        return analysisSearchDatabase;
    }

    public void setSearchDatabase(AnalysisSearchDatabase analysisSearchDatabase) {
        this.analysisSearchDatabase = analysisSearchDatabase;
        if (analysisSearchDatabase != null) {
            this.searchDatabaseRef = analysisSearchDatabase.getId();
        }
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeq(String value) {
        this.seq = value;
    }

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
     * {@link CvParam }
     * {@link UserParam }
     * 
     * 
     */
    public List<Param> getParamGroup() {
        if (paramGroup == null) {
            paramGroup = new ArrayList<Param>();
        }
        return this.paramGroup;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the searchDatabaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchDatabaseRef() {
        return searchDatabaseRef;
    }

    /**
     * Sets the value of the searchDatabaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchDatabaseRef(String value) {
        this.searchDatabaseRef = value;
        if ( analysisSearchDatabase != null && !analysisSearchDatabase.getId().equals(value) ) {
            analysisSearchDatabase = null;
        }
    }

    /**
     * Gets the value of the accession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccession() {
        return accession;
    }

    /**
     * Sets the value of the accession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccession(String value) {
        this.accession = value;
    }

}
