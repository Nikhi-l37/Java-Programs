public class string_pro {
    public static void main(String args[])
    {
        String text = "leetcode";
        int n = text.length();
        int[] array = new int[10];
        int count = 0;

        System.out.println(text);

        for(int i=0;i<n;i++)
        {
             char c = text.charAt(i);
             count = 0;

            for(int j=0;j<n;j++)
            {
                char c1 = text.charAt(j);
                if(c==c1)
                {
                    count++;
                }
            }
            array[i] = count;
        }

      boolean check = false;
        for(int i = 0;i<n;i++){
            if(array[i]==1)
            {
                check = true;
                System.out.println("index at "+array[i]+" the letter is "+text.charAt(i));
                break;
                
            }
        }
       if(!check){
          System.out.println("-1");

       }
            
    }
    
}
