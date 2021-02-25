package innerclass;

public class AnonymousInnerClass {
    public void show()
    {
        System.out.println("In named class");
    }

    public void show1() {
    }
}
class AnotherClass {
    public void design()
    {
        System.out.println("Hello");

    }
    AnonymousInnerClass ob1 = new AnonymousInnerClass() {
        int a = 10;
        public void show()
        {
            System.out.println("Overridden show");
        }
        public void show1()
        {
            System.out.println("In anonymous class");
            System.out.println(a);
        }
        public void more()
        {
            System.out.println("It can have additional methods as well");
        }

    };
    public static void main(String[] args)
    {
        AnotherClass obj = new AnotherClass();
        obj.design();
        AnonymousInnerClass ob = new AnonymousInnerClass();
        ob.show();
     //  ob1.show1();
        obj.ob1.show();
    //   AnotherClass.ob1.show1();



    }

}
