public class pattern {
      public static void main(String args[]){

     
    int i,j,rows=5;

    for(i=0;i<rows;i++)
    {
        for(j=0;j<i;j++)
        {
            System.out.print("*");

        }
        System.out.println(" ");

    }

System.out.println(" ");
    
    for(i=rows;i>0;i--)
    {
        for(j=0;j<i;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }

System.out.println(" ");

   for(i=1;i<=rows;i++)
    {
        for(j=1;j<=rows-i;j++)
        {
            System.out.print(" ");
        }
        for(int k = 0;k<j;k++){
             System.out.print("*");
        }
        System.out.println(" ");
    }

    System.out.println(" ");

    
   for(i=1;i<=rows;i++)
    {
        for(j=1;j<=rows-i;j++)
        {
            System.out.print(" ");
        }

        for(int k = 0;k<i;k++){
             System.out.print("*");
        }
        System.out.println(" ");
    }
System.out.println();

    for(i=0;i<=rows;i++)
    {
        for(j=0;j<i;j++)
        {
            System.out.print("  ");

        }
        for(int k=0;k<rows-i;k++){
            System.out.print("*");

        }
        System.out.println();
    }
System.out.println();

for(i=1;i<=rows;i++){
    for(j=1;j<=rows-i;j++){
        System.out.print(" ");
    }
    for(int k = 1 ;k<=2*i-1;k++){
        System.out.print("*");
    }
    System.out.println();

}
    System.out.println();


for(i=1;i<=rows;i++)
{
    for(j=1;j<i;j++){
        System.out.print(" ");

    }
    for(int k=1;k<=2*(rows-i)+(1);k++)
    {
        System.out.print("*");
    }
    System.out.println();
}

System.out.println();


for(i=0;i<rows;i++)
{
    for(j=0;j<rows;j++)
    {
        if(i==0||i==rows-1||j==0||j==rows-1){
            System.out.print("*");
        }
        else
        {
             System.out.print(" ");
        }
    }
    System.out.println();
}


System.out.println();

for(i=0;i<rows;i++)
{
    for(j=0;j<rows;j++)
    {
        if(i==rows-1||j==0){
            System.out.print("*");
        }
        else
        {
             System.out.print(" ");
        }
    }
    System.out.println();
}

    System.out.println();

    

for(i=0;i<rows;i++)
{
    for(j=0;j<rows;j++)
    {
        if(j==rows-1||j==0||i==rows/2){
            System.out.print("*");
        }
        else
        {
             System.out.print(" ");
        }
    }
    System.out.println();
}








     }
    
}
