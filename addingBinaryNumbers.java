import java.util.ArrayList;

public class addingBinaryNumbers {

    public static String addition(int a, int b) {

        String answer = "";
        int carry = 0;

        ArrayList<Integer> aaa = new ArrayList<>();
        ArrayList<Integer> bbb = new ArrayList<>();
        ArrayList<Integer> resultfinal = new ArrayList<>();
        while (a > 0) {
            aaa.add(a % 10);
            a = a / 10;
            bbb.add(b % 10);
            b = b / 10;

            System.out.println(aaa);
            System.out.println(bbb);

        }
        for (int i = 0; i < aaa.size(); i++) {
            if (aaa.get(i) + bbb.get(i) + carry == 1) {

                resultfinal.add(1);
                carry = 0;
            } else if (aaa.get(i) + bbb.get(i) + carry == 2) {

                resultfinal.add(0);
                carry = 1;

            } else if (aaa.get(i) + bbb.get(i) + carry == 0) {

                resultfinal.add(0);
                carry = 0;

            } else if (aaa.get(i) + bbb.get(i) + carry == 3) {

                if (i == aaa.size() - 1) {

                    resultfinal.add(11);
                    carry = 0;
                } else {

                    resultfinal.add(1);
                    carry = 1;
                }

            }

        }
        System.out.println("the result is " + resultfinal);
        for (int i = aaa.size() - 1; i >= 0; i--) {
            System.out.println("Yes we must print twice  " + i);
            answer += String.valueOf(resultfinal.get(i));

        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 10101;
        int b = 11100;
        System.out.println("Addition of 2 binary numbers");
        System.out.println("The first Number is " + a);
        System.out.println("The Second Number is " + b);
        System.out.println("the answer is " + addition(a, b));
    }
}
