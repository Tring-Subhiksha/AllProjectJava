package org.example.calculatornew;

class Div extends Calculator{
    Div(double first,double second){
        super(first,second);
    }
    double calc(){
        return num1/num2;
    }
}