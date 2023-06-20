
public class StringCalculatorTest {
	@Test
    public void add() {
        calcString.add("25,1000");
        int finalVal = calcString;
        assertEquals(25, finalVal);
    }
	
	@Test
    public void add() {
        calcString.add("25,-20");
        int finalVal = calcString;
        assertEquals(25, finalVal);
    }
}
