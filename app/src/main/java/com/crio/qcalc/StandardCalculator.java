package com.crio.qcalc;

public class StandardCalculator {
    private double result;
    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
    
    
public void add(double num1, double num2){

    double result = num1 + num2;

    if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;

}


    
   
public void subtract(double num1, double num2){

    double result = num1 - num2;

    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;

}



public void multiply(double num1, double num2){

    double result = num1 * num2;

    if((result == Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) ||(result==-Double.MAX_VALUE)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;

}


public void divide(double num1, double num2){

    double result = num1 / num2;

    if((result == Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) ||(result==-Double.MAX_VALUE)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;

}

    public double getResult(){return result;}

    public void printResult(){
        System.out.println("Standard Calculator Result:"+result);
    }








}
