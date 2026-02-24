public class Main
{
	public static void main(String[] args) {
		
		String arr[] = {"flower","flow","flight"};
		String prefix = arr[0];
		
		for(int i=1;i<arr.length;i++){
		    while(!arr[i].startsWith(prefix)){
		        prefix = prefix.substring(0,arr.length-1);
		        
		         if(prefix.isEmpty()) {
                    System.out.println("No common prefix");
                    return;
                }
		    }
		}   
		
		System.out.println(prefix);
		
		

		
	}
}
