package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Array_ListDemo{
    public static void main(String[] args) {
        ArrayList<Character> empGenderList= new ArrayList<Character>();
        empGenderList.add('M');
        empGenderList.add('F');
        empGenderList.add('T');
        System.out.println(empGenderList);
        Collections.sort(empGenderList);
        System.out.println("After sorted"+empGenderList);

        Iterator itr=empGenderList.iterator();
        System.out.println("After iteration is done");
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }


    }
    
}
