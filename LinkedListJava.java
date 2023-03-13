import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListJava {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();

        linkedList.add("Dylan is the best");
        linkedList.addFirst("You Going to win this ");
        linkedList.addLast("Dont worry about the background Check");
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.size());
        linkedList.stream().forEach(x->System.out.println(x));
        ListIterator<String> listIterator=linkedList.listIterator();

        while(listIterator.hasNext()){
            System.out.println("List iterator ::"+listIterator.next());
        }

        System.out.println(linkedList);
    }    
}
