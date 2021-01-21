package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

                //******************Which is a prime number**************

        //Not:Tüm sayılar 1'e tam bölündüğü için döngüyü 2.2den başlatıcaz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number= scanner.nextInt();
        System.out.println("The number you entered\n: "+number);
        int control=0;
        if(number<1)
        {
            System.out.println("You entered an invalid number\n!!");
        }

        for(int i =2;i<number;i++)
        {
            if(number%i==0)
            {
                control++;
            }
        }
        if(control!=0)
        {
            System.out.println("The number is not prime!!!");
        }
        else
        {
            System.out.println("The number is prime.");
        }

        System.out.println("*********SECOND SOLUTION************");

        //ASAL SAYI BULMA 2.ÖRNEK
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number2= scanner2.nextInt();
       // int remainder=number2%2;
        boolean isPrime=true;
        if(number2<1)
        {
            System.out.println("You entered an invalid number\n!!");
        }
        if(number2==1)
        {
            System.out.println("1 is not a prime number\n !!!");
            return; //bu blok bunun ile sonlandırılır
        }
        //döngüde sayi2 dahil değil çünkü asal olması için sayının kendisine tam bölünmesi gerekir
        for(int i=2;i<number2;i++)//girilen sayı buradaki herhangi bir sayıya tam bölünüyorsa asal değildir.
        {
            if(number2%i==0)
            {
                isPrime=false;
            }
        }
        if(isPrime==true)
        {
            System.out.println("The number is prime.");
        }
        else
        {
            System.out.println("The number is not prime!!!");
        }

    }
}
