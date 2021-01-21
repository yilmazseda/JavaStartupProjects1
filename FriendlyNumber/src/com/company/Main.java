package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

Scanner scanner1=new Scanner(System.in);
Scanner scanner2= new Scanner(System.in);
System.out.println("Enter the first number: ");
int number1 = scanner1.nextInt();
System.out.println("Enter the second number: ");
int number2 = scanner1.nextInt();
int sum1=0;
int sum2=0;

for(int i=1;i<number1;i++)
{
    if(number1%i==0)
    {
        sum1=sum1+i;
    }
}

for(int i=1;i<number2;i++)
{
    if(number2%i==0)
    {
        sum2=sum2+i;
    }
}

if(sum1==number2 && sum2==number1)
{
    System.out.println("This numbers are friendly numbers");
}

else
{
    System.out.println("This numbers aren't friendly numbers");

}













    }
}
