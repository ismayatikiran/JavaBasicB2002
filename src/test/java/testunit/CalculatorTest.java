package testunit;

import org.testng.Assert;
import org.testng.annotations.Test;
import unittesting.Calculator;

public class CalculatorTest {
        @Test
        public void testAddMethod(){
            Calculator calculator = new Calculator();
            int actualResult = calculator.add(2, 2);
            System.out.println(actualResult);
            int expectedResult = 4;
            Assert.assertEquals(expectedResult, actualResult);
            System.out.println("exceptedResult is equal to actualResult thus method is working good");
        }
        @Test
        public void tesSubMethod(){
            Calculator calculator = new Calculator();
            int actualRetult = calculator.subtraction(10,5);
            System.out.println(actualRetult);
            int expectedResult = 5;
            Assert.assertEquals(expectedResult,actualRetult);
            System.out.println("exceptedResult is equal to actualResult thus method is working good");
        }
    }

