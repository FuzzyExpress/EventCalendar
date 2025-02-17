import java.time.LocalDateTime;

public class Deadline extends Event implements Completable
{
    /**
     * Tracks whether the task associated with this deadline is complete
     */
    private boolean complete;

    /**
     * Creates a new Deadline event
     * @param name the name of the deadline task
     * @param deadline the date and time when this deadline is due
     */
    public Deadline(String name, LocalDateTime deadline) {
        super(name, deadline);
        this.complete = false;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Marks this deadline task as complete
     */
    public void complete() {
        this.complete = true;
    }

    @Override
    public boolean isCompleted() {
        return this.complete;
    }

    /**
     * Checks if this deadline task is complete
     * @return true if the task is complete, false otherwise
     */
    public boolean isComplete() {
        return complete;
    }
}
