package yuown.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("A");
        l.add("B");
        
        System.out.println(l);
        
        l.removeAll(l);
        
        System.out.println(l);
    }

}
