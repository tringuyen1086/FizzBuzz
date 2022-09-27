package edu.smu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your desired number n = ");
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= num; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz, ");
            } else if (i % 3 == 0){
                System.out.print("Fizz, ");
            } else if (i % 5 == 0){
                System.out.print("Buzz, ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }

}
