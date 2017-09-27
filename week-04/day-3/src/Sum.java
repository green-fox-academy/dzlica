import java.util.ArrayList;

public class Sum {
    ArrayList<Integer> numbers;
    int szam;

    public Sum() {
        numbers = new ArrayList<>();
    }

    public void add() {
        this.numbers.add(szam);
    }

    public int sumAll(ArrayList<Integer> numbers) {
        int osszead = 0;
        for (int i = 0; i < numbers.size(); i++) {
            osszead += numbers.get(i);
        }
        return osszead;
    }
}
