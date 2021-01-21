package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Perfect Number : A number that is equal to the sum of its positive divisors, excluding itself.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number= scanner.nextInt();
        System.out.println("The number your enter: "+number);
        int sum=0;

         for(int i =1;i<number;i++)
         {
             if(number%i==0)
             {
                 sum=sum+i;
             }
         }
         if(sum==number)
         {
             System.out.println("Perfect Number");
         }
         else
         {
             System.out.println("Not the Perfect Number!!!!!!");
         }



    }
}
