import java.util.Arrays;

public class containsDuplicate {

    public static boolean doescontainsDuplicate(int[] arr)
    {
        // true if it contians duplicates
        for(int i=0; i<arr.length;i++){
            System.out.println(i);
            
            if(Arrays.binarySearch(arr, i+1,arr.length,arr[i])>=0){
               System.out.println(arr[i]+" THE INDEX "+Arrays.binarySearch(arr, i,arr.length,arr[i]));
             
                return true;
                
            }
            else if (arr[i]==arr[arr.length-1]&&i!=arr.length-1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr={170,-368,148,672,397,-629,-788,192,170,309,-615,-237};

        System.out.println(doescontainsDuplicate(arr));
    }
}
