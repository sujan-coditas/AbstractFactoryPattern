package org.example;

import org.example.InternationalShipping;

public class Shipping2 implements InternationalShipping {
    @Override
    public void getExtraCharges() {
        System.out.println("International Shipping charges :: 1000 ");
    }
}