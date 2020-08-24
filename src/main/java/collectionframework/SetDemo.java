package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public void studentName(){

        Set<String> name = new HashSet<String>();
        name.add("Charley J");
        name.add("Vijay lakshmi");
        name.add("Ali Hossain");
        name.add("Mahindra Singh");
        name.add("Tamim Iqbal");
        name.add("Ali Hossain");

// Set does not make any sequence and this is why it will show
// the list in disordered way
        for(String n : name){
            System.out.println(n);
        }
    }
}
