import org.testng.annotations.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class Testing5Test {

    @Test
    public void main() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime nuovaData = data.plusYears(1) // Aggiungi un anno
                .minusMonths(1) // Sottrai un mese
                .plusDays(7); // Aggiungi 7 giorni




        // Verifica che la data risultante sia corretta
        OffsetDateTime expected = OffsetDateTime.parse("2024-02-08T13:00:00Z");
        assertEquals(expected, nuovaData);
    }
}