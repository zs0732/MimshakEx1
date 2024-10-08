package com.example.mimshakex1;

public class Phone implements Chargeable {
    @Override
    public void charge() {
        System.out.println("the Phone is charging.");
    }
    public void CameraQuality(){
        System.out.println("The Camera quality is very good.");
    }
}
