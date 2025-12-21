// package DSA;
public class prime_LL {
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
       
        int size = 0;
       public void display()
        {
            Node current = head;
        

            while(current!=null){
                size = size+1;
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.println("Null");
        }

        public void check_prime(){

            Node current = head;

            while(current!=null)
            {

                if(current.data<2)
                {
                    System.out.println(current.data+" "+" is not a prime number");
                    current = current.next;
                    continue;
                }

                int count1 = 0;

                for(int i=2;i<=current.data;i++){
                   
                if(current.data%i == 0)
                {
                    count1++;

                }
                }
                if(count1 == 1)
                {
                    System.out.println(current.data+" "+" is a prime number");
                }
                else
                {
                    System.out.println(current.data+" "+" is not a prime number");
                }

                current = current.next;
            }

        }


    public static void main(String args[])
    {

        prime_LL list = new prime_LL();
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        for(int num : array){
            list.insert(num);
        }
        
        System.out.println();
        list.display();
        System.out.println();
        list.check_prime();

        


    }
}
