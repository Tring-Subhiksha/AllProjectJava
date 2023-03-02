package org.example;
class Add extends Calculator{
    Add(double first,double second){
        super(first,second);
    }
    double calc(){
        return num1+num2;
    }
}
