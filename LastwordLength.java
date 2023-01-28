

public class LastwordLength {
    public static int calclength(String s){
        int end=-1;
        int start=-1;
        //end=start=-1;
        if(s.length()==1)return 1;
        for(int i=s.length();i>0;i--){
           
            System.out.println(s.substring(i-1, i)+i);
            if(!(s.substring(i-1, i)).equals(" ")){
                if(end==-1){
                    //set end to i
                    
                    end=i;
                   continue;
                    
                }
                

            }else{
                if(i==1&&end==-1){
                  
                    return 0;
                }else if (i==1){
                    start=1;
                    break;
                }else if(end!=-1){
                    start=i;
                    break;
                }
            }
        }
        System.out.println("start is "+start);
        System.out.println("end is "+end);
        System.out.println();
        if(start==-1)start=0;
        

        return s.substring(start, end).length();
    }
    
    public static void main(String[] args) {
        String s=" dfdfd   ";

        System.out.println("the lenght of the last word is "+calclength(s)
        );


    }
}
