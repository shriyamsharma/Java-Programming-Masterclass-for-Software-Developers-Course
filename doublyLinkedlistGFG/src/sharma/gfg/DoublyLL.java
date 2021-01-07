package sharma.gfg;

public class DoublyLL {

    Node head = null;
    Node tail =null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

//    public void insertBegin(int data){
//        Node temp = new Node(data);
////            temp.next = null;
//            temp.next = head;
//            head.prev = temp;
//            head = temp;
//        }
//    }

    public void display(){
        Node cur = head;
        if (head == null){
            System.out.println("List is empty");
        }
        while (cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }



}
