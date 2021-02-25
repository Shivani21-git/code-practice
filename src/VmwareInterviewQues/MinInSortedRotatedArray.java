package VmwareInterviewQues;

/* suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
(i.e [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
Find the minimum element.
You may assume no duplicate exists in the array.
 */
public class MinInSortedRotatedArray {
    public static void main(String[] args)
    {
        int[] arr = {4,5,6,7,1,2};
        int min = findMin(0,arr.length-1,arr);
        System.out.println(min);
    }

    private static int findMin(int startindex, int endindex, int[] arr) {
        int mid = startindex+(endindex-startindex)/2;

        if(startindex>endindex)
        {
            return arr[0];
        }
        if(endindex==startindex)
        {
            return arr[startindex];
        }

        if(mid>startindex && arr[mid]<arr[mid-1])
        {
           return arr[mid];
        }
        else if(mid<endindex && arr[mid+1]<arr[mid])
        {
          return arr[mid+1];
        }
        else if(arr[mid]<arr[endindex])
        {
           return findMin(startindex,mid-1,arr);
        }
        else
        {
           return findMin(mid+1,endindex,arr);
        }

    }
}
