package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ShippingFactory();

        DomesticShipping domesticShipping = factory.createDomesticShipping();
        domesticShipping.getShippingCharges();

        InternationalShipping internationalShipping = factory.createInternationalShipping();
        internationalShipping.getExtraCharges();
    }
}
/*
* Output:
* Domestic Shipping charges :: 500
International Shipping charges :: 1000
* */