package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("primul numar");
        double n1=input.nextDouble();
        input.nextLine();
        System.out.println("Al doilea numar");
        double n2=input.nextDouble();

        System.out.println(Math.abs(n1-n2)<0.01);

    }
}
