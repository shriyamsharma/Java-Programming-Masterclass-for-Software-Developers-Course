package sharma.hackerrank;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node tempNode = head;
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }

    }

    public void show(){
        Node showNode = head;

        while (showNode.next != null){
            System.out.println(showNode.data);
            showNode = showNode.next;
        }
        System.out.println(showNode.data);

    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;

        head = node;

    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0){
            insertAtStart(data);
        } else {

            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void delTail(){
        if(head == null){
            System.out.println("null");
        }
        if (head.next == null)
            System.out.println("null");
        Node cur = head;
        while (cur.next.next != null){
            cur = cur.next;
        }
        cur.next = null;
    }

    public void deleteAt(int index){

        if (index == 0){
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
//            System.out.println("n1 = " + n1.data);
            n1 = null;
        }
    }

}
