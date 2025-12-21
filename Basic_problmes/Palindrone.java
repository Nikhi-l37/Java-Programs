public class Palindrone {
    public static void main(String args[])
    {
    int num = 1231,rev = 0 ;
    int temp = num;


    while(num!=0){
        int digit = num%10;
        rev = rev*10 + digit;
        num = num/10;
    }
    if (temp == rev){
        System.out.println("Is a plaindrone");
    }
    else
    {
        System.out.println("Is not  a plaindrone");

    }

  }
    
}
