package Serialization;

import java.io.*;

public class EmployeeExter implements Externalizable {
    int id;
    String name;
    String role;
   public EmployeeExter()
    {
        System.out.println("No arg constructor called");
    }
    EmployeeExter(int id, String name, String role)
    {
        System.out.println("Arg constructor called");
        this.id = id;
        this.name = name;
        this.role = role;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Inside writeExternal");
        out.writeInt(id);
        out.writeObject(name);
       out.writeObject(role);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Inside readExternal");
         id = in.readInt();
        name = (String) in.readObject();
     role = (String) in.readObject();
    }

    public static void main(String[] args)
    {
        EmployeeExter obj = new EmployeeExter(1,"shivani","Developer");
        try{
            FileOutputStream file = new FileOutputStream("xyz");
            ObjectOutputStream os = new ObjectOutputStream(file);
            os.writeObject(obj);
            os.close();
            file.close();
        }
        catch (IOException e)
        {
            System.out.println("IOException handled");
        }
        try{
            FileInputStream file = new FileInputStream("xyz");
            ObjectInputStream is = new ObjectInputStream(file);
           EmployeeExter e = (EmployeeExter) is.readObject();
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
            System.out.println("ClassNotFoundException caught");
        }


    }
}
