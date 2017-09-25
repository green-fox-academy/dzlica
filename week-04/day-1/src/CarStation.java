public class CarStation {
    public static void main(String[] args) {

        Car opel = new Car(0, 100);
        Station mol = new Station();
        mol.gasAmount = 500;

        System.out.println(mol.refill(opel));
        System.out.println(mol.gasAmount);
    }
}
