package org.example.controller;

import org.example.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/sendmoney")
    @ResponseBody
    public String sendMoney(@RequestParam("amount") Long amount,
                            @RequestParam("sender") String sender,
                            @RequestParam("receiver") String receiver) {

        return bankService.sendMoney(amount, sender, receiver);
    }

}
