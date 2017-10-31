package com.example.dzlica.foxclub.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.text.resources.cldr.is.FormatData_is;

import java.util.List;

public class Fox {
    String name;
    String tricks;
    String food;
    String drink;



    public Fox(String name, String tricks, String food, String drink) {
        this.name = FoxEns.getARandomName();
        this.tricks = FoxEns.getARandomTrick();
        this.food = FoxEns.getARandomFood();
        this.drink = FoxEns.getARandomDrink();
    }





}
