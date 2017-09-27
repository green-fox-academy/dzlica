import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci testFib = new Fibonacci();
    int n = 3;

    @Test
    public void testFibonacci() {
        assertEquals(2, testFib.fibonacci(n));
    }

}