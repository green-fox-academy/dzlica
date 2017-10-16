import java.util.ArrayList;
import java.util.Arrays;

public class PokerDojo {
    ArrayList<String> colors = new ArrayList<>(Arrays.asList("C", "D", "H", "S"));
    ArrayList<String> values = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"));
    ArrayList<String> handA = new ArrayList<>();
    ArrayList<String> handB = new ArrayList<>();
    ArrayList<String> cards1 = new ArrayList<>(Arrays.asList("D3", "S4", "H12", "H3", "C10"));
    ArrayList<String> cards2 = new ArrayList<>(Arrays.asList("H11", "D10", "D11", "C7", "H14"));

    public void randomCard() {
        for (int i = 0; i < 5; i++) {
            int randColor = (int) ((Math.random() * 4) + 1);
            int randValues = (int) ((Math.random() * 13) + 1);
            handA.add(colors.get(randColor - 1).concat(values.get(randValues - 1)));


        }
        for (int i = 0; i < 5; i++) {
            int randColor = (int) ((Math.random() * 4) + 1);
            int randValues = (int) ((Math.random() * 13) + 1);
            handB.add(colors.get(randColor - 1).concat(values.get(randValues - 1)));
        }
    }

    public int biggestCards(ArrayList<String> cards) {
        int temp = Integer.parseInt(cards.get(0).substring(1));
        for (int i = 0; i < cards.size(); i++) {
            int number = Integer.parseInt(cards.get(i).substring(1));
            if (number > temp) {
                temp = number;
            }
        }
        return temp;
    }

    public int compareCards(ArrayList<String> cards) {
        int bigCard = 0;
        if (biggestCards(cards1) > biggestCards(cards2)) {
            bigCard = biggestCards(cards1);
        }
        else if (biggestCards(cards1) < biggestCards(cards2)) {
            bigCard = biggestCards(cards2);
        }
        return bigCard;
    }


    public static void main(String[] args) {
        PokerDojo poker = new PokerDojo();

        poker.randomCard();
        System.out.println(poker.handA);
        System.out.println(poker.handB);

        }


}


