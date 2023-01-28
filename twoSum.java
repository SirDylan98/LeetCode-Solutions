import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        ArrayList<Integer> mysum = new ArrayList<Integer>(Arrays.asList(1, 6, 9, 4, 7, 14));
        Collections.sort(mysum);
        int target = 16;
        int sum, indexTemp;
        ArrayList<Integer> myindex = new ArrayList<>();
        for (Integer x : mysum) {
            for (int i = mysum.indexOf(x) + 1; i < mysum.size(); i++) {

                sum = x + mysum.get(i);
                System.out.println("The sum is " + sum);

                if (sum == target) {
                    indexTemp = mysum.indexOf(x);
                    myindex.add(indexTemp);
                    myindex.add(i);
                    System.out.println("The indexes are " + myindex);
                } else {
                    continue;
                }

            }

        }
        System.out.println(mysum);
    }
}
