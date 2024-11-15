import java.time.*;

public record Commitment(String commitmentName, LocalDateTime commitmentDateTime, ZoneId commitmentTimeZone) {
    public Period remainingTime() {
        return Period.between(LocalDate.now(), this.commitmentDateTime.toLocalDate());
    }

    public Commitment addHours(int hours) {
         return new Commitment(this.commitmentName, this.commitmentDateTime.plusHours(hours), this.commitmentTimeZone);
    }

    public void showCommitment() {
        System.out.println("Name: " + this.commitmentName);
        System.out.println("Date and Time: " + this.commitmentDateTime);
        System.out.println("Time Zone: " + ZonedDateTime.of(this.commitmentDateTime, this.commitmentTimeZone));
    }
}
