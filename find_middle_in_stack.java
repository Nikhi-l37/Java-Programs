import java.util.*;
public class find_middle_in_stack {

    static Stack<Integer> stack = new Stack<>();

        public static int  middle(){
	         int n = stack.size();
	         return find(n/2);
	    }
	    
	    public static int find(int mid){
	     
	        
	        int data = stack.pop();
	        
	        if(mid == 0){
	            stack.push(data);
	            return data;
	        }
	        
	        int res = find(mid-1);
	            stack.push(data);  // Add this line to restore the stack

	        return res;
	    }
	    
	public static void main(String[] args) {
	    

	    stack.add(10);
	    stack.add(20);
	    stack.add(30);
	    stack.add(40);
	    stack.add(50);

	    System.out.println(stack);
	    
	int result = middle();
	System.out.println(result);

	    
	}
}





