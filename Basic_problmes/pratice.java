import java.util.*;

public class pratice {
    public static  void main(String args[])

    {
        Scanner scan = new Scanner(System.in); 
        List<Integer> list = new ArrayList<>();
        List<Integer> duplicate_list = new ArrayList<>();
        int n = 5;

        for(int i=0;i<n-1;i++)
        {
            list.add(scan.nextInt());
        }

        Collections.sort(list);

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    int num = list.get(i);
                    if(!duplicate_list.contains(num))
                    {
                        duplicate_list.add(num);
                    }
                }
            }
        }
System.out.println();
       // for(int i : duplicate_list)
        //{
            System.out.println(duplicate_list);

        //}/


    }
}