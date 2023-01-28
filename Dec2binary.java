import java.util.*;
public class Dec2binary {

    public static void main(String[] args) {
        int number = 100;
        int temp = 0;
        int divisor = 2;
        
      
        ArrayList<Integer> binary= new ArrayList<Integer>();// arraylist implementation
        //int[] binary = new int[10];
        try {
            while (number > 0) {
                temp = number % divisor;
                number = number / divisor;
                binary.add(temp);// use the add method to  add and element to an array
                System.out.println("binary " + temp);
                System.out.println("binary " + binary);
                System.out.println("Number decreasing by " + number);
            }
        } catch (Exception e) {

            System.out.println("There was and error");
        }finally
        {
            for(Integer x=binary.size()-1;x>=0;x--)
            {
                System.out.print(binary.get(x));// use the get method to get the element of an array
            }
        }

        // System.out.println("Time to leetcode");

    }
}