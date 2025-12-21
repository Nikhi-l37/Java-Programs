// package DSA;

public class intersecton_of_2_LL {

    Node head_a;
    Node head_b;
    Node common_head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }


        public void insert_in_a_list(int data)
     {

            Node newnode = new Node(data);

            if(head_a == null)
            {
                head_a = newnode;
                return;
            }

            Node current = head_a;

            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;

        }


         public void display_a_list()
        {
            Node current = head_a;
            System.out.println();
            while(current!=null){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.println("Null");
        }


           public void insert_in_b_list(int data)
     {

            Node newnode = new Node(data);

            if(head_b==null)
            {
                head_b=newnode;
                return;
            }

            Node current = head_b;

            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;
        }

         public void display_b_list()
    {
            Node current = head_b;
            System.out.println();
            while(current!=null){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.println("Null");
        }




          public void common_list(int data)
     {

            Node newnode = new Node(data);

            if(common_head == null)
            {
                common_head = newnode;
                return;
            }

            Node current = common_head;

            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;
        }

         public void display_common_list()
    {
            Node current = common_head;
            System.out.println();
            while(current!=null){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.println("Null");
        }

        public void intersection_of_a_b(int length_a,int length_b)
        {
            Node current_a = head_a;
            Node current_b = head_b;

            if(length_a>length_b){

                for(int i=0;i<length_a-length_b;i++){

                    current_a = current_a.next;
                }

            }
            else
            {
                for(int i=0;i<length_b-length_a;i++)
                {
                    current_b = current_b.next;
                }
            }

            while(current_a!=null && current_b!=null)
            {
                if(current_a.data == current_b.data)
                {
                    System.out.println("The first intersection is at "+" "+current_a.data);
                    break;
                }
                current_a = current_a.next;
                current_b = current_b.next;
            }

        }


        public int  length(Node head_value){

            Node current = head_value;
            int length = 0;

            while(current!=null){
                length ++;
                current = current.next;
            }
            return length;
        }


        
    public static void main(String args[])
    {

        intersecton_of_2_LL list = new intersecton_of_2_LL();

        list.insert_in_a_list(1);
        list.insert_in_a_list(2);
        list.insert_in_a_list(3);

        list.insert_in_b_list(4);
        list.insert_in_b_list(5);

        list.common_list(7);
        list.common_list(8);
        list.common_list(9);




        Node Attaching_A = list.head_a;

        while(Attaching_A.next!=null)
            {
                Attaching_A = Attaching_A.next;
            }

            Attaching_A.next = list.common_head;


        Node Attaching_B = list.head_b;

        while(Attaching_B.next!=null)
        {
            Attaching_B = Attaching_B.next;
        }

        Attaching_B.next = list.common_head;

        System.out.println();

        list.display_common_list();
        list.display_a_list();
        list.display_b_list();

       int length_a = list.length(list.head_a);
       int length_b = list.length(list.head_b);

       list.intersection_of_a_b(length_a,length_b);

    }

}
