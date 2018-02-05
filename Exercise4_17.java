import java.util.Scanner;
public class Exercise4_17 
{
    public static void main(String[] args) 
    {
        Scanner reader=new Scanner(System.in);
        int n;
        System.out.print("Enter the number of lines: ");
        n=reader.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=n-i;k++)
            {
                System.out.printf("  ");
            }
            for(j=1;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.printf("1");
                }
                else
                {
                    System.out.printf("%d ",i-j+1);
                }
            }
            for(j=1;j<i;j++)
            {
                System.out.printf(" %d",j+1);
                
            }
           System.out.println();
       }
    }
}

/*          1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
  6 5 4 3 2 1 2 3 4 5 6
7 6 5 4 3 2 1 2 3 4 5 6 7  */