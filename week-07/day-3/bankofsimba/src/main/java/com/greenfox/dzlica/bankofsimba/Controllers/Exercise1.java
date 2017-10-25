package com.greenfox.dzlica.bankofsimba.Controllers;

import com.greenfox.dzlica.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Exercise1 {

    @RequestMapping(value="bankofsimba")
    public String accounts(Model model) {
        BankAccount myAccount = new BankAccount("Simba", 2000, "lion", true);
        model.addAttribute("name", myAccount.name);
        model.addAttribute("balance", myAccount.balance);
        model.addAttribute("animalType", myAccount.animalType);
        model.addAttribute("currency", myAccount.getCurrency());
        return "accounts";
    }
}
