package com.bridgelabz.count;

import java.util.Scanner;

public class NumberOfCharacter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int count = 0, i= 0;
        System.out.println("Enter the string to count Characters: ");
        String string =scanner.nextLine();
        while (i< string.length()){
            if(string.charAt(i)!= ' '){
                count++;
            }
            i++;
        }
        System.out.println("Total number of character = "+count);
    }

}
