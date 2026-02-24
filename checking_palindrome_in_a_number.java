class solution{
  public static void main(String args[]){

  int count[] = new count[10];
    int n = 122223333;

  while(n > 0){
    count[(int)n%10]++;
    n = n/10;
  }
    int odd_count = 0;

  for(int x:count){
    if(x%2 != 0){
      odd_count++;
    }
  }
    return odd_count >= 1;
  }
}
