package oops_concept;

public class problem {

    Node head;

    public class Node
    {
        Node next;
        int data;

        Node(int data)
        {
            this.data = data;
            this.next = null;
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


         public void display()
        {
            Node current = head;

            while(current!=null){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.println("Null");
        }

        public void creating_cycle(){
            Node temp = head;
            int count = 0;
            Node cyclenode = null;

            while(temp.next!=null){

                if(count == 2)
                {
                    cyclenode = temp;
                }
                temp = temp.next;
                count++;
            }
            temp.next = cyclenode;
        }


    public void checking_loop(){

        Node slow = head;
        Node fast = head;
            
            while(fast != null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast)
                {
                    System.out.println(" cycle found");
                    return;
                }
            }
            System.out.println("cycle not found");
    }

    public static void main(String args[])
    {
        problem p = new problem();
        p.insert(10);
        p.insert(20);
        p.insert(30);
        p.insert(40);
        System.out.println();
        p.display();
        p.creating_cycle();
        p.checking_loop();




    }
    
}
