package com.company;

public class Main {

    public static void main(String[] args) {

//        Account bobsAccount = new Account();
//        bobsAccount.withdrawl(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawl(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawl(100.0);
//
//        Account account = new Account("12345", 0.00,
//                "John Smith", "abc@gmail.com",
//                "6479999999");

        //Account bobAccount2 = new Account();

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Tim",25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Bob",25000.00, "tom@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}
