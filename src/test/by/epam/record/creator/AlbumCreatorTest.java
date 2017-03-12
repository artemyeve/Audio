package test.by.epam.record.creator;


import by.epam.recording.creator.DigitalAlbumCreator;
import by.epam.recording.entity.Album;
import by.epam.recording.entity.Compression;
import by.epam.recording.entity.DigitalRecording;
import by.epam.recording.entity.Style;
import by.epam.recording.factory.DigitalRecordingFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Created by Acer on 06.03.2017.
 */
public class AlbumCreatorTest {
    private static DigitalRecording recording;
    private static DigitalRecordingFactory factory;
    private static Map<String, String> recInfo;
    private static DigitalAlbumCreator creator;
    @BeforeClass
    public static void initData() {
        recording = new DigitalRecording("Story of my life", "Stan Gray", Style.JAZZ, 235,
                250, 1, Compression.AAC);
        factory = new DigitalRecordingFactory();
        recInfo = new HashMap<>();
        recInfo.put("name", "Story of my life");
        recInfo.put("author", "Stan Gray");
        recInfo.put("style", "jazz");
        recInfo.put("id", "235");
        recInfo.put("duration", "250");
        recInfo.put("number", "1");
        recInfo.put("compression", "AAC");
        creator = new DigitalAlbumCreator();
    }

    @AfterClass
    public static void clearData() {
        recording = null;
        factory = null;
        recInfo = null;
    }

    @Test
    public void createAlbumFromDataTest() {

        Album<DigitalRecording> album = creator.writeAlbum(Arrays.asList(recInfo), factory);

        assertTrue("must contain recording", album.getRecordings().contains(recording));

    }


}
