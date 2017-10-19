import java.util.*;

public class ParkingLot {


    ArrayList<Car> parkingLot;


    public ParkingLot() {
        parkingLot = new ArrayList<>();
        for (int i = 0; i < 255; i++) {
            parkingLot.add(new Car());
        }
    }


    public void printLot() {
        for (Car car: parkingLot) {
            System.out.println(car);
        }
    }


    public void carHash() {
        HashMap listOfCars = new HashMap();

    }


}
