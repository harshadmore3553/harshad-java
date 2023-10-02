package Method_Overloading;

public class Operation {
    void add(int a,int b)
    
    
    {
        System.out.println("1st method is "+(a+b));
    }
    void add(int a,int b,int c)
    {
        System.out.println("2 method add is"+(a+b+c));

    }
    void add(int a,float b)
    {
         System.out.println("1st method add is"+(a+b));
    }
    void add(float b,int a)
    {
         System.out.println("1st method add is"+(a+b));

    }
    double add(int a,double b)
    {
        //int c=(int)b;
        return a+b;
    }
    public static void main(String[] args) {
        Operation op=new Operation();
         System.out.println(op.add(10,20.1));
          System.out.println("-------------");
         op.add(20.6f,79);
         op.add(27,32);
         
    }
}
