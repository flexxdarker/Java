package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        int score = 0;
            while (i < 3) {
                Random rand = new Random();
                int firstNum = rand.nextInt(10);
                int secondNum = rand.nextInt(10);
                int result = firstNum * secondNum;
                int userRes;
                System.out.println("calculate: " + firstNum + " * " + secondNum + " = ");
                Scanner cin = new Scanner(System.in);
                userRes = cin.nextInt();
                if (userRes == result)
                    score++;
                i++;
            }
        System.out.println("Your result: " + score);
        }
    }
