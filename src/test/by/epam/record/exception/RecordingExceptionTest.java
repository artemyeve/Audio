package test.by.epam.record.exception;

import by.epam.recording.exception.RecordingException;
import by.epam.recording.factory.AnalogRecordingFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Acer on 06.03.2017.
 */
public class RecordingExceptionTest {
    private static AnalogRecordingFactory factory;
    private static Map<String, String> recInfo;

    @BeforeClass
    public static void initData() {

        factory = new AnalogRecordingFactory();
        recInfo = new HashMap<>();
        recInfo.put("name", "Story of my life");
        recInfo.put("author", "Stan Gray");
        recInfo.put("style", "jaz");
        recInfo.put("id", "2345");
        recInfo.put("duration", "250");
        recInfo.put("number", "1");
        recInfo.put("medium", "tape");
    }

    @AfterClass
    public static void clearData() {

        factory = null;
        recInfo = null;
    }

    @Test(expected = RecordingException.class)
    public void createInstanceTestException() throws RecordingException {

        factory.createInstance(recInfo);

    }
}
