package com.example.mimshakex1;

public class Main {
    public static void main(String[] args) {

        Chargeable[] chargeables = new Chargeable[3];
        chargeables[0] = (new Laptop());
        chargeables[1] = (new Tablet());
        chargeables[2] = (new Phone());

        for (Chargeable creature : chargeables) {
            creature.charge();
        }

    }

}
