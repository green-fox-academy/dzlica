import java.util.ArrayList;

public class SharpieSet {
    public ArrayList<Sharpie> Sharpies;
    public SharpieSet() {
        Sharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        this.Sharpies.add(sharpie);
    }

    public int countUsable() {
        int szamlalo = 0;
        for (int i = 0; i < Sharpies.size(); i++) {
            if (Sharpies.get(i).inkAmount > 0) {
                szamlalo += 1;
            }
        }
        return szamlalo;
    }

    public void removeTrash() {
        for (int i = 0; i < Sharpies.size(); i++) {
            if (Sharpies.get(i).inkAmount <= 0) {
                Sharpies.remove(i);
            }
        }
    }

    public void nyomtatok() {
        for (int i = 0; i < Sharpies.size(); i++) {
            System.out.println(Sharpies.get(i));
        }
    }

    public static void main(String[] args) {
        SharpieSet tollak = new SharpieSet();
        Sharpie one = new Sharpie("red", 200);
        Sharpie two = new Sharpie("black", 100);
        Sharpie three = new Sharpie("yellow", 50);
        tollak.add(one);
        tollak.add(two);
        tollak.add(three);
        one.use(21);
        two.use(3);
        three.use(12);

        tollak.nyomtatok();
        tollak.removeTrash();
        tollak.nyomtatok();



    }

}
