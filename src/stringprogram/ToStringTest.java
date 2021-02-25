package stringprogram;

public class ToStringTest {
    String firstname;
    String lastname;

    ToStringTest(String f, String l)
    {
        this.firstname=f;
        this.lastname=l;
    }

    @Override
    public String toString() {
        return "ToStringTest{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
               '}';
      //  return ("firstname "+firstname+" Secondname "+lastname);
    }

    public static void main(String[] args)
    {
        ToStringTest obj = new ToStringTest("Shivani", "Kashyap");
        System.out.println(obj);
        String s = "2";
        Integer i = Integer.parseInt(s);
        System.out.println(i);
        String s2 = "Hi";
        // Integer i2 = Integer.parseInt(s2); this will give exception : Invalid NumberFormatException
    }
}
