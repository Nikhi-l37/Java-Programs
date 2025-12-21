 import java.util.ArrayList;
import java.util.List;

class Array {
    public static void main(String args[])  
       {

        int l1[] ={2,4,3};
        int l2[] ={5,6,4};

        int num1=0;
        for(int i= 0 ; i<l1.length;i++)
        {
            num1 = num1*10 + l1[i];
        }

        int rev1 = 0;
        while(num1!=0)
        {
            int digit = num1%10;
            rev1 = rev1*10 + digit;
            num1 = num1/10;
        }

        int num2=0;
        for(int j= 0 ; j<l2.length;j++)
        {
            num2 = num2*10 + l2[j];
        }

        int rev2 = 0;
        while(num2!=0)
        {
            int digit = num2%10;
            rev2 = rev2*10 + digit;
            num2 = num2/10;
        }
        System.out.println(rev1);
        System.out.println(rev2);
        

        int num3 = rev1+rev2;
        

        int rev3 = 0;

        while(num3!=0)
        {
            int digit = num3%10;
            rev3 = rev3*10 + digit;
            num3 = num3/10;
        }
        System.out.println(rev3);

          List<Integer> list = new ArrayList<>();

        String s = String.valueOf(rev3); // "807"

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0'; // convert char to digit
            list.add(digit); // add to list
        }
      System.out.println(list);

    }
}