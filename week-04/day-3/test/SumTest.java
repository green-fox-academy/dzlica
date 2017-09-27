import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
    ArrayList<Integer> testing = new ArrayList<>(Arrays.asList(1, 2));
    Sum tesztPeldany = new Sum();

    @Test
    public void testSumAll() {
        assertEquals(3, tesztPeldany.sumAll(testing));
    }



}