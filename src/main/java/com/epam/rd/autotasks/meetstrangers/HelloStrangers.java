package com.epam.rd.autotasks.meetstrangers;

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number=input.nextInt();
        input.nextLine();

        if (number<0){
            System.out.println("Seriously? Why so negative?");
        } else if (number==0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        else {
            for (int i = 0; i < number; i++) {
                String name=input.nextLine();
                System.out.println("Hello, " + name);
            }
        }
    }
}
