import java.util.*;

public class Unique {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));
        ArrayList<Integer> output = osszeHasonlit(input);
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
    private static ArrayList<Integer> osszeHasonlit(ArrayList<Integer> kiskutya) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < kiskutya.size(); i++) {
            if (!output.contains(kiskutya.get(i))) {
                output.add(kiskutya.get(i));
            }
        }
        return output;
        }
}
