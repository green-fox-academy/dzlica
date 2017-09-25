import com.sun.tools.internal.ws.wsdl.document.soap.SOAP12Binding;

public class Pirate {
    int drunk;
    boolean passOut;

    public Pirate () {
        this.drunk = 0;
    }
    public void drinkSomeRum() {
        this.drunk = this.drunk + 50;
    }
    public void setPassOut() {
        this.passOut = true;
        System.out.println("This pirate passed out");
    }

    public void howsItGoingMate() {
        if (this.drunk <= 200) {
            System.out.println("Pour me anudder!");
        }
        else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.drunk = 0;
            this.setPassOut();
        }

    }
    public static void main(String[] args) {
        Pirate pirateOne = new Pirate();
        Pirate pirateTwo = new Pirate();
        pirateOne.drinkSomeRum();
        pirateOne.drinkSomeRum();
        pirateOne.drinkSomeRum();
        pirateOne.drinkSomeRum();
        pirateOne.drinkSomeRum();
        pirateTwo.drinkSomeRum();
        pirateOne.howsItGoingMate();
        pirateTwo.howsItGoingMate();


    }
}
