package edu.bsu.cs.view;

import edu.bsu.cs.model.NewRevisionFormatterInterface;
import edu.bsu.cs.model.Revision;
import java.time.format.DateTimeFormatter;


public class NewRevisionFormatter implements NewRevisionFormatterInterface {
    public String format(Revision revision) {
        return String.format("Time of Change: %s, Author: %s",
                DateTimeFormatter.ISO_INSTANT.format(revision.timestamp).replace("Z","").replace("T", ""),
                revision.name);
    }
}
