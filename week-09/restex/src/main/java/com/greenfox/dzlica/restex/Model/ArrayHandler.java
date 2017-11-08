package com.greenfox.dzlica.restex.Model;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {

    String what;
    List<Integer> numbers = new ArrayList<>();

    public ArrayHandler() {
    }


    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
