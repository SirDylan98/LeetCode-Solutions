public class Addbinary {

    public static String addition(String a, String b){
        int sumbit,carrybit=0;
        String finalanswer="";
        String  answer="";

        String newStr="";
        boolean isAbigger=true;
        if(a.length()==b.length()){
           // newStr=b;

        }else{
            isAbigger=a.length()>b.length()?true:false;
        }

        if(isAbigger){
            for(int i=0;i<a.length()-b.length();i++){
                System.out.println("Emoji Emoji ");
                newStr+="0";
            }
            newStr+=b;
        }else if(isAbigger==false){
            for(int i=0;i<b.length()-a.length();i++){
                newStr+="0";
                System.out.println("fire fire fire ");

            }
            newStr+=a;
        }
        System.out.println("the value of A is "+a);
        //System.out.println("the value of B is "+b);
        System.out.println("the value of B "+b);
        System.out.println("the value of new string is  "+newStr);
        if(a.length()==b.length()){
            for(int x = newStr.length()-1;x>=0;x--){
                    
                sumbit=Character.getNumericValue(a.charAt(x)) +Character.getNumericValue(b.charAt(x)) +carrybit;
                System.out.print(carrybit);
                if(x==0 && sumbit==3){
                    answer+="11";
                    
                }else if(x==0 && sumbit==2) {
                    answer+="01";
                }
                else{
                    if(sumbit==0){
                        answer+="0";
                        carrybit=0;
                        

                    }else if( sumbit==1){
                        answer+="1";
                        carrybit=0;
                    }
                    else if ( sumbit==2){
                        answer+="0";
                        carrybit=1;

                    }else if (sumbit==3){
                        answer+="1";
                        carrybit=1;
                    }
                }
               
                System.out.println("The carry bit is "+carrybit);
                
            }
            

        }else{
            if(isAbigger){
                for(int x = newStr.length()-1;x>=0;x--){
                    
                    System.out.println(newStr.charAt(x));
                    sumbit=Character.getNumericValue(a.charAt(x)) +Character.getNumericValue(newStr.charAt(x)) +carrybit;
                    System.out.print(carrybit);
                    if(x==0 && sumbit==3){
                        answer+="11";
                        
                    }else if(x==0 && sumbit==2) {
                        answer+="01";
                    }
                    else{
                        if(sumbit==0){
                            answer+="0";
                            carrybit=0;
                            
    
                        }else if( sumbit==1){
                            answer+="1";
                            carrybit=0;
                        }
                        else if ( sumbit==2){
                            answer+="0";
                            carrybit=1;
    
                        }else if (sumbit==3){
                            answer+="1";
                            carrybit=1;
                        }
                    }
                   
                    System.out.println("The carry bit is "+carrybit);
                    
                }
            }else{
                for(int x = newStr.length()-1;x>=0;x--){
                    
                    System.out.println(newStr.charAt(x));
                    sumbit=Character.getNumericValue(b.charAt(x)) +Character.getNumericValue(newStr.charAt(x)) +carrybit;
                    System.out.print(carrybit);
                    if(x==0 && sumbit==3){
                        answer+="11";
                        
                    }else if(x==0 && sumbit==2) {
                        answer+="01";
                    }
                    else{
                        if(sumbit==0){
                            answer+="0";
                            carrybit=0;
                            
    
                        }else if( sumbit==1){
                            answer+="1";
                            carrybit=0;
                        }
                        else if ( sumbit==2){
                            answer+="0";
                            carrybit=1;
    
                        }else if (sumbit==3){
                            answer+="1";
                            carrybit=1;
                        }
                    }
                   
                    System.out.println("The carry bit is "+carrybit);
                    
                }
            }
           
        }
        for(int s = answer.length()-1;s>=0;s--){
            finalanswer+=answer.charAt(s);
        }



        return finalanswer;
    }
    
    public static void main(String[] args) {
        System.out.println("The answer is "+ addition("11", "01"));
        
    }
}
