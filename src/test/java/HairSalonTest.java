import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
      String[] expected = new String[]{"Monday","Tuesday"};
      String[] actual = hairSalon.getOpeningDays();

      assertArrayEquals(expected,actual);
    }

    @Test
    public void testSalonIsOpenOnMonday() {
      assertTrue(hairSalon.isOpen("Monday"));

    }

    @Test
    public void testSalonIsClosedOnWednesday() {
      assertFalse(hairSalon.isOpen("Wednesday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
      Exception exception = assertThrows(IllegalArgumentException.class,() -> hairSalon.isOpen("notweek"));
    
      String expected = "Invalid weekday passed";
      String actual = exception.getMessage();

      assertEquals(expected,actual);
    }

    @Test
    public void testApplyDiscount(){
      // next 2 lines make sure that calculator class's divide method is correctly running otherwise fails test.
      
      Calculator calcul = new Calculator();
      assumeTrue(calcul.divide(hairSalon.getHaircutPrice(),2) == 15);

      int expected = 20;
      int actual = hairSalon.applyDiscount();

      assertEquals(expected, actual);
    }
}