import java.util.Scanner;

public class checklettersandnumber {

    public static void countlettersandnumber(String s) {
        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int others = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
             
                letters +=1;
            } else if (Character.isDigit(s.charAt(i))) {
                numbers += 1;
            } else if ( Character.isWhitespace(s.charAt(i))){
                spaces+=1;
            }else{
                others+=1;
            }
        }
        System.out.println("Letters "+letters);
        System.out.println("Numbers "+numbers);
        System.out.println("Spaces "+spaces);
        System.out.println("Others "+others);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println("yes this is a sentence "+sentence);
        countlettersandnumber(sentence);
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

        sc.close();
    }
}
