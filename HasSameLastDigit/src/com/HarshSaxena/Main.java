package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hasSameLastDigit(22, 23, 34);
        //isValid(1051);
    }
    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum){
        if((firstNum < 10) || (firstNum > 1000) || (secondNum < 10) || (secondNum > 1000)
                || (thirdNum < 10) || (thirdNum > 1000)){
            return false;
        }
        int firstNum_LD;
        int secondNum_LD;
        int thirdNum_LD;

        firstNum_LD = firstNum % 10;
        secondNum_LD = secondNum % 10;
        thirdNum_LD = thirdNum % 10;

        if( (firstNum_LD == secondNum_LD) || (firstNum_LD == thirdNum_LD)
                || (secondNum_LD == thirdNum_LD)){
            return true;

        }else{
            return false;
        }
    }
    public static boolean isValid(int number){
        if((number < 10) || (number > 1000)){
            return false;
        }
        System.out.println(number);
        return true;
    }
}
