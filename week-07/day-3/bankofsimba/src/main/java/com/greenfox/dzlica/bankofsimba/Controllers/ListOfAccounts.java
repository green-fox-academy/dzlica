package com.greenfox.dzlica.bankofsimba.Controllers;

import com.greenfox.dzlica.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ListOfAccounts {

    @RequestMapping(value="/listaccounts")
    public String listaccounts(Model model) {
        ArrayList<BankAccount> someAccount = new ArrayList<>();
        someAccount.add(new BankAccount("Simba", 2000, "lion", true));
        someAccount.add(new BankAccount("Scar", 5000, "lion", false));
        someAccount.add(new BankAccount("Rafiki", 1300, "mandrill", false));
        someAccount.add(new BankAccount("Ed", 230, "hyena", false));
        model.addAttribute("someaccounts", someAccount);
        return "listaccounts";
    }
}
