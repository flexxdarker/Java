package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int n;
//        Scanner cin = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        n = cin.nextInt();
//        System.out.println("n->" + n);
//        int [] arr = new int[n];
//        for(int i = 0; i<n; i++) {
//            arr[i] = rancdomValue(1, 60);
//        }
//        for(int item: arr){
//            System.out.printf("%d\t",item);
//        }
//        System.out.println();
//        int count = 0;
//        int i = 0;
//        while (i<n){
//            if(arr[i]>20)
//                count++;
//            i++;
//        System.out.println("older then 20:"+count);
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
//    public static int rancdomValue(int min, int max)
//    {
//        Random rand = new Random();
//        return rand.nextInt((max-min)+1)+min;
//    }
