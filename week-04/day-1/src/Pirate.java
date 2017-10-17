import com.sun.tools.internal.ws.wsdl.document.soap.SOAP12Binding;

public class Pirate {
    int drunk;
    boolean passOut;
    boolean dead;

    public Pirate () {
        this.drunk = 0;
        this.dead = false;
        this.passOut = false;
    }
    public void drinkSomeRum() {
        if (!this.dead) {
            this.drunk = this.drunk + 50;
            this.die();
        }
    }
    public void drinkSomeRum(int count) {
        if (!this.dead) {
            this.drunk = this.drunk + (count * 50);
            this.die();
        }
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
    public void die() {
        if (this.drunk > 400) {
            System.out.println("He is dead");
            this.dead = true;
        }
    }
    public static void main(String[] args) {
        Pirate pirateOne = new Pirate();
        Pirate pirateTwo = new Pirate();
        pirateOne.drinkSomeRum(4);
        pirateTwo.drinkSomeRum();
        pirateOne.howsItGoingMate();
        pirateTwo.howsItGoingMate();


    }
}
