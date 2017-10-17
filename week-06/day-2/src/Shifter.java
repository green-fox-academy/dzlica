public class Shifter implements CharSequence {
    String word;
    int shifter;

    public Shifter(String word, int shifter) {
        this.word = word;
        this.shifter = shifter;
    }


    @Override
    public int length() {
        return this.word.length();
    }

    @Override
    public char charAt(int index) {
        return this.word.charAt(this.shifter);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public static void main(String[] args) {
        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));
    }
}
