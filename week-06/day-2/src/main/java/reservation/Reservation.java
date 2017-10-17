package main.java.reservation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Reservation implements Reservationy {
    @Override
    public String getDowBooking() {
        ArrayList<String> dayOfWeek = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
        Random randomDay = new Random();
        String result = dayOfWeek.get(randomDay.nextInt(dayOfWeek.size()));
        return result;
    }

    @Override
    public String getCodeBooking() {
        String alphabet= "0123456789ABCDEFGHIJKELMNOPQRSTUVWXYZ";
        String reservCode = "";
        Random randomC = new Random();
        for (int i = 0; i < 8; i++) {
            char c = alphabet.charAt(randomC.nextInt(alphabet.length()));
            reservCode += c;
        }
        return reservCode;
    }
}
