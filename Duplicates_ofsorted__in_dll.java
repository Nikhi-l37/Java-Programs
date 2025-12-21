public class Duplicates_ofsorted__in_dll {
    

    
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

    public void duplicates()
    {
        Node curr = head;

        while(curr.next != null)

        {
            
            if(curr.data == curr.next.data)
            {
                Node next = curr.next;
                curr.next = next.next;
                next.next.prev = curr;
            }
            else{

            curr = curr.next;

            }
        }

    
        
    }
    public static void main(String args[])
    {
        Duplicates_ofsorted__in_dll list = new Duplicates_ofsorted__in_dll();
        list.insert(1);
        list.insert(1);
         list.insert(2);
                  list.insert(2);

        list.insert(2);
         list.insert(3);
        list.insert(3);
         list.insert(3);
               list.insert(3);
        list.insert(3);
         list.insert(3);
        list.insert(4);

        list.display();
        list.duplicates();
        list.display();


    }

}
