package innerclass;

public class NestedInnerClass {
    public void show()
    {
        System.out.println("In outer class");
    }
    private class InnerClass
    {
        public void show()
        {
            System.out.println("In inner class");
        }

    }
    public static void main(String[] args)
    {
        NestedInnerClass obj = new NestedInnerClass();
        obj.show();
        NestedInnerClass.InnerClass ob = new NestedInnerClass().new InnerClass();
        ob.show();
    }
}
class MainClass
{
    public static void main(String[] args)
    {
      //  NestedInnerClass obj = new NestedInnerClass();
     //   obj.show();
      //  NestedInnerClass.InnerClass ob = new NestedInnerClass().new InnerClass();
      //  ob.show();
    }
}