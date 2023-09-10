import java.util.Scanner;

public class AreaDemo {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        float r=sc.nextFloat();
        final float pi=3.14f;
        float area=pi*r*r;
        System.out.println("Area of circle\t23"+area);

    }
}

