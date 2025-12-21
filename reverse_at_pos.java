
public class reverse_at_pos {


     Node head;
     Node head1;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
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

    public void reverse_at_pos_list(int pos)
    {
        if(head == null && pos ==0)
        {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        int size = 0;
        while(curr!=null)
        {
            curr = curr.next;
            size ++;
        }

        curr = head;


        for(int i=0;i<pos &&curr != null;i++)
        {
            curr = curr.next;
        }

            if (curr == null) return; // nothing to reverse


        Node prev = null;
        Node next = null;

        Node second_half_head = curr;
        Node first_half_tail = second_half_head.prev;

        while(curr != null)
        {
        
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr  = curr.prev;
        }

        Node new_second_half_head = prev;

        if(first_half_tail!=null)
        {
            first_half_tail.next = new_second_half_head;
        }

        if(new_second_half_head!=null)
        {
            new_second_half_head.prev = first_half_tail;

        }

    }

    public void first_half_reverse(int pos){

        Node curr = head;
        Node next = null;
        Node prev = null;

        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }


        

        int count = 0;
        while(curr!=null && count<pos)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr  = curr.prev;

            count++;
        }

       Node  second_half_head = curr;
       Node first_half_head = head; 


        if(first_half_head!=null)
        {
             first_half_head.next = second_half_head;
        }

        if(second_half_head!=null)
        {
            second_half_head.prev = first_half_head;
        }


        head = prev;


    }


    public void insert1(int data) {
        Node newnode = new Node(data);

        if (head1 == null) {
            head1 = newnode;
        } else {
            Node curr = head1;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newnode;
            newnode.prev = curr;
        }
    }

     public void display1() {
        if (head1 == null) {
            System.out.println("It is empty linked list");
        } else {
            Node curr = head1;
            while (curr != null) {
                System.out.print(curr.data + " <-> ");
                curr = curr.next;
            }
            System.out.println("null");
    
        }
    }

    public boolean check_palindrone(Node head){

        if(head == null){
            System.out.println("List is empty ");
            return false;
        }

        Node curr = head;

        int length = 0;
        while(curr!=null)
        {
            curr = curr.next;
            length ++;
        }

             curr = head;  // update the head value 

        for(int i=0;i<length/2;i++)
        {
            curr = curr.next;
        }

        Node next = null;
        Node prev = null;


        Node   second_half_head = curr;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = curr.prev;

        }

        Node first_half_tail = second_half_head.prev ;
        Node new_second_half_head = prev;


       if(first_half_tail!=null)
       {
        first_half_tail.next = new_second_half_head;
       }

       if(new_second_half_head!=null)

       {
            new_second_half_head.prev = first_half_tail;
       }

       curr = head;
       boolean check = true;
       for(int i=0;i<length/2;i++){

        if(curr.data != new_second_half_head.data)
        {
           check = false;
        }
        curr = curr.next;
        new_second_half_head = new_second_half_head.next;
       }

    curr = new_second_half_head;
    prev = null;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
    }
       return check;
    }

    
    public static void main(String args[])
    {

        reverse_at_pos list = new  reverse_at_pos();
        reverse_at_pos list1 = new  reverse_at_pos();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        
        list.insert(70);
        list.insert(80);


        list.display();


        list.reverse_at_pos_list(4);

        list.display();

        list.first_half_reverse(4);

        list.display();

        list1.insert1(10);
        list1.insert1(20);
        list1.insert1(30);
        list1.insert1(40);
        list1.insert1(50);
        list1.insert1(40);
        list1.insert1(30);
        list1.insert1(20);
        list1.insert1(10);

        list1.display1();

       boolean check =  list1.check_palindrone(list1.head1);

       if(check)
       {
        System.out.println("It is pallindrone");
       }
       else
       {
        System.out.println("It is not a palindrone");
       }

System.out.println();
System.out.println();

list.display();
list1.display1();

    }
    
}
