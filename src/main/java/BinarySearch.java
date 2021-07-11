

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int left=0,right=arr.length-1,mid=(left+right)/2;
        while(left<right){
            if(mid == target)
                return mid;
            if(mid<target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
            mid = (left+right)/2;
        }
        return -1;
    }
}
