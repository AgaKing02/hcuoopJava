package com.company.test;

import com.company.Customer;
import com.company.Invoice;

public class TestInvoice {

    public static void main(String[] args) {

        Customer customer = new Customer(784, "Beka", 40);
        Invoice invoice = new Invoice(132, customer, 3000);
        System.out.println(invoice);
        System.out.println(invoice.getCustomerName());
        System.out.println(invoice.getAmountAfterDiscount());
    }

}
