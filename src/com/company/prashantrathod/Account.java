package com.company.prashantrathod;

public class Account {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public Account() {
        this(987654, 0.0, "Default Name", "Default Email", 987654321);
    }

    //Constructor
    public Account(int accountNumber, double balance, String name, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit Amount of " + depositAmount + " processed, remaining balance: " + this.balance);

    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available, withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal Amount processed, remaining balance: " + this.balance);
        }
    }




    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
