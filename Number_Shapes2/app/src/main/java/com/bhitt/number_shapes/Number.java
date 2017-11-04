package com.bhitt.number_shapes;

/**
 * Created by bhitt on 11/3/2017.
 */

public class Number {
    private int number;

    public boolean isTriangular(){
        int x = 1;
        int triangularNumber = 1;

        while(triangularNumber<getNumber()){
            x++;
            triangularNumber+=x;
        }
        if(triangularNumber==getNumber())return true;

        return false;

    }

    public boolean isSquare(){
        double squareRoot = Math.sqrt(number);
        if(squareRoot == Math.floor(squareRoot))return true;
        return false;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
}
