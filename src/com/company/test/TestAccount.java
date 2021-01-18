package com.company.test;

import com.company.Account;
import com.company.Customer2;

public class TestAccount {

    public static void main(String[] args) {

        Customer2 customerB = new Customer2(123, "Aga", 'M');
        Account account = new Account(456, customerB, 87951);
        System.out.println(account);
        System.out.println(account.deposit(49841));
        System.out.println(account.withdraw(8794));
    }

}
