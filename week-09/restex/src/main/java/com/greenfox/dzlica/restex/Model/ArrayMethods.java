package com.greenfox.dzlica.restex.Model;


public class ArrayMethods {

    Object result;

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public ArrayMethods(String what, int[] numbers) {
        if (what.equals("sum")) {
            this.result = sum(numbers);
        }
        if (what.equals("multiply")) {
            this.result = multiply(numbers);
        }
        if (what.equals("double")) {
            this.result = dupla(numbers);
        }
    }

    public int sum(int[] numbers) {
        int temp = 0;
        for (int i : numbers)
            temp += i;
        return temp;
        }


    public int multiply(int[] numbers) {
        int temp = 0;
        for (int i : numbers)
            temp *= i;
        return temp;
    }

    public int[] dupla(int[] numbers) {
        int[] doubleit = new int [numbers.length];
        for (int i = 0; i < doubleit.length; i++) {
            int temp = numbers[i] * 2;
            doubleit[i] = temp;
        }
        return doubleit;
    }


}
