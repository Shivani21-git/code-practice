package stringprogram;

public class StringBufferInsert {
    public static void main(String[] args)
    {
        StringBuffer Sb= new StringBuffer("Hello");
        Sb.delete(1,3); //hlo
       System.out.println(Sb);
       Sb.insert(1,"Java"); //hjavalo
      System.out.println(Sb);
        Sb.replace(1,3,"Java"); // hjavavalo

       System.out.println(Sb);

    }
}
