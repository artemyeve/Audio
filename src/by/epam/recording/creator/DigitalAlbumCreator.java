package by.epam.recording.creator;

import by.epam.recording.entity.DigitalRecording;
import by.epam.recording.factory.DigitalRecordingFactory;

/**
 * Created by Acer on 06.03.2017.
 */
public class DigitalAlbumCreator extends AlbumCreator<DigitalRecording> {

    public DigitalAlbumCreator() {

        super(new DigitalRecordingFactory());
    }
}
