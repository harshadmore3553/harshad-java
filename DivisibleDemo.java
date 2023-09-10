public class DivisibleDemo {
    public static void main(String[] args) {
        int i;

        for(i=1;i<=100;i++)
        {
           if(i%3==0)
                continue;
                System.out.println(i+"square is="+(i*i));
                System.out.println(i+"cube is="+(i*i*i));

 
        }
            

        
    }
    
}
