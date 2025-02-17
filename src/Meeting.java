import java.time.Duration;
import java.time.LocalDateTime;

public class Meeting extends Event implements Completable {

    /**
     * The end time of the meeting
     */
    private LocalDateTime endDateTime;

    /**
     * The location where the meeting takes place
     */
    private String location;

    /**
     * Tracks whether the meeting is complete
     */
    private boolean complete;

    /**
     * Creates a new Meeting event
     * @param name the name of the meeting
     * @param start the start date and time of the meeting
     * @param end the end date and time of the meeting
     * @param location the location where the meeting takes place
     */
    public Meeting(String name, LocalDateTime start, LocalDateTime end, String location) {
        super(name, start);
        this.endDateTime = end;
        this.location = location;
        this.complete = false;
    }

    /**
     * Gets the end time of the meeting
     * @return the end date and time
     */
    public LocalDateTime getEndTime() {
        return endDateTime;
    }

    /**
     * Gets the duration of the meeting
     * @return the duration between start and end time
     */
    public Duration getDuration() {
        return Duration.between(getDateTime(), this.endDateTime);
    }

    /**
     * Gets the location of the meeting
     * @return the meeting location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the end time of the meeting
     * @param end the new end date and time
     */
    public void setEndDateTime(LocalDateTime end) {
        this.endDateTime = end;
    }

    /**
     * Sets the location of the meeting
     * @param location the new meeting location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Marks this meeting as complete
     */
    public void complete() {
        this.complete = true;
    }

    @Override
    public boolean isCompleted() {
        return this.complete;
    }

    /**
     * Checks if this meeting is complete
     * @return true if the meeting is complete, false otherwise
     */
    public boolean isComplete() {
        return complete;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
