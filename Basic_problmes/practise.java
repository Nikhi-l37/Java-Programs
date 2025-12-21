public class practise {
    public static void main(String args[]){

        int[] freq = new int[26];

        char count = 'a';

    for(int i =0;i<freq.length;i++)
    {
        freq[i] = (count)++;
        System.out.print((char) freq[i]+" ");
    }
    System.out.println();

    int[] s1 = new int[26];

    for(int i = 0;i<freq.length;i++)
    {
       int index = freq[i]-'a';
        s1[index]++;
    }

    for(int i = 0;i<26;i++){

        System.out.println((char) freq[i]+" - "+s1[i]);
    }



    }
    
}
