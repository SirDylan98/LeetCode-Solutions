import java.util.Arrays;// this class contains static methods to use when using Arrays 

public class TheArrays {
    public static void main(String[] args) {
        String [] names = new String[5];
        String [] surnames = {"Firy","Entelect"};
        names[0]="Delight";
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

    }
}
