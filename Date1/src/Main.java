import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String fullFormat = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String mediumFormat = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String shortFormat = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println("fullFormat = " + fullFormat);
        System.out.println("mediumFormat = " + mediumFormat);
        System.out.println("shortFormat = " + shortFormat);
    }
}