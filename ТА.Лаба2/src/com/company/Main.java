package com.company;

import java.util.Scanner;

import static com.company.Task1.iteration_method;
import static com.company.Task2.recursion_method;

public class Main {
    public static void main(String[] args) {
        Start();
    }


    public  static  void Start(){

        System.out.println("Task 1 ");
        System.out.println("Введіть число ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Ітеративний спосіб  ");
        System.out.println(iteration_method(n));
        System.out.println("Рекурсивний спосіб ");
        System.out.println(Task1.recursion_method(n));
        System.out.println( );

        System.out.println("Task 2 ");
        System.out.println("Введіть 2 числа ");
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println("Відповідь : ");
        System.out.println(Task2.recursion_method(m, k));
    }


}