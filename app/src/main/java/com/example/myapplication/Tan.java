package com.example.myapplication;

public class Tan implements Operations{
    @Override
    public double operation(double a, double b) {
        double result;
        if(b==0) //Radians
            result =  a;
        else //Degrees, b==1
            result = a*(Math.PI/180);
        return Math.tan(result);
    }

}
