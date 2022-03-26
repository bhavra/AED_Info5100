package com.company;

public class SubtractOperation implements MathOperation{
    int num1, num2, res;
    @Override
    public int performOperation(int num1, int num2) {
        if (num1 > num2)
            res = num1 - num2;
        else
            res = num2 - num1;
    return  res;
    }
}
