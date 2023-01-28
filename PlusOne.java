public class PlusOne {

    public static void plusOne(int arr []){
        String strnum="";
        Long num=0l;// declaring a long primitive
        for (int i : arr) {
            System.out.print(i+" ");
            strnum+=Integer.toString(i);//changing string to integer
        }
        try{
            num=Long.parseLong(strnum)+1;
        }catch(Exception e){
            System.out.println(e.getMessage());// to print the message
        }
        
        int[] arr_out = new int[Long.toString(num).length()];

        for(int a=arr_out.length-1;a>=0;a--){
            System.out.println(a);
            arr_out[a]= (int) (num%10);// type casting here
            num=num/10;
        }
        for (int x : arr_out) {
            System.out.print(x);
        }
       // System.out.println(num);
    }
    
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1,0};
        plusOne(arr);

    }
}
