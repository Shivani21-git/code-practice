package TerraPayInterviewQues;

// In between 1 to 100 , count how many times 1 occurred
public class FindNoOf1 {
    public static void main(String[] args)
    {
        int n=10;
       int count = countOnes(n);
       System.out.println(count);

    }

    public static int countOnes(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
         count +=  countLogic(i);
        }
        return count;

    }
    public static int countLogic(int i)
    {
        int count =0;
        while(i>0)
        {
            if(i%10==1)
                count++;
            i=i/10;
        }
        return count;
    }
}
