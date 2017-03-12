package by.epam.recording.factory;

import by.epam.recording.entity.Recording;
import by.epam.recording.exception.RecordingException;

import java.util.Map;

/**
 * Created by Acer on 01.03.2017.
 */
public abstract class RecordingFactory<T extends Recording> {


    public abstract T createInstance(Map<String, String> recordingMap)
            throws RecordingException;
}
