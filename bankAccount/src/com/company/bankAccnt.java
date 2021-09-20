package com.company;

public class bankAccnt {

    private String accountNumber;
    private long balance;
    private String CustomerName;
    private String email;
    private String phone;

    public bankAccnt(String accountNumber, long balance, String customerName, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        CustomerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit is possible." + balance);
    }
    public void withdrawal(double withdrawAmount) {
        if (balance-withdrawAmount < 0) {
            System.out.println("This is invalid");
        }
        this.balance -= withdrawAmount;
        System.out.println("Withdraw can be done" + balance + " "+ withdrawAmount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
