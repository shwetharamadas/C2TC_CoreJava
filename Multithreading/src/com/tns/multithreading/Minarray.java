package com.tns.multithreading;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Minarray{
 
    public static void main(String[] args)
    {
 
        // Creates an array of integer numbers in it.
        System.out.println("Enter Up To 10 Element");
        Scanner sc=new Scanner(System.in);
        Integer[] numbers =new Integer[10];
 
        // Reading array elements dynamically using scanner class
 
        for (int i=0;i<numbers.length;i++)
        {
            System.out.print("enter elements in the array["+i+"]:");
            numbers[i]=sc.nextInt();
        }
 
 
        int min = (int) Collections.min(Arrays.asList(numbers));
 

 
        System.out.println("Min number: " + min);
     
    }
}