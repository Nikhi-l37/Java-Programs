
ArrayList<Integer> list = new ArrayList<>();
Hashset<Integer> set = new HashSet<>();

for(int x : arr){
  set.add(x);
}

for(int i =low;i<=high;i++){
  if(!set.contains(i)){
    list.add(i);
  }
}
