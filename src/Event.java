import java.time.LocalDateTime;

/**
 * Abstract class representing an event with a name and date/time.
 */
abstract class Event implements Comparable<Event> {
    /**
     * The name of the event.
     */
    private String name;

    /**
     * The date and time when the event starts.
     */
    private LocalDateTime dateTime;

    /**
     * Constructs an Event with the specified name and date/time.
     *
     * @param name     the name of the event
     * @param dateTime the date and time when the event starts
     */
    public Event(String name, LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    /**
     * Returns the name of the event.
     *
     * @return the name of the event
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the date and time of the event.
     *
     * @return the date and time when the event starts
     */
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the date and time of the event.
     *
     * @param dateTime the new date and time for the event
     */
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Sets the name of the event.
     *
     * @param name the new name for the event
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Compares this event with another event based on their date/time.
     *
     * @param e the event to compare with
     * @return a positive integer if this event is later, 
     *         a negative integer if this event is earlier,
     *         or zero if the events have the same date/time
     */
    @Override
    public int compareTo(Event e) {
        return this.dateTime.compareTo(e.dateTime);
    }
}