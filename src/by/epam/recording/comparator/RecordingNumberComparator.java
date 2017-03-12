package by.epam.recording.comparator;

import by.epam.recording.entity.Recording;

import java.util.Comparator;

/**
 * Created by Acer on 01.03.2017.
 */
public class RecordingNumberComparator implements Comparator<Recording> {

    @Override
    public int compare(Recording r1, Recording r2) {

        return Long.compare(r1.getNumber(), r2.getNumber());
    }

}
