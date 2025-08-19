package Practical4;

import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        System.out.print("What is " + number1 + " + " + number2 + " ? ");
        int sumAnswer = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + sumAnswer + " is " + (sumAnswer == (number1 + number2)));

        System.out.print("What is " + number1 + " % " + number2 + " ? ");
        int modAnswer = input.nextInt();
        System.out.println(number1 + " % " + number2 + " = " + modAnswer + " is " + (modAnswer == (number1 % number2)));
    }
}
