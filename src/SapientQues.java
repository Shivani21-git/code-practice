import java.util.HashMap;

public class SapientQues {

    int id;
    String name;

    SapientQues(int id, String name)
    {
        this.id=id;
        this.name = name;
    }

    public static void main(String[] args)
    {
        HashMap<SapientQues,SapientQues> map = new HashMap<>();
        SapientQues obj = new SapientQues(1,"Shivani");
        map.put(obj,obj);
        System.out.println(map);

    }

    @Override
    public int hashCode() {
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
