
package uk.ac.ebi.jmzidml.model.mzidml;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.ac.ebi.jmzidml.xml.jaxb.adapters.CalendarAdapter;


/**
 * The use of a protocol with the requisite Parameters and ParameterValues.
 *                 ProtocolApplications can take Material or Data (or both) as input and produce Material or Data (or both)
 *                 as output. ProtocolApplication is abstract and should be subclassed in the development of modular
 *                 formats. The subclass GenericProtocolApplication can be used without extension.
 *             
 * 
 * <p>Java class for FuGE.Common.Protocol.ProtocolApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FuGE.Common.Protocol.ProtocolApplicationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psidev.info/psi/pi/mzIdentML/1.0}FuGE.Common.IdentifiableType">
 *       &lt;attribute name="activityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuGE.Common.Protocol.ProtocolApplicationType")
@XmlSeeAlso({
    GenericProtocolApplication.class,
    ProteinDetection.class,
    SpectrumIdentification.class
})
public abstract class ProtocolApplication
    extends Identifiable
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlAttribute
    @XmlJavaTypeAdapter(CalendarAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar activityDate;

    /**
     * Gets the value of the activityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getActivityDate() {
        return activityDate;
    }

    /**
     * Sets the value of the activityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityDate(Calendar value) {
        this.activityDate = value;
    }

}
