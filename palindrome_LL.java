public class palindrome_LL {

    Node head;
    Node new_head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }


      public void insert(int data)
     {
            Node newnode = new Node(data);

            if(head == null)
            {
                head = newnode;
                return;
            }

            Node current = head;

            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;
}

        public void copying_list(Node head){


            new_head = new Node(head.data);
            Node old_current = head.next;
            Node new_current = new_head;

            while(old_current!=null)
            {
                new_current.next = new Node(old_current.data);
                old_current = old_current.next;
                new_current = new_current.next;
            }

          
        }


        public void reverse_list(){

            if(new_head == null || new_head.next == null){
                return ;
            }

            Node prev = new_head;
            Node curr_node = new_head.next;


            while(curr_node!=null)
            {
                Node next = curr_node.next;
                curr_node.next = prev;

                prev = curr_node;
                curr_node = next;
            }
            new_head.next = null;
            new_head = prev;

        }

        public boolean palindrone(Node head1,Node head2){

            Node curr_node1 = head1;
            Node curr_node2 = head2;
            
            while(curr_node1 != null && curr_node2!=null)
            {
                if(curr_node1.data != curr_node2.data)
                {
                    return false;
                }

                curr_node1 = curr_node1.next;
                curr_node2 = curr_node2.next; 
                
            }
            return true;
        }


           public void display(Node head)
        {
            System.out.println();
            Node current = head;
            System.out.println();
            while(current!=null){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.println("Null");
        }




    public static void main(String args[]){

        palindrome_LL list = new palindrome_LL();

        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(1);

        System.out.println();

        System.out.println("orginal list ");
        list.display(list.head);


        System.out.println("copied list ");
                list.copying_list(list.head);

        list.display(list.new_head);

       

        System.out.println("reversed list");
                list.reverse_list();
        list.display(list.new_head);



        boolean value = list.palindrone(list.head,list.new_head);
        System.out.println();

        if(value)
        {
            System.out.println("It is  a palindrone");
        }
        else
        {
            System.out.println("It is not a palindrone");

        }


    }
    
}
