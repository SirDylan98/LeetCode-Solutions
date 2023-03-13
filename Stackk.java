import java.util.*;;
public class Stackk {
    public static void main(String[] args) {
        Stack<String> sk= new Stack<>();
        Queue <String> que = new PriorityQueue<>();

        que.add("Dylan will be working at entelect soon");
        que.add("You will win");
        System.out.println(que.size());
        sk.push("Dylan");
        sk.push("Sir");
        sk.push("Pumba");
        sk.push("Dzvene");
        sk.pop();
        
        System.out.println(sk.peek());
    }
}
