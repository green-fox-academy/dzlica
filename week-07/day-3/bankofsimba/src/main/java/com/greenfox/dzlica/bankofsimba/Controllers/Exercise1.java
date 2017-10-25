package com.greenfox.dzlica.bankofsimba.Controllers;

import com.greenfox.dzlica.bankofsimba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Exercise1 {

    @RequestMapping(value="bankofsimba")
    public String accounts(Model model) {
        BankAccount myAccount = new BankAccount("Simba", 2000, "lion");
        model.addAttribute("name", myAccount.name);
        model.addAttribute("balance", myAccount.balance);
        model.addAttribute("animalType", myAccount.animalType);
        return "accounts";
    }
}
