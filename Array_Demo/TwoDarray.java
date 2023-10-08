package ArrayDemo;

public class TwoDarray {
    public static void main(String[] args) {
        int marks[][]={
            {100,200,300},{600,400,800},{300,500,400}
        };
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.print("\t"+marks[i][j]);
            }
            System.out.println();
        }
    }
    
}
