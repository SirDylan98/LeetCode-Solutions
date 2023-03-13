import java.util.Arrays;// this class contains static methods to use when using Arrays 
import java.util.*;

public class TheArrays {
    public static void main(String[] args) {
        String [] names = new String[5];
        String [] surnames = new String[10];
        names[0]="Zelight";
        names[1]="Dylan";
        names[3]="Edmund";
        names[2]="Dylan";
        names[4]="Dylan";
        System.out.println(Arrays.toString(surnames));
        surnames=Arrays.copyOf(names, 8);
        System.out.println("This is my copied array"+Arrays.toString(surnames));
        int a =Arrays.binarySearch(names, "Edmund");// binary search 
        System.out.println(Arrays.toString(names));
        System.out.println("the value of A is "+a);
        List <Integer> lst= new ArrayList<>( Arrays.asList(1,2,3));
        for (int i =0 ; i<=surnames.length-1;i++){
            System.out.println(surnames[i]);
        }
        for (String x:surnames){
            System.out.println("Hey"+x);

        }
       Arrays.sort(names);
       System.out.println("the sorted Array is "+ Arrays.toString(names));
       Arrays.stream(surnames).map(x->x+"dd").forEach(y->System.out.println(y));
       int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
