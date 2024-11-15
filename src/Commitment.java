import java.time.*;

public class Commitment {
    String commitmentName;
    LocalDateTime commitmentDateTime;
    ZoneId commitmentTimeZone;

    public Commitment(String name, LocalDateTime dateTime, ZoneId timeZone) {
        this.commitmentName = name;
        this.commitmentDateTime = dateTime;
        this.commitmentTimeZone = timeZone;
    }

    public Period remainingTime() {
        return Period.between(this.commitmentDateTime.toLocalDate(), LocalDate.now());
    }

    public LocalDateTime addHours(int hours) {
        return this.commitmentDateTime.plusHours(hours);
    }

    public void showCommitment() {
        System.out.println("Name: " + this.commitmentName);
        System.out.println("Date and Time: " + this.commitmentDateTime);
        System.out.println("Time Zone: " + ZonedDateTime.of(this.commitmentDateTime, this.commitmentTimeZone));
    }
}
