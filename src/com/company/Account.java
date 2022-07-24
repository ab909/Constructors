package com.company;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress) {
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
    }

    public Account (){
        this("12345", 10.00,
                "Max Smith", "abc@gmail.com",
                "6479999995");
        System.out.println("Empty constructor called");
    }
    public Account (String number, double balance, String customerName, String customerEmailAddress,
                    String customerPhoneNumber){
        System.out.println("Account with parameters called");
        this.number =number;
        this.balance=balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }

    public void withdrawl(double withdrawlAmount){
        if(balance - withdrawlAmount < 0){
            System.out.println("Only " + balance + " available. Withdrawl not processed");
        } else {
            balance -=withdrawlAmount;
            System.out.println("Withdrawl of " + withdrawlAmount + " processed balance " + this.balance);
        }
    }


    public String getAccountNumber() {
        return number;
    }

    public void setAccountNumber(String accountNumber) {
        this.number = accountNumber;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void setAccountBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
