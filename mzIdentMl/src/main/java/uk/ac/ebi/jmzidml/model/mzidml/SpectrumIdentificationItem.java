
package uk.ac.ebi.jmzidml.model.mzidml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.ac.ebi.jmzidml.xml.jaxb.adapters.PeptideAdapter;


/**
 * An identification of a single (poly)peptide, resulting from querying an input spectra,
 *                 along with the set of confidence values for that identification. PeptideEvidence elements should be
 *                 given for all mappings of the corresponding Peptide sequence within protein sequences.
 *             
 * 
 * <p>Java class for PSI-PI.analysis.search.SpectrumIdentificationItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSI-PI.analysis.search.SpectrumIdentificationItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psidev.info/psi/pi/mzIdentML/1.0}FuGE.Common.IdentifiableType">
 *       &lt;sequence>
 *         &lt;element name="PeptideEvidence" type="{http://psidev.info/psi/pi/mzIdentML/1.0}PSI-PI.analysis.process.PeptideEvidenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://psidev.info/psi/pi/mzIdentML/1.0}ParamGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fragmentation" type="{http://psidev.info/psi/pi/mzIdentML/1.0}FragmentationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="chargeState" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="experimentalMassToCharge" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="calculatedMassToCharge" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="calculatedPI" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Peptide_ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rank" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="passThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MassTable_ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Sample_ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSI-PI.analysis.search.SpectrumIdentificationItemType", propOrder = {
    "peptideEvidence",
    "paramGroup",
    "fragmentation"
})
public class SpectrumIdentificationItem
    extends Identifiable
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "PeptideEvidence")
    protected List<PeptideEvidence> peptideEvidence;
    @XmlElements({
        @XmlElement(name = "userParam", type = UserParam.class),
        @XmlElement(name = "cvParam", type = CvParam.class)
    })
    protected List<Param> paramGroup;
    @XmlElement(name = "Fragmentation")
    protected Fragmentation fragmentation;
    @XmlAttribute(required = true)
    protected int chargeState;
    @XmlAttribute(required = true)
    protected double experimentalMassToCharge;
    @XmlAttribute
    protected Double calculatedMassToCharge;
    @XmlAttribute
    protected Float calculatedPI;
    @XmlAttribute(name = "Peptide_ref")
    @XmlJavaTypeAdapter(PeptideAdapter.class)
    protected Peptide peptide;
    @XmlAttribute(required = true)
    protected int rank;
    @XmlAttribute(required = true)
    protected boolean passThreshold;
    @XmlAttribute(name = "MassTable_ref")
    protected String massTableRef;
    @XmlAttribute(name = "Sample_ref")
    protected String sampleRef;

    /**
     * Gets the value of the peptideEvidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peptideEvidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeptideEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeptideEvidence }
     * 
     * 
     */
    public List<PeptideEvidence> getPeptideEvidence() {
        if (peptideEvidence == null) {
            peptideEvidence = new ArrayList<PeptideEvidence>();
        }
        return this.peptideEvidence;
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

    /**
     * Gets the value of the fragmentation property.
     * 
     * @return
     *     possible object is
     *     {@link Fragmentation }
     *     
     */
    public Fragmentation getFragmentation() {
        return fragmentation;
    }

    /**
     * Sets the value of the fragmentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fragmentation }
     *     
     */
    public void setFragmentation(Fragmentation value) {
        this.fragmentation = value;
    }

    /**
     * Gets the value of the chargeState property.
     * 
     */
    public int getChargeState() {
        return chargeState;
    }

    /**
     * Sets the value of the chargeState property.
     * 
     */
    public void setChargeState(int value) {
        this.chargeState = value;
    }

    /**
     * Gets the value of the experimentalMassToCharge property.
     * 
     */
    public double getExperimentalMassToCharge() {
        return experimentalMassToCharge;
    }

    /**
     * Sets the value of the experimentalMassToCharge property.
     * 
     */
    public void setExperimentalMassToCharge(double value) {
        this.experimentalMassToCharge = value;
    }

    /**
     * Gets the value of the calculatedMassToCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCalculatedMassToCharge() {
        return calculatedMassToCharge;
    }

    /**
     * Sets the value of the calculatedMassToCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCalculatedMassToCharge(Double value) {
        this.calculatedMassToCharge = value;
    }

    /**
     * Gets the value of the calculatedPI property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCalculatedPI() {
        return calculatedPI;
    }

    /**
     * Sets the value of the calculatedPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCalculatedPI(Float value) {
        this.calculatedPI = value;
    }

    /**
     * Gets the value of the peptide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Peptide getPeptide() {
        return peptide;
    }

    /**
     * Sets the value of the peptide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeptide(Peptide value) {
        this.peptide = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Gets the value of the passThreshold property.
     * 
     */
    public boolean isPassThreshold() {
        return passThreshold;
    }

    /**
     * Sets the value of the passThreshold property.
     * 
     */
    public void setPassThreshold(boolean value) {
        this.passThreshold = value;
    }

    /**
     * Gets the value of the massTableRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassTableRef() {
        return massTableRef;
    }

    /**
     * Sets the value of the massTableRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassTableRef(String value) {
        this.massTableRef = value;
    }

    /**
     * Gets the value of the sampleRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleRef() {
        return sampleRef;
    }

    /**
     * Sets the value of the sampleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleRef(String value) {
        this.sampleRef = value;
    }

}
