package main.java.reservation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Reservation implements Reservationy {
    @Override
    public String getDowBooking() {
        return null;
    }

    @Override
    public String getCodeBooking() {
        String alphabet= "0123456789ABCDEFGHIJKELMNOPQRSTUVWXYZ";
        String reservCode = "";
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            char c = alphabet.charAt(random.nextInt(36));
            reservCode.concat(String.valueOf(c));
        }
        return reservCode;
    }
}
