public class pl_and_cycle {


    
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



        public  boolean palindrone()
        {
            Node slow = head ;
            Node fast= head;

            while(fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }

        Node sh = reverse(slow);

        Node fh = head;
        Node copy = sh;

        boolean check = true;

        while(sh!=null){

            if(fh.data!=sh.data)
            {
                check  = false;
                break;
            }

            sh =  sh.next;
            fh = fh.next;

        }

        reverse(copy);
        return check;
        }


        public Node reverse(Node sh)
        {

            Node prev = null;
            Node curr = sh;

            while(curr!=null)
            {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }        

            return prev;
        }

        public void detection(){
            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow)
                {
                    System.out.println(" loop is found");
                    remove_cycle(fast);
                    return;

                }

            }
            System.out.println("Loop is not found");

        }

        public void remove_cycle(Node fast){

            Node ptr1 = head;
            Node ptr2 = fast;

            while(ptr1!=ptr2)
            {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }

            Node start_loop = ptr1;

            Node current = start_loop;

            while(current.next!=start_loop)
            {
                current = current.next;
            }
            current.next = null;
            
        }


        public void create_cycle(){

            Node current = head;
            Node link = head;

            while(current.next!=null)
            {
                current = current.next;
            }

            current.next = link.next.next;
        }

    public static void main(String args[])
    {

        pl_and_cycle list = new pl_and_cycle();


        System.out.println();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(20);
        list.insert(10);
        

        list.display();

        boolean check = list.palindrone();

        if(check)
        {

            System.out.println("palindrone");
        }
        else
        {
            System.out.println("It is not a palindrone");
        }
        System.out.println();

        list.display();

        list.create_cycle();

        list.detection();

        list.detection();


    }
    
}
