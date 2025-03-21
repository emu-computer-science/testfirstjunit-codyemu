package testingDates;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateSetDateTest {

    @Test
    public void testSetDateLegalValues() {
        Date bob = new Date(3, 15, 2024);
        
        bob.setDate(4, 10, 2024);
        assertEquals("April 10, 2024", bob.toString());
        
        bob.setDate(2, 28, 2023);
        assertEquals("February 28, 2023", bob.toString());
    }

    @Test
    public void testSetDateIllegalValues() {
        Date bob = new Date(5, 10, 2024);
        
        //invalid day
        bob.setDate("February", 30, 2024);
        assertEquals("May 10, 2024", bob.toString());
        //invalid day
        bob.setDate("May", 32, 2023);
        assertEquals("May 10, 2024", bob.toString());
        //invalid month
        bob.setDate("InvalidMonth", 10, 2023);
        assertEquals("May 10, 2024", bob.toString());
        //invalid year
        bob.setDate("March", 15, 999);
        assertEquals("May 10, 2024", bob.toString());
    }

}
