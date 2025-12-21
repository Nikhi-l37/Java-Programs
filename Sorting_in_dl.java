
public class Sorting_in_dl
{
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
		} 
		else {
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
		} 
		else {
			Node curr = head;
			while (curr != null) {
				System.out.print(curr.data + " <-> ");
				curr = curr.next;
			}
			System.out.println("null");
		}
	}

	public void sorting()
	{
		Node curr = head;

		while(curr.next != null)
		{
		    
		    Node index = curr.next;
		    
		    while(index!=null)
		    {
		        if(curr.data > index.data)
		        {
		            int temp = index.data;
		            index.data = curr.data;
		            curr.data = temp;
		        }
		        index = index.next;
		    }
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		Sorting_in_dl list = new Sorting_in_dl();
		list.insert(100000);
		list.insert(20);
		list.insert(10);
		list.insert(0);
        list.insert(100);
        list.insert(20);
		list.insert(10);
		list.insert(0);



		list.display();

		list.sorting();

		list.display();

	}
}

