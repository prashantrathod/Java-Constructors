package com.company.prashantrathod;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        BankAccount currAcc = new BankAccount();
        currAcc.setAccountNumber(123456);
        currAcc.setBalance(100.00);
        currAcc.setEmail("a@apple.com");
        currAcc.setName("John Appleseed");
        currAcc.setPhoneNumber(1234525456);

//        System.out.println("accountNumber: " + currAcc.getAccountNumber() +
//                "\nbalance: " + currAcc.getBalance() +
//                "\nname: " + currAcc.getName() +
//                "\nemail " + currAcc.getEmail() +
//                "\nphoneNumber " + currAcc.getPhoneNumber());
//
//
//        currAcc.depositFunds(25.00, currAcc.getBalance());
//        currAcc.withdrawFunds(100.00, currAcc.getBalance());
//        System.out.println("Current Balance: " + currAcc.getBalance());
//        currAcc.withdrawFunds(500.00, currAcc.getBalance());

        //initialised constructor:
        Account bobsAccount = new Account(123456, 100.00, "bob", "bob@apple.com", 123456789);
        Account prashAccount = new Account();

        System.out.println(bobsAccount.getBalance());
        System.out.println(prashAccount.getBalance() + " " + prashAccount.getName() );


        VipCustomer prash = new VipCustomer();
        System.out.println(prash.getName() + prash.getCreditLimit() + prash.getEmail());

        VipCustomer sanj = new VipCustomer("sj", "sj@apple.com");
        System.out.println(sanj.getName() + sanj.getCreditLimit() + sanj.getEmail());

        VipCustomer pj = new VipCustomer("pj", 5000, "pj@apple.com");
        System.out.println(pj.getName() + " " + pj.getCreditLimit() + " " + pj.getEmail());

    }
}
