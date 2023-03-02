package org.example;

abstract class Calculator{
    double num1;
    double num2;

    Calculator(double first,double second){
        this.num1=first;
        this.num2=second;
    }
    abstract double calc();
}