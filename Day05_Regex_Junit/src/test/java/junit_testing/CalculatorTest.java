package junit_testing;

import junit.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    int num1 = 5;
    int num2 = 7;
    @Test
    public void add(){
      int res = num1+num2;
        Assertions.assertEquals(Calculator.add(num1 ,num2),res);
    }
    @Test
    public void subtract(){
        int res = num2-num1;
        Assertions.assertEquals(Calculator.subtraction(num1,num2),res);
    }
    @Test
    public void multiply(){
        int res = num1*num2;
        Assertions.assertEquals(Calculator.multiply(num1,num2),res);
    }
    @Test
    public void divide(){
        int res = num2/num1;
        Assertions.assertEquals(Calculator.divide(num1,num2),res);
    }
}
