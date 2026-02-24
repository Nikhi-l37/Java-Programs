class solution{
  public static void main(String args[]){
    int[] freq = new int[26];
    String s = sc.nextLine();

    for(int i=0;i<s.length();i++){
      freq[s.charAt(i)-'a']++;
    }

   for(int i=0;i<s.length();i++){
     if(count[s.charAt(i)='a'] == 1){
       return s.charAt(i);
     }
   }

  }
}

    
