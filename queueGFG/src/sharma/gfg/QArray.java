package sharma.gfg;

public class QArray {
    static int size, cap;
    static int[] arr;
    QArray(int c) {
        size = 0;
        cap = c;
        arr = new int[cap];
    }

    public static void main(String[] args){
        QArray queue = new QArray(5);
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
//        enqueue(50);

        dequeue();
        dequeue();
        System.out.println(getRear());
        System.out.println(getFront());

    }

    public static int size() {
        return size;
    }

    public static void enqueue(int val){
        if (size() < cap) {
            arr[size] = val;
            size++;
        } else {
            System.out.println("queue is full");
        }
    }

    public static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is already empty");
        } else {
            for (int i = 0; i<size-1; i++){
                arr[i] = arr[i+1];
            }
            size--;
        }
    }

    public static int getFront(){
        return arr[0];
    }

    public static int getRear() {
        int res = arr[size];
        return res;
    }

    static boolean isFull(){
        if (cap == size){
            return true;
        } else {
            return false;
        }
    }

    static boolean isEmpty(){
        if (size <= -1){
            return true;
        }
        return false;
    }

}
