package com.codeup;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Enter something: ");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        
        String ans = input.nextLine();

        System.out.println("You entered: " + ans);
        System.out.println("Is it a number?: " + StringUtils.isNumeric(ans));
        System.out.println("Flipped Case: " + StringUtils.swapCase(ans));
        System.out.println("Reversed: " + StringUtils.reverse(ans));

        
    }
}
