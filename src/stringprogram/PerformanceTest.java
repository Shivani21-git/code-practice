package stringprogram;
import java.lang.*;

public class PerformanceTest {

    public static void concatString() {
        String s = "Hello";
        for (int i = 0; i <= 1000; i++) {

          String sb =  s.concat("Shivani"); // concat method just concatenates the string
          System.out.println(sb);
        }

    }

    public static StringBuffer cocatStingBuffer() {
        StringBuffer Sb = new StringBuffer("Hello");
        for (int i = 0; i <= 1000; i++) {
            Sb.append("Shivani");
        }
        return Sb;
    }

    public static void main(String[] args) {
        Long currenttime = System.currentTimeMillis();
        concatString();
        System.out.println(System.currentTimeMillis() - currenttime);
        Long starttime = System.currentTimeMillis();
        cocatStingBuffer();
        System.out.println(System.currentTimeMillis() - starttime);
    }
}

