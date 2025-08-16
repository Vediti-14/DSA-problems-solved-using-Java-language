

public class Node {

    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }

}

 public class LinkedList{
    Node head;
    Node tail;

    public void addFirst(int data){
        
        //create new node
        Node newNode = new Node(data);

        //edge condition 
        if(head == null){
            head = tail = newNode;
            return;
        }

        //newnode next make head
        newNode.next = head;
        // make newnode head
        head = newNode;
    }

 }


    public static void main(String args[]){

        




    }
    

