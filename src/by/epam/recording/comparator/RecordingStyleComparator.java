package by.epam.recording.comparator;

import by.epam.recording.entity.Composition;
import by.epam.recording.entity.Recording;

import java.util.Comparator;

/**
 * Created by Acer on 01.03.2017.
 */
public class RecordingStyleComparator implements Comparator<Recording> {

    @Override
    public int compare(Recording r1, Recording r2) {

        return String.valueOf(r1.getStyle()).compareToIgnoreCase(String.valueOf(r2.getStyle()));
    }

}
