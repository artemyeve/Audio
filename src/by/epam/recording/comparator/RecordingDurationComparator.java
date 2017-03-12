package by.epam.recording.comparator;

import by.epam.recording.entity.Recording;

import java.util.Comparator;

/**
 * Created by Acer on 01.03.2017.
 */
public class RecordingDurationComparator implements Comparator<Recording> {

    @Override
    public int compare(Recording r1, Recording r2) {

        return Integer.compare(r1.getDuration(), r2.getDuration());
    }

}
