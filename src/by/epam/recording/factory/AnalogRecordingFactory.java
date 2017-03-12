package by.epam.recording.factory;

import by.epam.recording.entity.AnalogMedium;
import by.epam.recording.entity.AnalogRecording;
import by.epam.recording.entity.Style;
import by.epam.recording.exception.RecordingException;

import java.util.Map;

/**
 * Created by Acer on 05.03.2017.
 */
public class AnalogRecordingFactory extends RecordingFactory<AnalogRecording> {


    @Override
    public AnalogRecording createInstance(Map<String, String> recordingInfo)
            throws RecordingException {
        AnalogRecording recording = null;
        try {
            String recordingName = recordingInfo.get("name");
            String recordingAuthor = recordingInfo.get("author");
            Style style = Style.valueOf(recordingInfo.get("style").toUpperCase());
            Long id = Long.parseLong(recordingInfo.get("id"));
            int duration = Integer.parseInt(recordingInfo.get("duration"));
            int number = Integer.parseInt(recordingInfo.get("number"));
            AnalogMedium analogMedium = AnalogMedium.valueOf(recordingInfo.get("medium").toUpperCase());
            if (recordingName != null && recordingAuthor != null && style != null && analogMedium != null) {
                recording = new AnalogRecording(recordingName, recordingAuthor, style, id, duration, number, analogMedium);
            } else {
                throw new RecordingException("Invalid parameters for creating recording");
            }
        } catch (IllegalArgumentException e) {
            throw new RecordingException("Invalid parameters for creating recording",e);
        }
        return recording;
    }

}

