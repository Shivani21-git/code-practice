package javabrains;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args)
    {
        int[] arr = {2,3,7,4,8};
        int sum = 7;
        int[] result = findNumbers(arr,sum);
        for(int i : result)
        {
            System.out.println(i);
        }


    }
    public static int[] findNumbers(int[] arr, int sum)
    {
        HashMap map = new HashMap();
        for(int i=0;i<arr.length;i++)
        {
            int target = sum-arr[i];
            if(map.containsKey(target))
            {
              return new int[] {arr[i],target};
            }
            map.put(arr[i],i);
        }
       return new int[] {-1,-1};
    }
}
