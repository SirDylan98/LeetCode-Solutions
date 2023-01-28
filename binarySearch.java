public class binarySearch {
    public static int binarysearch(int[] arr, int target){
        // get the high and low index 
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            // calculate the mid value
            int midindex= low +(high-low)/2;
            int midvalue= arr[midindex];

            if(midvalue>target){
                // adjust to focus on the lower part of the array
                high=midindex-1;
            }else if(midvalue<target){
                // adjust to focus on the upper part of the array
                low=midindex+1;
            }else{
                // if midvalue == target
                return midindex;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr =new int[100];

        for(int i=0;i<=arr.length-1;i++) arr[i]=i;
        int index= binarysearch(arr, 33);
        if(index==-1){
            System.out.println("the Target is not in the array");
        } else{
            System.out.println("the target was found at index :"+index);
        }
        

        
    }
}
