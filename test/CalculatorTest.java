import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculatorTest {
    @org.junit.jupiter.api.Test
    public void multiply() {

        double result = Calculator.multiply(5,10);
        Assertions.assertEquals(49,result);
    }

    @Test
    void divide() {
        double result = Calculator.divide(10,10);
        Assertions.assertEquals(49,result);
    }
}