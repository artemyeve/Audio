package by.epam.recording.factory;

import by.epam.recording.entity.Compression;
import by.epam.recording.entity.DigitalRecording;
import by.epam.recording.entity.Style;
import by.epam.recording.exception.RecordingException;


import java.util.Map;

/**
 * Created by Acer on 05.03.2017.
 */
public class DigitalRecordingFactory extends RecordingFactory<DigitalRecording> {

    @Override
    public DigitalRecording createInstance(Map<String, String> recordingInfo)
            throws RecordingException {
        DigitalRecording recording = null;
        try {

            String recordingName = recordingInfo.get("name");
            String recordingAuthor = recordingInfo.get("author");
            Style style = Style.valueOf(recordingInfo.get("style").toUpperCase());
            Long id = Long.parseLong(recordingInfo.get("id"));
            int duration = Integer.parseInt(recordingInfo.get("duration"));
            int number = Integer.parseInt(recordingInfo.get("number"));
            Compression compression = Compression.valueOf(recordingInfo.get("compression").toUpperCase());
            if (recordingName != null && recordingAuthor != null && style != null && compression != null) {
                recording = new DigitalRecording(recordingName, recordingAuthor, style, id, duration, number, compression);
            } else {
                throw new RecordingException("Invalid parameters for creating recording");
            }
        } catch (IllegalArgumentException e) {
            throw new RecordingException("Invalid parameters for creating recording",e);
        }
        return recording;
    }

}
