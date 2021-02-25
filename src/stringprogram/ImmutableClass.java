package stringprogram;

public final class ImmutableClass {
    final int id;
    final int rollno;
    final String name;
    ImmutableClass(int id, int rollno,String name)
    {
        this.id=id;
        this.rollno=rollno;
        this.name=name;
    }
    public static void main(String[] args)
    {
        ImmutableClass obj1 = new ImmutableClass(2,3,"Hello");
      //  obj1.id=3; cannot assign value to a final variable. If this field have been private, then it would be modifiable in the same class, if not outside this class.
    }
}
class Employee
{
    ImmutableClass obj= new ImmutableClass(1,2,"Hi");

}
