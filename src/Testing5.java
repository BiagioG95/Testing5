/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia
Crea dei test per questo esercizio
 */

import java.time.OffsetDateTime;

public class Testing5 {
    public static void main(String[] args) {
        //Creazione oggetto tramite la stringa richiesta
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //stampo la data originale
        System.out.println("La data completa è " + data);

        //utilizzo plusYears per aggiungere anni
        OffsetDateTime aggiuntoAnno = data.plusYears(1);
        System.out.println("Aggiunta di un anno: " + aggiuntoAnno);

        //utilizzo minusMonths per sottrarre il mese
        OffsetDateTime sottraiMese = data.minusMonths(1);
        System.out.println("Sottratto un mese: " + sottraiMese);

        //utilizzo plusDays per aggiungere giorni
        OffsetDateTime aggiunti7giorni = data.plusDays(7);
        System.out.println("Aggiunti 7 giorni: " + aggiunti7giorni);





    }
}