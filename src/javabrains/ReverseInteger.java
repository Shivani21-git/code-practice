package javabrains;
// Write a program to reverse an integer  number

public class ReverseInteger {

    public static void main(String[] args) {
        int number = 563451;
       int reverse = reverseInteger(number);
       System.out.println(reverse);
    }

    public static int reverseInteger(int number) {
        long reverse = 0;


        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }

        }
        return (int) reverse;
    }
}
