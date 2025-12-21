// package DSA;
public class Main
{
    
    Node head1;
    Node head2;
    
     static class Node {
         int data;
         Node next;
    
     Node(int data){
         this.data = data;
         this.next = null;
     }
     }
     
     public void insert1(int data){
         
         Node newnode = new Node(data);
         
         if(head1 == null)
         {
             head1 = newnode;
         }
         else{
             Node curr = head1;
             
             while(curr.next!=null)
             {
                 curr = curr.next;;
             }
             curr.next = newnode;
         }
         
     }
     
     
     public void insert2(int data){
         
         Node newnode = new Node(data);
         
         if(head2 == null)
         {
             head2 = newnode;
         }
         else{
             Node curr = head2;
             
             while(curr.next!=null)
             {
                 curr = curr.next;;
             }
             curr.next = newnode;
         }
         
     }
     
     
     public void display(Node head){
         Node curr = head;
         
         if(curr == null)
         {
             System.out.println("list is empty");
         }
         
         else{
             
             while(curr!=null)
             {
                 System.out.print(curr.data+"->");
                 curr = curr.next;
             }
             System.out.println("null");
             
         }
     }
     
     public Node Addition(Node head1,Node head2){
         
         Node dummy = new Node(0);
         Node tail = dummy;
         
         Node curr1 = head1;
         Node curr2 = head2;
         
         int carry = 0;
         
         while(curr1!=null && curr2!=null){
             
             int x =  (curr1!=null) ? curr1.data : 0;
             int y =  (curr2!=null) ? curr2.data : 0;
             
             int digit , sum;
             
             sum = curr1.data + curr2.data + 0;
             carry = sum/10;
             digit = sum%10;
             
             tail.next = new Node(digit);
             
             tail = tail.next;
             
             if(curr1 != null) curr1 = curr1.next;
             if(curr2 != null) curr2 = curr2.next;
             
         }
         
         if(carry > 0)
         {
             tail.next = new Node(carry);
         }
         
         return dummy.next;
         
              }
     
        
        
    
	public static void main(String[] args) {
	    
		Main list = new Main();

		
		list.insert1(1);
		list.insert1(2);
		list.insert1(3);
		
		list.insert2(4);
		list.insert2(5);
		list.insert2(6);
		
		
		
		list.display(list.head1);
		list.display(list.head2);
		
		Node dummy = list.Addition( list.head1, list.head2);
		
		list.display(dummy);
		
		

	}
}