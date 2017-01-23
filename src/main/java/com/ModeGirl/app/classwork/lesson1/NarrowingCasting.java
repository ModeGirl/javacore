package com.ModeGirl.app.classwork.lesson1;

/**
 * Created by wqa on 1/19/17.
 */
public class NarrowingCasting {
    int int1 = 0;
    float float1 = 3.14567f;

    public static void main(String[] args) {
      NarrowingCasting narrowingCasting = new NarrowingCasting();
      narrowingCasting.narrowing();
    }

    public void narrowing(){
        int1 =  (int) float1;
        System.out.println(int1);
    }
}
