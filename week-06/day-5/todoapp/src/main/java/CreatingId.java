import java.util.concurrent.atomic.AtomicInteger;

public class CreatingId {
    static int initialValue = 1;
    public static AtomicInteger idCounter = new AtomicInteger(initialValue);

    public static String createID()
    {
        return String.valueOf(idCounter.getAndIncrement());
    }
}
