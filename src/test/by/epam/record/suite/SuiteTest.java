package test.by.epam.record.suite;

/**
 * Created by Acer on 28.02.2017.
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.by.epam.record.action.RecordingActionTest;
import test.by.epam.record.comparator.RecordingDurationComparatorTest;
import test.by.epam.record.comparator.RecordingNumberComparatorTest;
import test.by.epam.record.comparator.RecordingStyleComparatorTest;
import test.by.epam.record.creator.AlbumCreatorTest;
import test.by.epam.record.exception.RecordingExceptionTest;
import test.by.epam.record.reader.DataReaderTest;

@Suite.SuiteClasses({
        RecordingActionTest.class,
        RecordingDurationComparatorTest.class,
        RecordingNumberComparatorTest.class,
        RecordingStyleComparatorTest.class,
        AlbumCreatorTest.class,
        RecordingExceptionTest.class,
        DataReaderTest.class


})
@RunWith(Suite.class)
public class SuiteTest {

}
