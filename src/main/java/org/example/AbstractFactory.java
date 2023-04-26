package org.example;

public interface AbstractFactory {
    DomesticShipping createDomesticShipping();
    InternationalShipping createInternationalShipping();
}