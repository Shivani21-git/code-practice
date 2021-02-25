public class JustTest {
    //public static void main(String[] args)
    {
       int x=3, y=5, z=10;
       System.out.println(++z + y - y + z + x++);
       // 11+5-5+10+3 = 24 + 1 = 25
    }
}
class Alpha
{
    public String type = "a ";
    public Alpha() {  System.out.print("alpha "); }
}

 class Beta extends Alpha
{
    public Beta()  {  System.out.print("beta ");
       }


    void go()
    {
        type = "b ";
        System.out.print(this.type + super.type);
    }

    public static void main(String[] args)
    {
        new Beta().go();
        // this and super cannot be used in static context
    }
}
