package javabrains;

/* Print numbers from 1 to n, each in a new line , if the number is divisible of 3, print "Fizz". If the number is divisible of 5, print "Buzz",
if the number is divisible by both 3 and 5, print FizzBuzz */

public class Ch01FizzBuzz {
    public static void main(String[] args)
    {
         int n = 15;
         printFizzBuzz(n);
    }

    public static void printFizzBuzz(int n)
    {
        for(int i=1 ; i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");

            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
