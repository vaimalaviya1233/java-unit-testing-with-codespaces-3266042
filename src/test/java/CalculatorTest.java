import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
  Calculator calc = new Calculator();

  @Test
  public void testsum() {
    int expected = 3;
    int actual = calc.sum(1, 2);

    assertEquals(expected, actual);
  }

  @Test
  public void testsubtract() {
    int expected = -1;
    int actual = calc.subtract(1, 2);

    assertEquals(expected, actual);
  }

  @Test
  public void testmultiply() {
    int expected = 12;
    int actual = calc.multiply(2, 6);

    assertEquals(expected, actual);
  }
  
  @Test
  public void testdivide() {
    int expected = 3;
    int actual = calc.divide(6, 2);

    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {200000, 2, -2, -100000})
  public void testIsEven(int number){
    boolean actual = calc.isEven(number);

    assertTrue(actual);
  }

  @Test
  public void testIsOdd(){
    boolean actual = calc.isEven(1);
    assertFalse(actual);
  }

  @Test
  public void testIncrementArray(){
    int[] expected = new int[]{2,3,4};
    int[] actual = calc.incrementArray(new int[]{1,2,3});

    assertArrayEquals(expected,actual);
  }

  @Test
  public void testDivideByZero(){
    Exception exception = assertThrows(IllegalArgumentException.class,() -> calc.divide(1, 0));
    
    String expected = "Ints cannot be divided by zero";
    String actual = exception.getMessage();

    assertEquals(expected,actual);

  }
}
