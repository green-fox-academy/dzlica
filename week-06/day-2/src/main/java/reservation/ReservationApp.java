package main.java.reservation;

public class ReservationApp {
    public static void main(String[] args) {

        Reservation reservation = new Reservation();
        System.out.printf("Booking# %s for %s", reservation.getCodeBooking(), reservation.getDowBooking());

    }
}
