public class Checking_Expression_using_stack {

    int cap;
    int top = -1;
    char arr[];
    int size = 0;

     Checking_Expression_using_stack(int size){
        cap = size;
        arr = new char[cap];
    }
    
    public void push(char data){
        
        if(top == cap-1){
            System.out.println("stack is full");
            return;
        }    
        arr[++top] = data;
        size++;
    }
    
    public char pop(){
        
        if(top == -1){
            System.out.println("Stack is empty");
            return 0;
        }
        char del = arr[top--];
        return del;
    }
    

    
    public boolean check(String s,int l){
        
       
        for(int i=0;i<l;i++){
            
             char ch = s.charAt(i);
             
             if(ch == '{' || ch == '(' || ch == '['){
                 push(ch);
             }
             else if(ch == ')' || ch == '}' || ch == ']' ){
                
                    if (top == -1) {
                return false; 
            }
            
                char pop_top = pop();
                 
                 if(pop_top == '(' && ch != ')' ||
                    pop_top == '{' && ch != '}' ||
                    pop_top == '[' && ch != ']' )
                    {
                        return false;
                    }
               
             }
        }
        return top == -1;
    }
    
	public static void main(String[] args) {
		Checking_Expression_using_stack stack = new Checking_Expression_using_stack(105);
	
	String expression = "[{[;',..,';]}]";
	int length = expression.length();
	
	boolean res = 	stack.check(expression,length);
	
	if(res){
	    System.out.println("Valid Paraenthsis");
	}
	else{
	    System.out.println("Not Valid Paraenthsis");
	}
	
	}
}

