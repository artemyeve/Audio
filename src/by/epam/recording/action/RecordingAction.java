package by.epam.recording.action;

import by.epam.recording.comparator.RecordingStyleComparator;
import by.epam.recording.comparator.RecordingDurationComparator;
import by.epam.recording.entity.Album;
import by.epam.recording.entity.Recording;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Acer on 01.03.2017.
 */
public class RecordingAction {

    public void reshuffleByStyle(Album<Recording> album) {
        SortedSet<Recording> recordings = new TreeSet<>(new RecordingStyleComparator());
        recordings.addAll(album.getRecordings());
        album.setRecordings(recordings);
    }

    public Set<Recording> searchByDuration(Album<Recording> album, int start, int end) {

        Set<Recording> result = new TreeSet<>(new RecordingDurationComparator());
        for (Recording rec : album.getRecordings()) {
            if (start <= rec.getDuration() && rec.getDuration() <= end) {
                result.add(rec);
            }
        }
        return result;
    }
}
