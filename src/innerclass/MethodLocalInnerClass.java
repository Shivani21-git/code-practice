package innerclass;

public class MethodLocalInnerClass {
    int x=10;
    public void show()
    {
        int y=20;
        System.out.println("In outer");
        class Inner{
            public void show()
            {
                System.out.println("In inner");
                System.out.println(y);
            }

        }
        Inner ob = new Inner();
        ob.show();

    }
    public static void main(String[] args)
    {
        MethodLocalInnerClass obj = new MethodLocalInnerClass();
        obj.show();


    }
}
class TestMain
{
    public static void main(String[] args)
    {
      //  MethodLocalInnerClass obj = new MethodLocalInnerClass();
      // obj.show();

    }
}
