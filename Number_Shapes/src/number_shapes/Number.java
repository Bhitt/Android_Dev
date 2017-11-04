/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number_shapes;

/**
 *
 * @author bhitt
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
