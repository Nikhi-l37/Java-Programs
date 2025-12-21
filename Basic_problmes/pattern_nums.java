public class pattern_nums {
    public static void main(String args[])
    { 

    int n = 5;
    for(int i=1;i<=n;i++)
    {
        for(int j = 1;j<=i;j++)
        {
            System.out.print(i);
        }
        System.out.println();
    }

System.out.println();

for(int i=1;i<=n;i++)
    {
        for(int j = 1;j<=i;j++)
        {
            System.out.print(j);
        }

        System.out.println();
    }

    System.out.println();

    for(int i=n;i>=1;i--)
    {
        for(int j = 1;j<=i;j++)
        {
            System.out.print(j);
        }

        System.out.println();
    }


System.out.println();

    for(int i=n;i>=1;i--)
    {
        for(int j = i;j>=1;j--)
        {
            System.out.print(j);
        }

        System.out.println();
    }


    
System.out.println();


for(int i=1;i<=n;i++)
    {
        for(int j = 1;j<=n-i;j++)
        {
            System.out.print(" ");
        }

        for(int k=1;k<=i;k++){
            System.out.print(k);
        }

        System.out.println();
    }



    System.out.println();


for(int i=1;i<=n;i++)
    {
        for(int j = 1;j<=i;j++)
        {
            System.out.print(" ");
        }

        for(int k=n;k>=i;k--){
            System.out.print(k);
        }

        System.out.println();
    }

        System.out.println();


        for(int i=1;i<=n;i++)
       {
        for(int j = 1;j<=n-i;j++)
        {
            System.out.print(" ");
        }

        for(int k=1;k<=2*i-1;k++){
            System.out.print(k);
        }

        System.out.println();
    }


            System.out.println();


        for(int i=1;i<=n;i++)
       {
        for(int j = 1;j<=i;j++)
        {
            System.out.print(" ");
        }

        for(int k=2*(n-i)+1;k>=1;k--){
            System.out.print(k);
        }

        System.out.println();
    }

            System.out.println();

System.out.println("1.Hourglass Pattern");
            System.out.println();




        for(int i=1;i<=n;i++)
       {
        for(int j = 1;j<=i;j++)
        {
            System.out.print(" ");
        }

        for(int k=2*(n-i)+1;k>=1;k--){
            System.out.print("*");
        }

        System.out.println();
    }

        
        for(int i1=1;i1<=n;i1++)
       {
        for(int j = 1;j<=n-i1;j++)
        {
            System.out.print(" ");
        }

        for(int k=1;k<=2*i1-1+2;k++){

            System.out.print("*");
        }

        System.out.println();
    }

      
System.out.println();



// Top Inverted Pyramid
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= 2 * (n - i) + 1; k++) {
        System.out.print("*");
    }
    System.out.println();
}


// Bottom Pyramid (mirror of top)
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i+1; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
    }
    System.out.println();
}


System.out.println();


        for(int i=1;i<=n;i++)
       {
        for(int j = 1;j<=n-i;j++)
        {
            System.out.print(" ");
        }

        for(int k=1;k<=2*i-1;k++){
            System.out.print(k);
        }

        System.out.println();
    }
System.out.println();



    System.out.println("These is 1.method for printing 6");
        System.out.println();


for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        if(i==1||j==1)
        {
            System.out.print("*");
        }
        else {
             System.out.print(" ");
        }
    }
    System.out.println();
}
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        if(i==1||j==n||i==n||j==1)
        {
            System.out.print("*");
        }
        else {
             System.out.print(" ");
        }
    }
    System.out.println();
}
    System.out.println();



    System.out.println("These is 2.method for printing 6");
    System.out.println();

    int n1 = 10;
    int n2 = 6;

for(int i=1;i<=n1;i++){
    for(int j=1;j<=n2;j++){

        if(i==1||i==n1|| j == 1||i >= n1 / 2 + 1 && j == n2||i == n1 / 2 + 1)
        {
            System.out.print("*");
        }
        else {
             System.out.print(" ");
        }
    }
    System.out.println();
}





    }
}