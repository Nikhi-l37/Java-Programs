public class Practise10 {

    Node head;

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

            if(head==null)
            {
                head=newnode;
                return;
            }

            Node current = head;

            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;
        }

        public void display()
        {
            Node current = head;

            while(current!=null){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.println("Null");
        }


    public static void main(String args[])
    {

        Practise10 list = new Practise10();
        list.insert(1);
        list.insert(2);
        list.insert(3);
       
        list.display();

        Node e = new Node(0);
        list.head.next.next = e;
        e = list.head.next.next;
        System.out.println("e value is "+e.data);
        System.out.println("updated list is ");
        list.display();

        Node tail = list.head;

        tail.next.next = e;
        System.out.println(tail.data);
        System.out.println(tail.next.data);
        System.out.println(tail.next.next.data);

        Node dummy =  new Node(0);
                System.out.println();

        System.out.println(dummy.data);
        Node tail1 = dummy;


        tail1.next = tail;
        tail1 = tail1.next;
        tail = tail.next;

        tail1.next = tail;
         tail1 = tail1.next;
        tail = tail.next;

        System.out.println();

        System.out.println(tail1.data);
        System.out.println(tail1.next.data);

       System.out.println();

        
        System.out.println(dummy.next.data);
        System.out.println(dummy.next.next.data);











     

    }
    
}
