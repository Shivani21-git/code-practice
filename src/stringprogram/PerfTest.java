package stringprogram;

public class PerfTest {
    public static void BufferString()
    {
        for(int i=1; i<1000;i++)
        {
            StringBuffer sb = new StringBuffer("Hi");
         //   System.out.println(sb);
        }
    }
    public static void BuilderString()
    {
        for(int i=1; i<1000;i++)
        {
            StringBuilder sbb = new StringBuilder("Hello");
           // System.out.println(sbb);
        }
    }
    public static void main(String[] args)
    {
        Long start = System.currentTimeMillis();
        BufferString();
        Long end = System.currentTimeMillis();
        System.out.println("Time taken for String buffer :"+ (end-start));
        Long start1 = System.currentTimeMillis();
        BuilderString();
        Long end1 = System.currentTimeMillis();
        System.out.println("Time taken for String builder :"+(end1-start1));

    }
}
