public class Gnirts implements CharSequence {
    String word;

    public Gnirts(String word) {
        this.word = word;
    }

    @Override
    public int length() {
        return this.word.length();
    }

    @Override
    public char charAt(int index) {
        return this.word.charAt(length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public static void main(String[] args) {
        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
    }
}
