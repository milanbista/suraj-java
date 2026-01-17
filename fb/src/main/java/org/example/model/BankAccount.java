package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bank")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String accountNo;

    private Long balance;

    public BankAccount(){}

    public BankAccount(Long id, String name, String accountNo, Long balance) {
        this.id = id;
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }


}
