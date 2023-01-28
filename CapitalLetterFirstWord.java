
public class CapitalLetterFirstWord{
    public static String capitalizeString(String s){
        String []ss = s.split(" ");
        String result="";
        
        for(String s1 :ss){
            result+=s1.substring(0, 1).toUpperCase()+s1.substring(1)+" ";
            System.out.println(s1);
        }
        return result;
    }

    public static void main(String[] args) {
        String sentence="dylan dzvene is the best programmer out there";
        System.out.println(capitalizeString(sentence));
    }


}