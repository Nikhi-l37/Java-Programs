public class check_String {
    public static void main(String[] args) {
    int n = 100;

    String s = String.valueOf(n);  // These line is used to convert the int value into string

       if(s instanceof String){    // These line is used to check variable is a string or not 
        System.out.println("Good job");
       }
       else{
        System.out.println("Wrong answer");
       }
    }
}

   