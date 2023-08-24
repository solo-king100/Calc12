package Test;

import AddAndMulti.Plus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;


class PlusTest {

    Plus plus;
    @BeforeEach
    void setUp() {
        plus=new Plus();

    }

    @Test
    void addNumbers() {
        double actualSum = plus.addNumbers(2,3);
       assertEquals(7,actualSum);
    }
}

