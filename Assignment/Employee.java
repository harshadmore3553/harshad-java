package Assignment;

public class Employee{
    String name;
    int id,salary;
    Employee(String name,int id,int salary)
    {
        System.out.println(" I am in para constructor");
        this.name=name;
        this.id=id;
        this.salary=salary;

    }
    void display()
    {
        System.out.println("name is"+name);
        System.out.println("id is"+id);
        System.out.println("salary is"+salary);

    }
    public static void main(String[] args) {
        Employee emp=new Employee("aviraj", 05, 1);
        emp.display();
    }

    
}
