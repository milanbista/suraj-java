package org.example.service;

import org.example.model.BankAccount;
import org.example.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tools.jackson.databind.ser.jdk.JDKKeySerializers;

@Service
@Transactional
public class BankService {

    @Autowired
    private BankRepository bankRepository;


    public String sendMoney(Long amount, String sender, String receiver) {


       BankAccount senderUser =  bankRepository.findByName(sender);
       BankAccount receiverUser = bankRepository.findByName(receiver);

       //balance check
        //fraud check

       //withdraw
        withdraw(amount, senderUser);

        //deposit
        deposit(amount, receiverUser);

        return null;
    }

    private void withdraw(Long amount, BankAccount sender){

      sender.setBalance( sender.getBalance() - amount);
      bankRepository.save(sender);

    }

    private void deposit(Long amount, BankAccount receiver){


        receiver.setBalance(receiver.getBalance() + amount);
        bankRepository.save(receiver);
    }
}
