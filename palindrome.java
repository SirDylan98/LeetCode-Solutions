public class palindrome {

    public static boolean checker(int x) {
        String xString1=""; 
        xString1=String.valueOf(x);// changing integer to string
        String rev="";
        boolean result;
        System.out.println("this is xString "+xString1);
        for(int i=xString1.length();i>0;i--)
        {
            rev=rev+xString1.charAt(i-1);
            
        }
        System.out.println("this is First  "+rev);
        System.out.println("this is Second  "+xString1);
        result=(rev.equals(xString1))?true:false; // tenary operator
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Yes its working");
        //boolean xx= checker(10560);
        System.out.println(checker(232));
    }

}