package uk.ac.ebi.jmzidml.test.xml;

import junit.framework.TestCase;
import org.apache.log4j.Logger;
import uk.ac.ebi.jmzidml.model.mzidml.*;
import uk.ac.ebi.jmzidml.xml.io.MzIdentMLUnmarshaller;

import java.net.URL;
import java.util.List;

/**
 * Package  : uk.ac.ebi.jmzidml.test.xml
 * Author   : riteshk
 * Date     : Sep 18, 2010
 */
public class SequenceCollectionTest extends TestCase {

    Logger log = Logger.getLogger(SequenceCollectionTest.class);

    public void testSequenceCollectionInformation() throws Exception {
        log.info("testing <SequenceCollection> content.");

        URL xmlFileURL = SequenceCollectionTest.class.getClassLoader().getResource("Mascot_MSMS_example.mzid");
        assertNotNull(xmlFileURL);

        boolean aUseSpectrumCache = true;
        MzIdentMLUnmarshaller unmarshaller = new MzIdentMLUnmarshaller(xmlFileURL, aUseSpectrumCache);
        assertNotNull(unmarshaller);

        // Number of Sequence collection
        int totalSequenceCollection = unmarshaller.getObjectCountForXpath("/mzIdentML/SequenceCollection");
        assertEquals(1, totalSequenceCollection);

        SequenceCollection sc = unmarshaller.unmarshalFromXpath("/mzIdentML/SequenceCollection", SequenceCollection.class);
        assertNotNull(sc);


        List<DBSequence> dbsequence  = sc.getDBSequence();
        assertEquals(46, dbsequence.size());

        // check one DBSequence
        DBSequence dbseq = dbsequence.get(0);
        assertNotNull(dbseq.getAccession());
        assertEquals("SwissProt", dbseq.getAnalysisSearchDatabase().getName());
        log.debug("DBSequence Acc:" + dbseq.getAccession()
                + "Id:" + dbseq.getId()
                + "Name:" + dbseq.getName()
                + "Database name:" + dbseq.getAnalysisSearchDatabase().getName()
                + "length:" + dbseq.getLength());
        assertEquals(dbseq.getLength().intValue(), dbseq.getSeq().length());

        assertEquals(3, dbseq.getParamGroup().size());
        for (Param param : dbseq.getParamGroup()) {
            log.debug("Param:" + param.getName()
                    + " acc:" + param.getUnitAccession()
                    + " value:" + param.getValue()
                    + " unitCvRef:" + param.getUnitCvRef());
        }



        List<Peptide> peptides       = sc.getPeptide();
        assertEquals(40, peptides.size());
        for (Peptide pep : peptides) {
            assertTrue(pep.getId().startsWith("peptide_"));
        }

        // check modifications of first peptide
        List<Modification> mods = peptides.get(0).getModification();
        assertEquals(1, mods.size());
        Modification mod = mods.get(0);
        assertTrue(mod.getMonoisotopicMassDelta() > 1);
        assertEquals(1, mod.getParamGroup().size());
        assertTrue(mod.getParamGroup().get(0) instanceof CvParam);
        CvParam cvparam = (CvParam) mod.getParamGroup().get(0);
        assertTrue(cvparam.getAccession().startsWith("UNIMOD:"));
    }
}
