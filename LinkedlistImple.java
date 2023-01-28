public class LinkedlistImple {

    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data=data;
        node.next=null;

        if(head==null){
            head=node;
        }else{
            Node n = head;
            while(n.next!=null){
                n=n.next;
            }
            n.next =node;
        }
    } 
    public void insertAtStart(int data){
        Node node = new Node();
        node.data=data;
        //node.next=null;
        node.next=head;
       // node.next.next=null;
        head=node;


    }
    public void insertAt(int index, int data){
        Node node = new Node();
        node.data=data;
        node.next=null;

        Node n = head;
        for(int i =0;i<index-1;i++)
        {
            n=n.next;
        }
        node.next=n.next;
        n.next=node;
    }
    public void delete(int index){
        Node n=head;
       
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
      
        n.next=n.next.next;


    }
    public void show(){
        Node n=head;
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }

public static void main(String[] args) {

    LinkedlistImple ls= new LinkedlistImple();
    
    ls.insert(5);
    ls.insert(14);
    ls.insert(10);
    ls.insert(7);
    ls.insertAtStart(10);
    ls.insertAt(2, 66);
    ls.delete(2);
   // ls.insertAtStart(10);
   ls.show();
    
}
    
    
}
