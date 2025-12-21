public class string_Sort {
    public static void main(String args[]){
         
        char[] c = {'n','i','k','h','i','l'};

         int n = c.length;
         char temp;

         for(int i=0;i<n-1;i++){
            if(c[i] > c[i+1]){
                temp = c[i];
                c[i] = c[i+1];
                c[i+1] = temp;
            }
         }
         System.out.println();
         System.out.println(c);
          
         for(int j=0;j<n-1;j++){

          for(int i=0;i<n-1;i++){

            if(c[i] > c[i+1]){

                temp = c[i];
                c[i] = c[i+1];
                c[i+1] = temp;
            }
         }
        }
       
        System.out.println();
        
        System.out.println(c);

    }
    
}
