package Test;

import AddAndMulti.Multiply;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    Multiply multiply;

    @BeforeEach
    void setUp() {
        multiply=new Multiply();
    }

    @Test
    void multiplyNumbers() {
        double actualMultiplication = multiply.multiplyNumbers(2,3);
        assertEquals(7,actualMultiplication);
    }
}