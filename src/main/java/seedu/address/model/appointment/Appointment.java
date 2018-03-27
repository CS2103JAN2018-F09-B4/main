package seedu.address.model.appointment;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

import seedu.address.model.association.ClientOwnPet;

/**
 * Represents an Appointment in the application.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Appointment {

    private final Date date;
    private final Time time;
    private final Duration duration;
    private final Description description;
    private ClientOwnPet clientOwnPet;

    /**
     * Every field must be present and not null.
     */
    public Appointment(Date date, Time time, Duration duration, Description description) {
        requireAllNonNull(date, time, duration, description);
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.description = description;
        this.clientOwnPet = null;

    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public Duration getDuration() {
        return duration;
    }

    public Description getDescription() {
        return description;
    }

    public ClientOwnPet getClientOwnPet() {
        return clientOwnPet;
    }

    public void setClientOwnPet(ClientOwnPet clientOwnPet) {
        this.clientOwnPet = clientOwnPet;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Appointment)) {
            return false;
        }

        Appointment otherAppointment = (Appointment) other;
        return otherAppointment.getDate().equals(this.getDate())
                && otherAppointment.getTime().equals(this.getTime())
                && otherAppointment.getDuration().equals(this.getDuration())
                && otherAppointment.getDescription().equals(this.getDescription());

    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(date, time, duration, description);

    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        builder.append(" Date: ")
                .append(getDate())
                .append(" Time: ")
                .append(getTime())
                .append(" Duration: ")
                .append(getDuration())
                .append(" Description: ")
                .append(getDescription());

        return builder.toString();
    }

}
