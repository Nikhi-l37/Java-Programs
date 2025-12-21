// package DSA;

public class merge_list {

     Node head1;
     Node head2;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }


     public void list1(int data)
        {
            Node newnode = new Node(data);

            if(head1==null)
            {
                head1=newnode;
                return;
            }

            Node current = head1;

            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;
        }

         public void list2(int data)
        {
            Node newnode = new Node(data);

            if(head2==null)
            {
                head2=newnode;
                return;
            }

            Node current = head2;

            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;
        }


        public void display(Node head)

        {
            Node current = head;

            while(current!=null){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.println("Null");
        }

        public Node merge_list(Node l1,Node l2){

            Node dummy = new Node(0 );
            Node tail = dummy;

            while(l1!=null && l2!=null)
            {
                if(l1.data < l2.data)
                {
                    tail.next = l1;
                    l1 = l1.next;
                }
                else{
                    tail.next = l2;
                    l2 = l2.next;
                }
                tail = tail.next;
            }

            if(l1!=null) tail.next = l1;
            if(l2!=null) tail.next = l2;

            return dummy.next;
        }



    public static void main(String args[])
    {

        merge_list call = new merge_list();

        call.list1(1);
        call.list1(3);

        call.list2(2);
        call.list2(4);
        call.list2(6);
                call.list2(7);
                        call.list2(8);


        
        call.display(call.head1);
        call.display(call.head2);

       Node merge_list =  call.merge_list(call.head1,call.head2);

        call.display(merge_list);

        



    }
    
}
