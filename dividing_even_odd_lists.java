public class dividing_even_odd_lists {

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

    public  Node[] divide_odd_and_even()
    {
       
        Node curr = head;
        Node odd_head = null,odd_tail = null;
        Node even_head = null, even_tail = null;

        while(curr != null)
        {
            Node next  = curr.next;
            curr.prev = null;
            curr.next = null;

            if(curr.data%2 != 0)
            {
                if(odd_head == null)
                {
                    odd_head = odd_tail = curr;
                }
                else{
                    odd_tail.next = curr;
                    curr.prev = odd_tail;
                    odd_tail = curr;
                }
            }
            else{
                if(even_head == null)
                {
                    even_head = even_tail = curr;
                }
                else{
                    even_tail.next = curr;
                    curr.prev = even_tail;
                    even_tail = curr;
                }
            }
            curr = next;
        }
        
return new Node[]{odd_head, even_head};  // we need to return multiple nodes we should use node array and remember to keep the node array in fuction declearation
       
    }


    public void display_for_even_and_odd(Node head) {

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


    public static void main(String args[])
    {

        dividing_even_odd_lists list = new dividing_even_odd_lists();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list.display();

        Node[]  result = list.divide_odd_and_even();

        Node odd_head = result[0];
        Node even_head = result[1];

        list.display_for_even_and_odd(odd_head);
        list.display_for_even_and_odd(even_head);

    }
    
}
