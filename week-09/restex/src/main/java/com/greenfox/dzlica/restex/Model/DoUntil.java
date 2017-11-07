package com.greenfox.dzlica.restex.Model;

public class DoUntil {
    String what;
    int result;

    public DoUntil(int tokmasig, String what) {
        this.what = what;
        if (what.equals("sum")) {
            int temp = 0;
            for (int i = 1; i <= tokmasig; i++) {
                temp += i;
            }
            this.result = temp;
        }
        else if (what.equals("factor")) {
            int temp = 1;
            for (int i = 1; i <= tokmasig; i++) {
                temp *= i;
            }
            this.result = temp;
        }
    }

    public DoUntil() {
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }


}
