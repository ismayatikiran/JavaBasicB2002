package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public void sNamesInfo() {
        HashMap<Integer, String> studentInfo = new HashMap<Integer, String>();
        studentInfo.put(101, "Tamim Iqbal");
        studentInfo.put(102, "Vijay lakshmi");
        studentInfo.put(103, "Ali Hossain");
        studentInfo.put(104, "Charley J");
        studentInfo.put(105, "Mahindra Singh");

        System.out.println("List of Information of the studen" + studentInfo);
        System.out.println("How many in total Students present: " + studentInfo.size());
        System.out.println("Get Student ID 104 Name : " + studentInfo.get(104));


        System.out.println("\n" + "List of all the student including the ID and Name: ");
        for (Map.Entry<Integer, String> entry : studentInfo.entrySet()) {
            System.out.println(entry.getKey() + " : "+ entry.getValue());

        }
    }
}
