
int count[] = new int[26];

for(int i=0;i<s.length;i++){
  count['s.chatAt(i)-'a']++;
}


for(int i=0;i<s2.length;i++){
  count['s.chatAt(i)-'a']--;
}

for(int x : count){
  if(x>0){
    System.out.println("not a anagram");
  }
}

