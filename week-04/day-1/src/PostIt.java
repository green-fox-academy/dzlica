public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public static void main(String[] args) {
        PostIt orange = new PostIt("orange", "Idea 1", "blue");
        PostIt pink = new PostIt("pink", "Awesome", "black");
        PostIt yellow = new PostIt("yellow","Superb!", "green");

    }
}

