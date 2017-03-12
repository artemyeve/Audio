package test.by.epam.record.comparator;

import by.epam.recording.comparator.RecordingDurationComparator;
import by.epam.recording.entity.Recording;
import by.epam.recording.entity.Style;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Acer on 06.03.2017.
 */
public class RecordingDurationComparatorTest {
    private static Recording rec1;
    private static Recording rec2;
    private static RecordingDurationComparator comp;
    @BeforeClass
    public static void initRecording() {

        rec1 = new Recording("Hey", "St. Patrick", Style.ROCK, 2345324, 310, 1);
        rec2 = new Recording("Lively shadows", "Gretta German", Style.JAZZ, 2345, 120, 2);
        comp = new RecordingDurationComparator();
    }

    @AfterClass
    public static void clearRecording() {

        rec1 = null;
        rec2 = null;
        comp = null;
    }

    @Test
    public void compareTest() {


        assertTrue("must be positive", comp.compare(rec1, rec2) > 0);

    }

    @Test
    public void compareTestEquals() {

        assertEquals("must be zero", 0, comp.compare(rec1, rec2));

    }

}
