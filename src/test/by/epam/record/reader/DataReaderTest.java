package test.by.epam.record.reader;

import by.epam.recording.reader.DataReader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Acer on 06.03.2017.
 */
public class DataReaderTest {
    private File testFile;
    private FileWriter fw;
    private String original;

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Before
    public void createFile() {
        original = "{name:Made my day,author:Jill Sorry,style:BLUES,id:112340,duration:155,number:1,compression:aac}";
        try {
            tempFolder.create();
            testFile = tempFolder.newFile("test.txt");
            fw = new FileWriter(testFile);
            fw.write(original);
            fw.flush();
        } catch (IOException e) {
            Assert.fail();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                Assert.fail();
            }
        }

    }
    @After
    public void clearData(){
        tempFolder.delete();
        fw = null;
        testFile = null;
        original = null;
    }

    @Test
    public void readFileTest() throws IOException {
        List<String> list = DataReader.readFile(testFile.getPath());
        String actual = list.get(0);
        Assert.assertEquals(original, actual);
    }
}
