package duke.task;

/**
 * This class creates an event with a from and to date.
 */
public class Event extends Task {

    protected String from;
    protected String to;

    /**
     * @param description
     * @param from
     * @param to
     */
    public Event(String description, String from, String to) {
        super(description);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(from: " + from + "to:" + to + ")";
    }

}
