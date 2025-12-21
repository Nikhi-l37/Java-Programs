public class searching_in_LL {

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
            System.out.println();
            while(current!=null){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.println("Null");
        }


        public void searching(int value)
        {
            Node  current = head;

            while(current!=null)
            {
                int count = 0;

                if(current.data == value)
                {
                    System.out.println();
                    System.out.println("element "+value+" "+"is found at index" + " "+count);
                }
                count = count+1;
                current = current.next;
            }

        }

        public void delete_greaterthan_25(){

            Node  current = head;

            while(head != null && head.data>25)
            {
                head = head.next;
            }

            while(current.next!=null)
            {
                if(current.next.data>25)
                {
                    current.next = current.next.next;
                }

                else{
                current = current.next;
            }
        }
            }

           public void reverse_list(){
            

            if(head == null)
            {
                System.out.println("list is empyt");

            }

            Node prev = head;
            Node current = head.next;

            while(current!=null)
            {
                Node next = current.next;
                current.next = prev;

                prev = current;
                current = next;
            }
            head.next = null;
            head = prev;
         }

         public void middle_element()
         {
            Node current = head;
            int count = 0;
           
             while(current!=null){
                count = count+1;
                System.out.print(current.data+"->");
                current = current.next;
            }

            int m = count/2;
            current = head;

            for(int i=0;i<m;i++)
            {
                current = current.next;
            }
            System.out.println();
            System.out.println("middle element"+current.data);

         }

         public void even(){

            Node current = head;

            while(current!=null)
            {
                if(current.data%2 == 0)
                {
                    System.out.print(current.data+" ");
                }
                current = current.next;
            }
            System.out.println();
         }


          public void odd(){

            Node current = head;

            while(current!=null)
            {
                if(current.data%2 != 0)
                {
                    System.out.print(current.data+" ");
                }
                current = current.next;
            }
            System.out.println();
         }


        

    public static void main(String args[])
    {
        searching_in_LL list = new searching_in_LL();

        int[] elements = {100,92,5,7,8,102,300,4,905,10};

        for(int i:elements){
            list.insert(i);
        }
     
        list.display();

        list.searching(7);
        list.searching(2);

        list.delete_greaterthan_25();

        list.display();

        list.middle_element();

        list.even();
        list.odd();

        list.reverse_list();





        




    }  
}
