package com.ModeGirl.app.utils.convertors;

/**
 * Created by wqa on 1/23/17.
 */
public class PrimitiveConvertor {
    int int1 = 100;
    float float1 = 1.533f;
    char char1 = 2;

    public void floatToChar() {
        float1 = char1;
        System.out.println("Input float value is " + float1 +". Output char value is " + char1);
    }
    public void intToChar(){
        int1 = char1;
        System.out.println("Input int value is " + int1 +". Output char value is " + char1);
    }
    public void charToInt(){
        int1 = char1;
        System.out.println("Input char value is " + char1 +". Output int value is " + int1);
    }
}
