package stringprogram;

//Program to print hashcode of String and StringBuffer
public class PrintHashcode {
    public static void main(String[] args)
    {
        String s = "hi";
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(s.hashCode());
        System.out.println(sb.hashCode());
        System.out.println(sb);
    }
}
