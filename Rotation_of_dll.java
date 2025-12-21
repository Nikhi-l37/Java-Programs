public class Rotation_of_dll {

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

    public void reverse(){


        Node curr = head;
        int count = 0;
        Node next = null;
        Node prev = null;

        Node first_head = head;

        while(curr!=null){

            next = curr.next;  // next node address
            curr.prev = next;  
            curr.next = prev;
            prev = curr;        // saving curr node
            curr = curr.prev;  // traverse to next node 
            count++;
        }

        head = prev;
    }

    public void rotate_first_half(int pos){

        Node  curr = head;

        int size = 0;
        while(curr!=null)
        {
            size++;
            curr = curr.next;
        }
        
         curr = head;
        int count = 0;
        Node next = null;
        Node prev = null;

        Node first_head = head;

        while(curr!=null && count<pos){

            next = curr.next;  // next node address
            curr.prev = next;  
            curr.next = prev;
            prev = curr;        // saving curr node
            curr = curr.prev;  // traverse to next node 
            count++;

        }

        Node second_head = curr;
        Node new_head = curr;
        new_head.prev = null;

        if(second_head!=null){
        second_head.prev = first_head;           
        }

        if(first_head!=null){
        first_head.next = second_head;
        }
        
        head = prev;

    }

    public void rotate_second_half(int size,int pos)
    {
        int s = size-pos;
        Node curr = head;
         
        for(int i=0;i<s;i++)
        {
        curr = curr.next;
        }
       

        Node first_half_tail = curr.prev;
        Node second_half_head = curr;

        Node prev = null;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.prev = next;
            curr.next = prev;

            prev = curr;
            curr = curr.prev;
        }

        Node new_second_head = prev;




        if(first_half_tail!=null)
        {
            first_half_tail.next = new_second_head;
        }


        if(new_second_head!=null){

            new_second_head.prev = first_half_tail;
        }


        second_half_head.prev = null;
    

    }



    public static void main(String args[]){


        Rotation_of_dll list= new Rotation_of_dll();

        Node curr = list.head;
        int size = 7;
        int pos = 3;
        while(curr!=null)
        {
            size++;
            curr = curr.next;
        }

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);

        list.display();

        list.reverse();


        list.display();

        list.rotate_first_half(size-pos);

        list.display();

        list.rotate_second_half(size,pos);

        list.display();




    }
    
}
