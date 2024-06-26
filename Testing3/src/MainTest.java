import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testData(){

        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formattedData = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String expectedFormattedData = "1 marzo 2023";

       assertEquals(expectedFormattedData, formattedData);

    }

}