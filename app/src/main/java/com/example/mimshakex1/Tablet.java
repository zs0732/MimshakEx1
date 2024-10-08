package com.example.mimshakex1;

public class Tablet implements Chargeable{
    @Override
    public void charge() {
        System.out.println("the Tablet is charging. ");
    }
    public void color(){
        System.out.println("The Table is black.");
    }
}
