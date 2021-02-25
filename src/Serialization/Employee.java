package Serialization;

import java.io.*;

public class Employee implements Serializable {
    int id;

    String role;

    String name;
    Employee(int id, String role, String name)
    {
        this.id = id;
        this.name = name;
        this.role = role;
    }
    public static void main(String[] args) throws IOException {
        Employee obj = new Employee(1,"Developer","Shivani");
        try
        {
            FileOutputStream file = new FileOutputStream("filename");
            ObjectOutputStream os = new ObjectOutputStream(file);
            os.writeObject(obj);
            os.close();
            file.close();
            System.out.println("Object serialized");
        }
        catch (IOException e)
        {
            System.out.println("IO Exception thrown");
        }
        try{
            FileInputStream file = new FileInputStream("filename");
            ObjectInputStream is = new ObjectInputStream(file);
            Employee e = (Employee) is.readObject();
            System.out.println("Object has been deserialized");
            System.out.println(e.id);
            System.out.println(e.name);
            System.out.println(e.role);

        }
        catch (IOException e)
        {
            System.out.println("IOException caught");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("ClassNotFoundExceptionCaught");
        }


    }
}

class EmployeeCopy {
    public static void main(String[] args)
    {



    }

}