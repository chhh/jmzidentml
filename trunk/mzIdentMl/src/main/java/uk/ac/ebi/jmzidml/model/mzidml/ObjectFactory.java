
package uk.ac.ebi.jmzidml.model.mzidml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.ac.ebi.jmzidml.model.mzidml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UserParam_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "userParam");
    private final static QName _AuditCollection_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "AuditCollection");
    private final static QName _PropertyValue_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "PropertyValue");
    private final static QName _Organization_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "Organization");
    private final static QName _BibliographicReference_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "BibliographicReference");
    private final static QName _Cv_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "cv");
    private final static QName _CvParam_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "cvParam");
    private final static QName _Provider_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "Provider");
    private final static QName _Person_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "Person");
    private final static QName _ContactRole_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "ContactRole");
    private final static QName _MzIdentML_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "mzIdentML");
    private final static QName _ExternalData_QNAME = new QName("http://psidev.info/psi/pi/mzIdentML/1.0", "ExternalData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.ac.ebi.jmzidml.model.mzidml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Organization.Parent }
     * 
     */
    public Organization.Parent createOrganizationParent() {
        return new Organization.Parent();
    }

    /**
     * Create an instance of {@link ParamAlternative }
     * 
     */
    public ParamAlternative createParamAlternative() {
        return new ParamAlternative();
    }

    /**
     * Create an instance of {@link BibliographicReference }
     * 
     */
    public BibliographicReference createBibliographicReference() {
        return new BibliographicReference();
    }

    /**
     * Create an instance of {@link DBSequence }
     * 
     */
    public DBSequence createDBSequence() {
        return new DBSequence();
    }

    /**
     * Create an instance of {@link AnalysisSampleCollection }
     * 
     */
    public AnalysisSampleCollection createAnalysisSampleCollection() {
        return new AnalysisSampleCollection();
    }

    /**
     * Create an instance of {@link DatabaseFilters }
     * 
     */
    public DatabaseFilters createDatabaseFilters() {
        return new DatabaseFilters();
    }

    /**
     * Create an instance of {@link Fragmentation }
     * 
     */
    public Fragmentation createFragmentation() {
        return new Fragmentation();
    }

    /**
     * Create an instance of {@link DataCollection }
     * 
     */
    public DataCollection createDataCollection() {
        return new DataCollection();
    }

    /**
     * Create an instance of {@link Tolerance }
     * 
     */
    public Tolerance createTolerance() {
        return new Tolerance();
    }

    /**
     * Create an instance of {@link AmbiguousResidue }
     * 
     */
    public AmbiguousResidue createAmbiguousResidue() {
        return new AmbiguousResidue();
    }

    /**
     * Create an instance of {@link ProteinDetectionList }
     * 
     */
    public ProteinDetectionList createProteinDetectionList() {
        return new ProteinDetectionList();
    }

    /**
     * Create an instance of {@link ProteinAmbiguityGroup }
     * 
     */
    public ProteinAmbiguityGroup createProteinAmbiguityGroup() {
        return new ProteinAmbiguityGroup();
    }

    /**
     * Create an instance of {@link CvList }
     * 
     */
    public CvList createCvList() {
        return new CvList();
    }

    /**
     * Create an instance of {@link ContactRole }
     * 
     */
    public ContactRole createContactRole() {
        return new ContactRole();
    }

    /**
     * Create an instance of {@link SpectrumIDFormat }
     * 
     */
    public SpectrumIDFormat createSpectrumIDFormat() {
        return new SpectrumIDFormat();
    }

    /**
     * Create an instance of {@link AuditCollection }
     * 
     */
    public AuditCollection createAuditCollection() {
        return new AuditCollection();
    }

    /**
     * Create an instance of {@link MzIdentML }
     * 
     */
    public MzIdentML createMzIdentML() {
        return new MzIdentML();
    }

    /**
     * Create an instance of {@link SequenceCollection }
     * 
     */
    public SequenceCollection createSequenceCollection() {
        return new SequenceCollection();
    }

    /**
     * Create an instance of {@link SpecificityRules }
     * 
     */
    public SpecificityRules createSpecificityRules() {
        return new SpecificityRules();
    }

    /**
     * Create an instance of {@link Modification }
     * 
     */
    public Modification createModification() {
        return new Modification();
    }

    /**
     * Create an instance of {@link Person.Affiliations }
     * 
     */
    public Person.Affiliations createPersonAffiliations() {
        return new Person.Affiliations();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link AnalysisData }
     * 
     */
    public AnalysisData createAnalysisData() {
        return new AnalysisData();
    }

    /**
     * Create an instance of {@link InputSpectra }
     * 
     */
    public InputSpectra createInputSpectra() {
        return new InputSpectra();
    }

    /**
     * Create an instance of {@link DatabaseTranslation }
     * 
     */
    public DatabaseTranslation createDatabaseTranslation() {
        return new DatabaseTranslation();
    }

    /**
     * Create an instance of {@link Cv }
     * 
     */
    public Cv createCv() {
        return new Cv();
    }

    /**
     * Create an instance of {@link MassTable }
     * 
     */
    public MassTable createMassTable() {
        return new MassTable();
    }

    /**
     * Create an instance of {@link FragmentationTable }
     * 
     */
    public FragmentationTable createFragmentationTable() {
        return new FragmentationTable();
    }

    /**
     * Create an instance of {@link SourceFile }
     * 
     */
    public SourceFile createSourceFile() {
        return new SourceFile();
    }

    /**
     * Create an instance of {@link SpectrumIdentificationList }
     * 
     */
    public SpectrumIdentificationList createSpectrumIdentificationList() {
        return new SpectrumIdentificationList();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link AnalysisProtocolCollection }
     * 
     */
    public AnalysisProtocolCollection createAnalysisProtocolCollection() {
        return new AnalysisProtocolCollection();
    }

    /**
     * Create an instance of {@link SubstitutionModification }
     * 
     */
    public SubstitutionModification createSubstitutionModification() {
        return new SubstitutionModification();
    }

    /**
     * Create an instance of {@link Enzymes }
     * 
     */
    public Enzymes createEnzymes() {
        return new Enzymes();
    }

    /**
     * Create an instance of {@link uk.ac.ebi.jmzidml.model.mzidml.FileFormat }
     * 
     */
    public FileFormat createExternalDataFileFormat() {
        return new FileFormat();
    }

    /**
     * Create an instance of {@link SpectraData }
     * 
     */
    public SpectraData createSpectraData() {
        return new SpectraData();
    }

    /**
     * Create an instance of {@link SearchDatabase }
     * 
     */
    public SearchDatabase createSearchDatabase() {
        return new SearchDatabase();
    }

    /**
     * Create an instance of {@link TranslationTable }
     * 
     */
    public TranslationTable createTranslationTable() {
        return new TranslationTable();
    }

    /**
     * Create an instance of {@link SpectrumIdentificationResult }
     * 
     */
    public SpectrumIdentificationResult createSpectrumIdentificationResult() {
        return new SpectrumIdentificationResult();
    }

    /**
     * Create an instance of {@link SpectrumIdentificationItem }
     * 
     */
    public SpectrumIdentificationItem createSpectrumIdentificationItem() {
        return new SpectrumIdentificationItem();
    }

    /**
     * Create an instance of {@link ProteinDetectionHypothesis }
     * 
     */
    public ProteinDetectionHypothesis createProteinDetectionHypothesis() {
        return new ProteinDetectionHypothesis();
    }

    /**
     * Create an instance of {@link Inputs }
     * 
     */
    public Inputs createInputs() {
        return new Inputs();
    }

    /**
     * Create an instance of {@link PeptideEvidence }
     * 
     */
    public PeptideEvidence createPeptideEvidence() {
        return new PeptideEvidence();
    }

    /**
     * Create an instance of {@link UserParam }
     * 
     */
    public UserParam createUserParam() {
        return new UserParam();
    }

    /**
     * Create an instance of {@link ExternalData }
     * 
     */
    public ExternalData createExternalData() {
        return new ExternalData();
    }

    /**
     * Create an instance of {@link AnalysisSoftware }
     * 
     */
    public AnalysisSoftware createAnalysisSoftware() {
        return new AnalysisSoftware();
    }

    /**
     * Create an instance of {@link AnalysisSearchDatabase }
     * 
     */
    public AnalysisSearchDatabase createAnalysisSearchDatabase() {
        return new AnalysisSearchDatabase();
    }

    /**
     * Create an instance of {@link SpectrumIdentificationProtocol }
     * 
     */
    public SpectrumIdentificationProtocol createSpectrumIdentificationProtocol() {
        return new SpectrumIdentificationProtocol();
    }

    /**
     * Create an instance of {@link InputSpectrumIdentifications }
     * 
     */
    public InputSpectrumIdentifications createInputSpectrumIdentifications() {
        return new InputSpectrumIdentifications();
    }

    /**
     * Create an instance of {@link CvParam }
     * 
     */
    public CvParam createCvParam() {
        return new CvParam();
    }

    /**
     * Create an instance of {@link Sample }
     * 
     */
    public Sample createSample() {
        return new Sample();
    }

    /**
     * Create an instance of {@link ModParam }
     * 
     */
    public ModParam createModParam() {
        return new ModParam();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createContactRoleRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link SpectrumIdentification }
     * 
     */
    public SpectrumIdentification createSpectrumIdentification() {
        return new SpectrumIdentification();
    }

    /**
     * Create an instance of {@link ModificationParams }
     * 
     */
    public ModificationParams createModificationParams() {
        return new ModificationParams();
    }

    /**
     * Create an instance of {@link ProteinDetection }
     * 
     */
    public ProteinDetection createProteinDetection() {
        return new ProteinDetection();
    }

    /**
     * Create an instance of {@link FragmentArray }
     * 
     */
    public FragmentArray createFragmentArray() {
        return new FragmentArray();
    }

    /**
     * Create an instance of {@link Peptide }
     * 
     */
    public Peptide createPeptide() {
        return new Peptide();
    }

    /**
     * Create an instance of {@link PropertyValue }
     * 
     */
    public PropertyValue createPropertyValue() {
        return new PropertyValue();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link PeptideHypothesis }
     * 
     */
    public PeptideHypothesis createPeptideHypothesis() {
        return new PeptideHypothesis();
    }

    /**
     * Create an instance of {@link IonType }
     * 
     */
    public IonType createIonType() {
        return new IonType();
    }

    /**
     * Create an instance of {@link SearchModification }
     * 
     */
    public SearchModification createSearchModification() {
        return new SearchModification();
    }

    /**
     * Create an instance of {@link SubSample }
     * 
     */
    public SubSample createSubSample() {
        return new SubSample();
    }

    /**
     * Create an instance of {@link Enzyme }
     * 
     */
    public Enzyme createEnzyme() {
        return new Enzyme();
    }

    /**
     * Create an instance of {@link ParamAlternativeList }
     * 
     */
    public ParamAlternativeList createParamAlternativeList() {
        return new ParamAlternativeList();
    }

    /**
     * Create an instance of {@link Residue }
     * 
     */
    public Residue createResidue() {
        return new Residue();
    }

    /**
     * Create an instance of {@link ProteinDetectionProtocol }
     * 
     */
    public ProteinDetectionProtocol createProteinDetectionProtocol() {
        return new ProteinDetectionProtocol();
    }

    /**
     * Create an instance of {@link AnalysisCollection }
     * 
     */
    public AnalysisCollection createAnalysisCollection() {
        return new AnalysisCollection();
    }

    /**
     * Create an instance of {@link AnalysisSoftwareList }
     * 
     */
    public AnalysisSoftwareList createAnalysisSoftwareList() {
        return new AnalysisSoftwareList();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "userParam")
    public JAXBElement<UserParam> createUserParam(UserParam value) {
        return new JAXBElement<UserParam>(_UserParam_QNAME, UserParam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "AuditCollection")
    public JAXBElement<AuditCollection> createAuditCollection(AuditCollection value) {
        return new JAXBElement<AuditCollection>(_AuditCollection_QNAME, AuditCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "PropertyValue")
    public JAXBElement<PropertyValue> createPropertyValue(PropertyValue value) {
        return new JAXBElement<PropertyValue>(_PropertyValue_QNAME, PropertyValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "Organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BibliographicReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "BibliographicReference")
    public JAXBElement<BibliographicReference> createBibliographicReference(BibliographicReference value) {
        return new JAXBElement<BibliographicReference>(_BibliographicReference_QNAME, BibliographicReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "cv")
    public JAXBElement<Cv> createCv(Cv value) {
        return new JAXBElement<Cv>(_Cv_QNAME, Cv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CvParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "cvParam")
    public JAXBElement<CvParam> createCvParam(CvParam value) {
        return new JAXBElement<CvParam>(_CvParam_QNAME, CvParam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Provider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "Provider")
    public JAXBElement<Provider> createProvider(Provider value) {
        return new JAXBElement<Provider>(_Provider_QNAME, Provider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "ContactRole")
    public JAXBElement<ContactRole> createContactRole(ContactRole value) {
        return new JAXBElement<ContactRole>(_ContactRole_QNAME, ContactRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MzIdentML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "mzIdentML")
    public JAXBElement<MzIdentML> createMzIdentML(MzIdentML value) {
        return new JAXBElement<MzIdentML>(_MzIdentML_QNAME, MzIdentML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://psidev.info/psi/pi/mzIdentML/1.0", name = "ExternalData")
    public JAXBElement<ExternalData> createExternalData(ExternalData value) {
        return new JAXBElement<ExternalData>(_ExternalData_QNAME, ExternalData.class, null, value);
    }

}
