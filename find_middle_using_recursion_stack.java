public class find_middle_using_recursion_stack {

     char array[];
    int cap;
    int top;
    
    find_middle_using_recursion_stack(int size){
        cap = size;
        array = new char[cap];
        top = -1;
    }
    
    int size = 0;
    
    public void push(char data){
        
        if (top == cap-1){
            System.out.println("Stack is underflow");
            return;
        }
        
        array[++top] = data;
        size++;

    }
    
    
    public char pop(){
        
        if(top == -1){
            System.out.println("stack is underflow");
            return 'c';
        }
        char del = array[top--];
        System.out.println(del+" "+"is poped");
        return del;
        
    }
    
    public void display(){

        for(int i = top;i>=0;i--){
            System.out.print(array[i]);
            
        }
        
    }
    
    public boolean palindrome(){
       
       int mid = size/2;
       boolean check = true;
       
        for(int i=0;i<mid;i++){
            
            if(array[i] != array[size-1-i]){
                check = false;
                return check;
            }
        }
                    return check;

    }
    
    char findmiddle(){
        int mid = size/2;
        return middle(mid);
    }
    
     char  middle(int mid){
         
         char x = pop();
         
         if(mid == 0){
             push(x);
             return x;
         }
         
         char result = middle(mid-1);
         push(x);
         return result;
        
    }
    
    
    public static void main(String arrgs[]){

        find_middle_using_recursion_stack stack = new find_middle_using_recursion_stack(10);
        
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('b'); 
        stack.push('a'); 
        stack.push('d');
          stack.push('t');
           stack.push('j');  
                // stack.push('a');
 
        System.out.println();


        stack.display();

    
     System.out.println();
      char mid =  stack.findmiddle();
      System.out.println("middle element is "+mid);
        

        
    }
    
}
