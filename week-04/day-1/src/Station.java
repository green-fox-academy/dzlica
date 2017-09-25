public class Station {
    int gasAmount;
    int fill = 110;
    public Station() {
    }
    public Station(int gasAmount){
        this.gasAmount = gasAmount;
    }
    public int refill(Car car) {
        if ((car.gasAmount + fill) < car.capacity) {
            car.gasAmount = car.gasAmount + fill;
            this.gasAmount = this.gasAmount - fill;
        }
        else {
            car.gasAmount = car.capacity - fill;
            car.gasAmount = car.gasAmount + fill;
            this.gasAmount = this.gasAmount - car.gasAmount;
        }
        return car.gasAmount;

    }
}
