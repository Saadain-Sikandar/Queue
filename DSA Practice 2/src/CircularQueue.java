public class CircularQueue {

    Restaurant head;
    Restaurant tail;

    Restaurant queue[];
    int size;

    public CircularQueue( int capacity) {

        queue = new Restaurant[capacity];
        size = 0;


    }

    boolean IsFull(){

        return size == queue.length-1;

    }


   public void Addorder(int orderId, String dish ,int tableNo){

        Restaurant newNode = new Restaurant(orderId,dish,tableNo);

        if(size == 0 ){

            head = newNode;
            tail = newNode;
            head.prev = tail;
            tail.next = head;
            size++;
            System.out.println("Order Added!");
        }

        else if (!IsFull()){

            tail.next = newNode;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
            size++;
            System.out.println("Order Added!");
        }
        else {

            System.out.println("Queue is Full!");
        }

   }


   public void NextOrder(){

        if(head == null){

            System.out.println("\nNo Pending orders");
        }

        else {

            System.out.println("\nNext order in queue:"+"\nOrder ID:"+head.orderId+",Dish:"+head.dish+",Table No:"+head.tableNo);
        }

        head = head.next;
        tail.next = head;
        head.prev = tail;
        size--;
   }


    public void DisplayAllorders(){

        if(head == null){

            System.out.println("\nNo Pending orders!");
        }

        System.out.println("\n PENDING ORDERS");

        Restaurant current = head;

        do {
            System.out.println("\nDish:" + current.dish + ", Order ID:" + current.orderId + ", TableNo:" + current.tableNo);
            current = current.next;
        } while (current != head);

    }


}
