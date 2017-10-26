package com.greenfox.dzlica.bankofsimba.Controllers;

import com.greenfox.dzlica.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ListOfAccounts {
    ArrayList<BankAccount> myAccounts;

    private ArrayList<BankAccount> generateAccounts() {
        if (this.myAccounts == null) {
            ArrayList<BankAccount> someAccount = new ArrayList<>();
            someAccount.add(new BankAccount("Simba", 2000, "lion", true, false));
            someAccount.add(new BankAccount("Scar", 5000, "lion", false, true));
            someAccount.add(new BankAccount("Rafiki", 1300, "mandrill", false, false));
            someAccount.add(new BankAccount("Ed", 230, "hyena", false, true));
            this.myAccounts = someAccount;
        }
        return this.myAccounts;
    }

    @GetMapping(value="/listaccounts")
    public String listaccounts(Model model) {
        ArrayList<BankAccount> someAccount = this.generateAccounts();
        model.addAttribute("someaccounts", someAccount);
        model.addAttribute("formaccount", new BankAccount("", 0, "", false, false));
        return "listaccounts";
    }

    @PostMapping(value="/listaccounts")
    public String giveMoney(@ModelAttribute BankAccount formaccount, Model model) {
        ArrayList<BankAccount> someAccount = this.generateAccounts();
        for (int i = 0; i < someAccount.size(); i++) {
            if (someAccount.get(i).name.equals(formaccount.name)) {
                BankAccount temp = someAccount.get(i);
                if (temp.king) {
                    temp.balance += 100;
                } else {
                    temp.balance += 10;
                }
                someAccount.set(i, temp);
                myAccounts.set(i, temp);
            }
        }
        model.addAttribute("someaccounts", someAccount);
        model.addAttribute("formaccount", new BankAccount("", 0, "", false, false));
        return "listaccounts";
    }
}
