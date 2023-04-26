package org.example;

public class ShippingFactory implements AbstractFactory {
    @Override
    public DomesticShipping createDomesticShipping() {
        return new Shipping1();
    }

    @Override
    public InternationalShipping createInternationalShipping() {
        return new Shipping2();
    }
}