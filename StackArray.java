class StackArray{
    
    char array[];
    int cap;
    int top;
    
    StackArray(int size){
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
    
    
    public void pop(){
        
        if(top == -1){
            System.out.println("stack is underflow");
            return;
        }
        char del = array[top--];
        System.out.println(del+" "+"is poped");
        
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
    
    
    public static void main(String arrgs[]){

        StackArray stack = new StackArray(5);
        
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('b'); 
         stack.push('a'); 
        
        System.out.println();

        stack.display();

        
        boolean res = stack.palindrome();
        
        System.out.println();
        if(res){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
        

        
    }
}

