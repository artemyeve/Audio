package by.epam.recording.creator;

import by.epam.recording.entity.AnalogRecording;
import by.epam.recording.factory.AnalogRecordingFactory;

/**
 * Created by Acer on 06.03.2017.
 */
public class AnalogAlbumCreator extends  AlbumCreator<AnalogRecording> {

    public AnalogAlbumCreator(){

        super(new AnalogRecordingFactory());
    }
}
