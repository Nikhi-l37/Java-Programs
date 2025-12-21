public class merge_sorted_lists {

    Node head1;
    Node head2;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;
        }
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

         public void insert2(int data) {
        Node newnode = new Node(data);

        if (head2 == null) {
            head2 = newnode;
        } else {
            Node curr = head2;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newnode;
            newnode.prev = curr;
        }
    }

       public void display(Node head) {
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

    public Node merege_lists(Node list1,Node list2)
    {
        Node dummy = new Node(0);
        Node tail = dummy;
        Node prev = null;

        while(list1!=null && list2!=null)
        {
            if(list1.data < list2.data)
            {
                tail.next = list1;   // forward linking 
                list1.prev = tail;   // previous linking

                list1 = list1.next;  // traverse to the next node
            }
            else{
                tail.next = list2;
                list2.prev = tail;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if(list1 != null) tail.next = list1;
        if(list2 != null) tail.next = list2;

        return dummy.next;
    }

    public  static  void main(String args[])
    {
 
        merge_sorted_lists list = new merge_sorted_lists();

        list.insert1(1);
        list.insert1(3);
        list.insert1(5);

        list.insert2(2);
        list.insert2(4);
        list.insert2(6);

        list.display(list.head1);

        list.display(list.head2);


        Node dummy = list.merege_lists(list.head1,list.head2);


        list.display(dummy);


    }
    
}
