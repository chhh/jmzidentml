
package uk.ac.ebi.jmzidml.model.mzidml;

import uk.ac.ebi.jmzidml.xml.jaxb.adapters.AnalysisSoftwareAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * The parameters and settings of a ProteinDetection process.
 * 
 * <p>Java class for PSI-PI.analysis.process.ProteinDetectionProtocolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSI-PI.analysis.process.ProteinDetectionProtocolType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psidev.info/psi/pi/mzIdentML/1.0}FuGE.Common.Protocol.ProtocolType">
 *       &lt;sequence>
 *         &lt;element name="AnalysisParams" type="{http://psidev.info/psi/pi/mzIdentML/1.0}ParamListType" minOccurs="0"/>
 *         &lt;element name="Threshold" type="{http://psidev.info/psi/pi/mzIdentML/1.0}ParamListType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AnalysisSoftware_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSI-PI.analysis.process.ProteinDetectionProtocolType", propOrder = {
    "analysisParams",
    "threshold"
})
public class ProteinDetectionProtocol
    extends Protocol
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AnalysisParams")
    protected ParamAlternativeList analysisParams;
    @XmlElement(name = "Threshold", required = true)
    protected ParamAlternativeList threshold;
    @XmlAttribute(name = "AnalysisSoftware_ref", required = true)
    @XmlJavaTypeAdapter(AnalysisSoftwareAdapter.class)
    protected AnalysisSoftware analysisSoftware;

    /**
     * Gets the value of the analysisParams property.
     * 
     * @return
     *     possible object is
     *     {@link ParamAlternativeList }
     *     
     */
    public ParamAlternativeList getAnalysisParams() {
        return analysisParams;
    }

    /**
     * Sets the value of the analysisParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamAlternativeList }
     *     
     */
    public void setAnalysisParams(ParamAlternativeList value) {
        this.analysisParams = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link ParamAlternativeList }
     *     
     */
    public ParamAlternativeList getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamAlternativeList }
     *     
     */
    public void setThreshold(ParamAlternativeList value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the analysisSoftwareRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public AnalysisSoftware getAnalysisSoftware() {
        return analysisSoftware;
    }

    /**
     * Sets the value of the analysisSoftwareRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisSoftware(AnalysisSoftware value) {
        this.analysisSoftware = value;
    }

}