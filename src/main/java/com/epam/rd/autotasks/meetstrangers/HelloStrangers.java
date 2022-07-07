package com.epam.rd.autotasks.meetstrangers;

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
        if (number<0){
            System.out.println("Seriously? Why so negative?");
        } else if (number==0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        else {
            String[] names=new String[number];
            Scanner input2 = new Scanner(System.in);
            for (int i = 0; i < number; i++) {
                names[i]=input2.nextLine();
            }
            for (int i = 0; i < number; i++) {
                System.out.println("Hello, " + names[i]);
            }
        }
    }
}
