public class rotation_of_ll1 {


      Node head;
    class Node {
        int data;
        Node next;
         Node prev;
    Node (int data)
    {
         this.data = data ;
         next = null;
         prev = null;
    }
    }

    public void insert(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newnode;
            newnode.prev = curr;
        }
    }

    

        public void display() {
        if (head == null) {
            System.out.println("It is empty linked list");
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " <-> ");
                curr = curr.next;
            }
            System.out.println("null");
    
        }
    }

    public void rotate(int k){

        Node curr = head;
        
        if (head==null) 
        return ;

        int count = 0;

        while(curr!=null && count<k)
        {
            count++;
            curr = curr.next;
        }

        Node newhead = curr.next;

        newhead.prev = null;
        curr.next = null;

                Node tail = newhead;

        while(tail.next!=null){
            tail = tail.next;
        }

        tail.next = head;
        head.prev = tail;

        head = newhead;
    }

    public  static void main(String args[]){

        rotation_of_ll1 list = new rotation_of_ll1();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.insert(50);
        list.insert(60);
        list.insert(70);


        list.display();
        list.rotate(3);
        list.display();



    }
    
}
