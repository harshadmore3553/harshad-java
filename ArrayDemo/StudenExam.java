package ArrayDemo;

public class StudenExam {
    int i;
    int marks[]=new int[5];
    void storemarks()
    {
        marks[0]=100;
        marks[1]=200;
        marks[2]=300;
        marks[3]=400;
        marks[4]=500;
    }
    void displayMarks()
    {
        for(i=0;i<=4;i++)
        {
            System.out.println(marks[i]);
        }
    }
    public static void main(String[] args) {
        StudenExam  se=new StudenExam();
        se.storemarks();
        se.displayMarks();
    }



    
}
