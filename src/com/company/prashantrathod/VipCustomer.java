package com.company.prashantrathod;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer() {
        this("default_name", 0, "default_email");
    }

    public VipCustomer(String name, String email) {
        this(name, 0, email);

    }


    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
