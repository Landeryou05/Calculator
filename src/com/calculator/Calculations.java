package com.calculator;

public class Calculations {
    public static Integer answer = 0;

    public Integer addition(Integer number1, Integer number2){
        answer = number1 + number2;
        return answer;
    }

    public Integer subtraction(Integer number1, Integer number2){
        answer = number1 - number2;
        return answer;
    }

    public Integer multiplication(Integer number1, Integer number2){
        answer = number1 * number2;
        return answer;
    }

    public Integer division(Integer number1, Integer number2){
        answer = number1 / number2;
        return answer;
    }
}
