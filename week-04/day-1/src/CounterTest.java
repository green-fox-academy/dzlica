import org.junit.Test;


import static junit.framework.TestCase.assertEquals;


/**
 * Created by aze on 2017.03.29..
 */
class CounterTest {
    @Test
    public void addNumber() throws Exception {
    }

    @Test
    public void add() throws Exception {
    }

    @Test
    public void getCurrent() throws Exception {
    }

    @Test
    public void reset() throws Exception {
    }

    @Test
    public void main() throws Exception {
    }

    Counter c = new Counter();

    @Test
    void addMore() {
        c.add(5);
        assertEquals(5, c.get());
    }

    @Test
    void addOne() {
        c.add();
        assertEquals(1, c.get());
    }

    @Test
    void getZero() {
        assertEquals(0, c.get());
    }

    @Test
    void getInit() {
        Counter c = new Counter(7);
        assertEquals(7, c.get());
    }

    @Test
    void resetToZero() {
        c.add();
        c.reset();
        assertEquals(0, c.get());
    }

    @Test
    void resetToInit() {
        Counter c = new Counter(7);
        c.add(5);
        c.reset();
        assertEquals(7, c.get());
    }

}
