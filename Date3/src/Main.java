import java.time.DayOfWeek;
import java.time.OffsetDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);


    }
}