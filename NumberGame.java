/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number.game;

import java.util.Scanner;

/**
 *
 * @author india
 */
public class NumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        int no = (int) (Math.random() * (max - min + 1) + min);
       // System.out.println(no);
        Scanner sc = new Scanner(System.in);
        System.out.println("You have 3 rounds to play this game ,again and again");
        System.out.println("In each round You have only 3 attempts to won tha game");
        for (int i = 0; i < 3; i++) {
            System.out.println("Round :" + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter Number Between 1 and 100");
                int num = sc.nextInt();
                if (num > no) {
                    System.out.println("number is gretaer...enter small no");
                } else if (num < no) {
                    System.out.println("number is smaller...enter greater no");
                }
                if (num == no) {
                    System.out.println("You found the number...");
                    System.exit(0);
                }
            }
     
        }
          System.out.println("oops!you failed....Try again");

    }

}
