package Constructor_Overloading;

public class Student {
    String name,email;
    int rollNo,marks,pin;
    Student (int marks,int pin)
    
    {
        System.out.println("I am i first Constructor");
        this.marks=marks;
        this.pin=pin;

    }
    Student(int marks,String name)

    {
        System.out.println("I am in 2nd Constructor");
        this.marks=marks;
        this.name=name;

    }
    Student(String name,int rollNo,String email)
    {
        System.out.println("I am in 3rd Constructor");
        this.name=name;
        this.email=email;
        this.rollNo=rollNo;

    }
    Student(String name, int rollNo)
    {
        System.out.println("I am in 4th Constructor");
        this.name=name;
        this.rollNo=rollNo;
    }
    void display()
    {
    System.out.println("name is"+ name);
    System.out.println("rollNo is"+rollNo);
    System.out.println("Email is"+email);
    System.out.println("marks is"+marks);
    System.out.println("pin is"+pin);
    }
    public static void main(String[] args) {
        Student st1=new Student(100,410206);
        st1.display();
        System.out.println("----------------------------------");
        Student st2=new Student(101,"Aviraj");
        st2.display();
         System.out.println("----------------------------------");
        Student st3=new Student("Aviraj",28,"Avi@gmail.com");
        st3.display();
         System.out.println("----------------------------------");
        Student st4=new Student("Aviraj",20);
        st4.display();

    }
}   
