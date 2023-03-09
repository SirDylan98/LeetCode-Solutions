public class StackImple {
   private int[] stack=new int[5];
     private int top=0;
    public void push(int v) {
        if(top!=stack.length){
            stack[top++]=v;

        }else{
            System.out.println("The stack is full");}
    }
    public void pop(){
        System.out.println("The deleted value is "+stack[top-1]);
        top--;}
    public int peek(int index){
        int value=0;
        if(index>top){
         System.out.println("the index is out of range");
         }else{
            return stack[index];}

        return value ;
    }
    public void show(){
        for(int i = top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        StackImple stack= new StackImple();
        stack.push(10);
 
        stack.push(2);
        stack.pop();
        System.out.println("The value at index 0 is "+ stack.peek(2));

        stack.show();
        
    }
}
