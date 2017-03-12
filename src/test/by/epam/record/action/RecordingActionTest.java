package test.by.epam.record.action;

import by.epam.recording.action.RecordingAction;
import by.epam.recording.comparator.RecordingNumberComparator;
import by.epam.recording.entity.Album;
import by.epam.recording.entity.Recording;
import by.epam.recording.entity.Style;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Acer on 05.03.2017.
 */
public class RecordingActionTest {
    private static Album<Recording> album;
    private static SortedSet<Recording> recordings;
    private static Recording rec1;
    private static Recording rec2;
    private static Recording rec3;
    private static Recording rec4;
    private static Recording rec5;
    private static Recording rec6;
    private static Recording rec7;
    @BeforeClass
    public static void initData() {
        album = new Album<>();
        recordings = new TreeSet<>(new RecordingNumberComparator());
        rec1 = new Recording("Made my day", "Jill Sorry", Style.BLUES, 1345324, 155, 1);
        rec2 = new Recording("Something new", "Billy Storm", Style.ROCK, 234523, 210, 2);
        rec3 = new Recording("Die darling", "Jim Scarecrow", Style.METAL, 34353, 205, 3);
        rec4 = new Recording("To see the world", "Man Drown", Style.JAZZ, 45435346, 421, 4);
        rec5 = new Recording("Love me twice", "Sa-Sha", Style.POP, 523453245, 329, 5);
        rec6 = new Recording("Procrustes' bed", "Z-us", Style.ELECTRONIC, 62345234, 312, 6);
        rec7 = new Recording("Autumn Elegy", "Serge Simon", Style.CLASSICAL, 72345345, 164, 7);

        recordings.addAll(Arrays.asList(rec1, rec2, rec3, rec4, rec5, rec6, rec7));

        album.setRecordings(recordings);
    }

    @AfterClass
    public static void clearData() {
        album = null;
        recordings = null;
        rec1 = null;
        rec2 = null;
        rec3 = null;
        rec4 = null;
        rec5 = null;
        rec6 = null;
        rec7 = null;

    }
    @Test
    public void searchByDurationTest() {

        RecordingAction action = new RecordingAction();
        Set<Recording> foundRecs = action.searchByDuration(album,210,329);
        assertEquals("must be of size", 3, foundRecs.size());


    }
}
