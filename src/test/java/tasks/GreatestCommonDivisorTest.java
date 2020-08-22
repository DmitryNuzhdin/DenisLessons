package tasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GreatestCommonDivisorTest {
    @Parameterized.Parameters(name = " (a={1}, b={2}) -> ({0}) ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3},
                {16, 16, 32},
                {16, 32, 16},
                {4, 20, 44},
                {4, 44, 20},
                {5, 35, 55},
                {5, 55, 35},
                {11, 22, 121},
                {1, 101, 17},
                {1, 12, 35}
        });
    }

    private int a;
    private int b;
    private int result;

    public GreatestCommonDivisorTest(Integer result, Integer a, Integer b) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Test
    public void gcd() {
        assertEquals(result, GreatestCommonDivisor.gcd(a, b));
    }
}
