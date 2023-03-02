package org.example;

class Mul extends Calculator{
    Mul(double first,double second){
        super(first,second);
    }
    double calc(){
        return num1*num2;
    }
}
