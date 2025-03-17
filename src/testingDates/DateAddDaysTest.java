package testingDates;


import org.junit.Test;
import static org.junit.Assert.*;

public class DateAddDaysTest {

	    @Test
	    public void testSameMonth() {
	        //adding one day within the same month
	        Date d1 = new Date("March", 14, 2024);
	        d1.addOneDay();
	        assertEquals("March 15, 2024", d1.toString());
	        
	        Date d2 = new Date("June", 29, 2023);
	        d2.addOneDay();
	        assertEquals("June 30, 2023", d2.toString());
	        
	        Date d3 = new Date("October", 5, 2025);
	        d3.addOneDay();
	        assertEquals("October 6, 2025", d3.toString());
	    }

	    @Test
	    public void testCrossMonth() {
	        //crossing into the next month
	        Date d1 = new Date("April", 30, 2024);
	        d1.addOneDay();
	        assertEquals("May 1, 2024", d1.toString());
	        
	        Date d2 = new Date("February", 28, 2023);
	        d2.addOneDay();
	        assertEquals("March 1, 2023", d2.toString());
	        
	        Date d4 = new Date("November", 30, 2026);
	        d4.addOneDay();
	        assertEquals("December 1, 2026", d4.toString());
	    }

	    @Test
	    public void testCrossYear() {
	        //crossing into a new year
	        Date d1 = new Date("December", 31, 2023);
	        d1.addOneDay();
	        assertEquals("January 1, 2024", d1.toString());
	        
	        Date d2 = new Date("December", 31, 1999);
	        d2.addOneDay();
	        assertEquals("January 1, 2000", d2.toString());
	    }
	}

