import java.util.Scanner;

import static java.lang.String.valueOf;

public class PalindromeInt {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = valueOf(num);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString()))
        {
            System.out.println("Its a palindrome");
        }
        else
        {
            System.out.println("Its not a palindrome");
        }

    }
}
