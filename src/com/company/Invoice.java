package com.company;

public class Invoice {

    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public double getAmountAfterDiscount() {
        return amount * customer.getDiscount() / 100;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "ID=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }

}
