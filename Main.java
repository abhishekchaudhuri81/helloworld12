import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList= new ArrayList<Integer>();
        ArrayList<Integer> myList1= new ArrayList<Integer>();; {
        };
        Integer myPos= Collections.binarySearch(myList,200, null);
        System.out.println(myPos);
        for (int i=0; i<1000;i++)
        {
            myList.add(i*2);
        }
        Collections.reverse(myList);

        for (int i=0; i<1000;i++)
        {
            System.out.println(myList.get(i));
        }
    }

}
