package com.mycompany.app.math;

public class MyMath {

    public int calculateSum(int[] numbers){
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public boolean Find0(int[] numbers){
        for (int i : numbers) {
            if(i==0){
                return true;
            }
        }
        return false;
    }
}
