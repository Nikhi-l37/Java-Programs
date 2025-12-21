package oops_concept;

public class String_LL {

      Node head;
    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void insert_node(String data)
    {
        Node newnode = new Node(data);
        
        if(head==null)
        {
            head = newnode;
            return;
        }

        Node current_node = head;

        while(current_node.next!=null)
        {
            current_node = current_node.next;
        }
        current_node.next = newnode;


    }

    public void display()
    {
        Node current_node = head;

        while(current_node!=null)
        {
            System.out.print(current_node.data+"->");
            current_node = current_node.next;
        }
                    System.out.println("null");

    }



    public static void main(String args[])
    {
        System.out.println();
        String_LL string_list = new String_LL();
        string_list.insert_node("Nani");
        string_list.insert_node("Mammu");

        System.out.println();

        string_list.display();




    }
    
}
