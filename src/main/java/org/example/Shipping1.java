package org.example;

public class Shipping1 implements DomesticShipping {
    @Override
    public void getShippingCharges() {
        System.out.println("Domestic Shipping charges :: 500 ");
    }
}
