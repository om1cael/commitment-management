import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        Commitment commitment = new Commitment("Football", LocalDateTime.of(2024, 11, 16, 0, 0), ZoneId.of("America/Sao_Paulo"));
        Commitment commitment2 = new Commitment("Soccer", LocalDateTime.of(2025, 11, 16, 0, 0), ZoneId.of("Europe/London"));

        System.out.println(commitment.remainingTime());
        System.out.println(commitment2.remainingTime());

        commitment.addHours(5);
        commitment2.addHours(10);

        commitment.showCommitment();
        System.out.println();
        commitment2.showCommitment();
    }
}