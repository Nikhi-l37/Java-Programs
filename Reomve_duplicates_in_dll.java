import java.util.*;
public class Reomve_duplicates_in_dll {

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

    public void remove_duplicates(){
        Node curr = head;

        HashSet<Integer>  set = new HashSet<>(); 

        while(curr != null)
        {
            if(set.contains(curr.data))
            {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
            }
            else{
                set.add(curr.data);
            }
            curr = curr.next;
        }
    }

    public static void main(String args[])
    {

        Reomve_duplicates_in_dll list  = new Reomve_duplicates_in_dll();

        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(5);
        list.insert(6);

        list.display();
        
        list.remove_duplicates();

        list.display();


    }
}
