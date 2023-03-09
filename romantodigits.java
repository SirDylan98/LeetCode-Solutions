
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class romantodigits {
    public static int RomainChange(String s) {
        int sum = 0;
        HashMap<Character, Integer> rom = new HashMap<>();//Used a Map to create a relation ship
        rom.put('I', 1);
        rom.put('V', 5);
        rom.put('X', 10);
        rom.put('L', 50);
        rom.put('C', 100);
        rom.put('D', 500);
        rom.put('M', 1000);
        char[] romstring = s.toCharArray();
        int[] n = new int[romstring.length];
        for (int i = 0; i < n.length; i++)
            n[i] = rom.get(romstring[i]);

        for (int x:n)
        {
            System.out.println("Array Contents..........."+x);
        }
        System.out.println("Array Contents..........."+ Arrays.toString(n));// 
        for (int i = 0; i < n.length; i++)
            sum = i == romstring.length - 1 || n[i] >= n[i + 1] ? sum + n[i] : sum - n[i];
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roman numeral");
        String roman = sc.nextLine();
        int x = RomainChange(roman);
        System.out.println("The answer "+x);
        sc.close();

    }
}
