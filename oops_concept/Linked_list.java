
package oops_concept;
public class Linked_list
{

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

        public void Insert_At_begining(int data)
        {
            Node New_node = new Node(data);
            New_node.next = head;
            head  = New_node;
        }

        public void Insert_At_position(int data,int position){

            Node Newnode = new  Node(data);
            Node current = head;

            if(position==0){
              Newnode = new Node(data);
              Newnode.next = head;
              head = Newnode;
            }

            for(int i=0;i<position-1;i++){

                if(current.next==null)
                {
                    System.out.println("Index is out of bounds ");
                    return;
                }

              current = current.next;
            }

            Newnode.next = current.next;
            current.next = Newnode;
        }

        public void Delte_At_Position(int pos)
        {
            Node current_node = head;
            Node previous_node = null;

            int count = 0;
            Node current = head;

            while(current!=null){
                count = count+1;
                current = current.next;
            }

            if(pos<=count){

            if(pos==0){
                head = head.next;
            }
            else{

            for(int i=0;i<pos;i++)
            {
                previous_node = current_node;
                current_node = current_node.next;
            }
            previous_node.next = current_node.next;
        } 
    }
     else

        {
            System.out.println("Enter valid position");
        }
    
}  
         public void reverse_of_linked_list(){
            
            Node prev =head ;
            Node current = head.next;

            while(current!=null)
            {
                Node next = current.next;
                current.next = prev;

                prev = current;
                current = next;
            }
            head = prev;
            head.next = null;
        
         }

         public void display1()
         {
            Node current = head;
            Node next = current.next;
            System.out.println(current.data);
            
         }


    public static void main(String args[]){

        Linked_list list = new Linked_list();
        System.out.println();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        
        //list.Insert_At_begining(0);

        // list.Insert_At_position(100,2);

        list.display();

        list.reverse_of_linked_list();

        list.display();

         //list.Delte_At_Position(2);
         //list.Delte_At_Position(9);


        
        // list.display();


    }
}