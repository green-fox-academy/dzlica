package com.greenfox.dzlica.bankofsimba.Controllers;

import com.greenfox.dzlica.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GivingMoney {
    @RequestMapping(value="/givemoney", method = RequestMethod.GET)
    public String givemoney(Model model) {
        BankAccount myAccount = new BankAccount("Simba", 2000, "lion", true, true);
        myAccount.balance += 10;
        model.addAttribute("name", myAccount.name);
        model.addAttribute("balance", myAccount.balance);
        return "givemoney";
    }
}
