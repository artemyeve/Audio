package by.epam.recording.entity;

import java.util.Collections;
import java.util.SortedSet;

/**
 * Created by Acer on 01.03.2017.
 */
public class Album<T extends Recording> {

    private SortedSet<T> recordings;

    public void setRecordings(SortedSet<T> recordings) {
        this.recordings = recordings;
    }

    public SortedSet<T> getRecordings() {
        return Collections.unmodifiableSortedSet(recordings);
    }
}
