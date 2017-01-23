package com.ModeGirl.app.classwork.lesson1;

/**
 * Created by wqa on 1/19/17.
 */
public class WideningCasting {
    byte byte1 = 127;
    short short1 = 0;
    int int1 = 0;
    long long1 = 0L;
    float float1 = 0.0f;

    public static void main(String[] args) {
        WideningCasting wideningCasting = new WideningCasting();
        wideningCasting.widening();
    }

    public void widening(){
        System.out.println(byte1);
    }


}
