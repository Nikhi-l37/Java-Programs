// package DSA;
import java.util.*;

public class pratice1 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println();
         
        System.out.println("Enter the number of paragraphs:");
         int n = scan.nextInt();

         String cleaned_data[] = new String[n];

         for(int para_line=0;para_line<n;para_line++)
         {
                String data = scan.nextLine();
                String splited_data[] = data.split("[^a-zA-Z]");
                boolean visit[] = new boolean[splited_data.length];
                StringBuilder r = new StringBuilder();
                
                for(int i=0;i<splited_data.length;i++)
                {
                    if(visit[i]){
                        continue;
                    }
                    r.append(splited_data[i]);

                    for(int j=i+1;j<splited_data.length;j++)
                    {
                        if(splited_data[i].equals(splited_data[j]))
                        {
                            visit[j] = true;

                        }

                    }
                    r.append("");
                }

                cleaned_data[para_line] = r.toString().trim();
         }

         for(String para : cleaned_data)
         {
            System.out.println(para);
         }


    }
    
}
