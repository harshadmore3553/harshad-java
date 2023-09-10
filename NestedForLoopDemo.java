import java.util.Scanner;

public class NestedForLoopDemo {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Row count");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("\t"+i);
            }
            System.out.println();
        }
        for(int i=row-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("\t"+i);
            }
            System.out.println();
        }
        
    }
    
}
