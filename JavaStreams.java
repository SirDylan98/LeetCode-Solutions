import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class JavaStreams{

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,6,4,9,4,6,5);

        ArrayList <String> arr = new ArrayList<>(Arrays.asList("Dylan","Dzvene","Pumba"));

        ArrayList <String> arr1 = (ArrayList<String>) arr.stream().filter(x->x.equals("Dylan")).collect(Collectors.toList());
        System.out.println("Filter array is "+arr1);


        List<Integer> mySet=  numbers.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(mySet);
    }
}