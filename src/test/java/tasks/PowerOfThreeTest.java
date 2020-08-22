package tasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PowerOfThreeTest {
    @Parameterized.Parameters(name = " ({0}) -> ({1}) ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, true},
                {3, true},
                {9, true},
                {27, true},
                {81, true},
                {0, false},
                {2, false},
                {4, false},
                {6, false},
                {33, false},
                {66, false},
                {100, false},
                {123, false},
                {-1, false},
                {-3, false},
                {-9, false}
        });
    }
    private int p1;
    private boolean result;

    public PowerOfThreeTest(Integer p1, Boolean result) {
        this.p1 = p1;
        this.result = result;
    }

    @Test
    public void powerOfThree() {
        assertEquals(PowerOfThree.powerOfThree(p1), result);
    }
}
