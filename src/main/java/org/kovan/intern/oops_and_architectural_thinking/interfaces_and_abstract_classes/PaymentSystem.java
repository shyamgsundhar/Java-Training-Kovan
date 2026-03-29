package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

interface Payment{
    abstract void pay(double amount);
}

class CreditCard implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid Using Credit Card");
    }
}

class UPI implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid using UPI");
    }
}

class Cash implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid Using Cash");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
       Payment payment = new Cash();
       payment.pay(50);
    }
}
