import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testGetYear() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z", DateTimeFormatter.ISO_DATE_TIME);
        assertEquals(2023, dateTime.getYear());
    }

    @Test
    public void testGetMonth() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z", DateTimeFormatter.ISO_DATE_TIME);
        assertEquals(3, dateTime.getMonthValue());
    }

    @Test
    public void testGetDay() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z", DateTimeFormatter.ISO_DATE_TIME);
        assertEquals(1, dateTime.getDayOfMonth());
    }

    @Test
    public void testGetDayOfTheWeek() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z", DateTimeFormatter.ISO_DATE_TIME);
        assertEquals(DayOfWeek.WEDNESDAY, dateTime.getDayOfWeek());
    }
}


