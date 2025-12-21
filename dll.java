// package DSA;

public class dll {

    Node head;

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


    public void delete(int pos){


        if(head == null)
        {
            System.out.println("It is empty list");
            return;
        }

        Node curr = head;

        if(pos == 0){

            head = curr.next;

            if(head!=null){

             head.prev = null;

            }
            return;
        }

        for(int i = 0;i<pos && curr!=null ; i++)
        {
            curr = curr.next;
        }

        if(curr == null)
        {
            System.out.println(" current value is empty");
            return;
        }

        if(curr.next!=null){
            curr.next.prev = curr.prev;
        }

        if(curr.prev!=null)
        {
            curr.prev.next = curr.next;
        }

    }

    public void insert_at_pos(int data , int pos){

        Node newnode = new Node(data);
        Node curr = head;

        if(pos == 0)
        {
            newnode.next = head;
            head.prev = newnode;
             head = newnode;
             return;
        }

        for(int i=0;i<pos-1 && curr != null ;i++)
        {
            curr = curr.next;
        }

        
    if(curr == null){
        System.out.println("Position out of bounds");
        return;
    }

        newnode.next = curr.next;

        if(curr.next!=null){
                    curr.next.prev = newnode;
        }
        newnode.prev = curr;
        curr.next = newnode;
    }

    public void revers_of_dll(){

        Node curr = head;
        Node temp = null;

        while(curr!=null)
        {
           temp = curr.prev;
           curr.prev = curr.next;
           curr.next = temp;

           curr = curr.prev;
        }

        if(temp!=null)
        {
            head = temp.prev;
        }
    }

    public void half_reverse()
    {
            if (head == null) return;   // ✅ Fix 1: Handle empty list

        Node curr = head;
        int size =  0;

        while(curr != null){
            size++;
            curr = curr.next;
        }

        curr = head;

        for(int i=0;i<size/2;i++)
        {
            curr = curr.next;
        }
        
        Node second_half_head = curr;
        Node first_half_tail = curr.prev;


        Node prev = null;
        Node next = null;

        while(curr!=null){

            next = curr.next;

            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;

        }

       // if(temp!=null){

        //Node new_second_half_head = temp.prev;

       // Node first_half_tail = second_half_head.prev;

       // if(new_second_half_head!=null)
        //{
         //   new_second_half_head.prev = first_half_tail;
       // }
        //if (first_half_tail != null) {

          //  first_half_tail.next = new_second_half_head;
        //}

//    }

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
    

        public static void main(String args[])
        {

            dll list = new dll();

            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);
            list.insert(50);
            list.insert(60);
            list.insert(70);
            list.insert(80);


            list.display();

            list.delete(2);

            list.display();

            list.insert_at_pos(100,7);
     
     
     
            list.display();

            list.revers_of_dll();

            list.display();

            list.half_reverse();

            list.display();



        }
    


}
