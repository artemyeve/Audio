package by.epam.recording.creator;

import by.epam.recording.comparator.RecordingNumberComparator;
import by.epam.recording.entity.Album;
import by.epam.recording.entity.Recording;
import by.epam.recording.exception.RecordingException;
import by.epam.recording.factory.AnalogRecordingFactory;
import by.epam.recording.factory.DigitalRecordingFactory;
import by.epam.recording.factory.RecordingFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

/**
 * Created by Acer on 01.03.2017.
 */
public class AlbumCreator<T extends Recording> {

    private static Logger logger = LogManager.getLogger(AlbumCreator.class);

    public AlbumCreator(DigitalRecordingFactory digitalRecordingFactory) {
    }

    public AlbumCreator(AnalogRecordingFactory analogRecordingFactory) {

    }

    public Album<T> writeAlbum(List<Map<String, String>> data,RecordingFactory<T> factory) {
        Album<T> album = new Album<>();
        album.setRecordings(createRecordings(data,factory));
        return album;
    }

    public SortedSet<T> createRecordings(List<Map<String, String>> data,RecordingFactory<T> factory) {

        SortedSet<T> recordings = new TreeSet<>(new RecordingNumberComparator());

        for (Map<String, String> recordingInfo : data) {
            try {
                recordings.add(factory.createInstance(recordingInfo));
            } catch (RecordingException e) {
                logger.log(Level.ERROR,"Could not create recording. Skipping to the next one");
            }
        }
        return recordings;
    }
}
