package com.company;

public class AddOperation implements MathOperation{
    int num1, num2, res;

    @Override
    public int performOperation(int num1, int num2) {
        res = num1+num2;
        return res;
    }

}
