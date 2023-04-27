import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class MyFirstTest {

//      Write test before creating method
//      define as a test using annotation
        @Test
        public void testAddition() {
            int input1 = 6;
            int input2 = 8;
            int expectedResult = 14;
//                       Value v    &&   v Method Call
            assertEquals(expectedResult, Calculator.add(input1, input2));
        }

        @Test
        public void testTipCalculator() {
            double bill = 22.56;
            double tipPercentage = 15;
            double tip = 3.38;

//          assertEquals(tip, Calculator.tip(bill, tip));
//          java.lang.AssertionError: Use assertEquals(expected, actual, delta) to compare floating-point numbers
//        DELTA: Margin of error built in
            assertEquals(tip, Calculator.tip(bill, tipPercentage), 0.01);
        }

        Bird bird1 = new Bird("cardinal");
        Bird bird2 = new Bird("finch");
        Bird bird3 = new Bird ("finch");

        @Test
    public void testObjectsSameness() {
            assertNotSame(bird2, bird3);
        }

}
