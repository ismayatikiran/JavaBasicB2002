package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public void studentList(){

        List<Integer> studentIdList = new ArrayList<Integer>();

        studentIdList.add(101);
        studentIdList.add(102);
        studentIdList.add(103);
        studentIdList.add(104);
        studentIdList.add(105);
        studentIdList.add(106);
        studentIdList.add(107);
        studentIdList.add(108);

        //How to get value of one out of the list
        System.out.println("Get Value of 1: "+ studentIdList.get(1));

        //How to fine size of the Array
        System.out.println("Getting size of the list " + studentIdList.size());

        //How to replace one value instead of the other value
        studentIdList.add(7,109);
        System.out.println("Adding new value 109 on Index 7: "+ studentIdList.get(7));//

        //How to remove one value from the Index List
        studentIdList.remove(7);
        System.out.println("Removing Index 7 size of List : "+ studentIdList.size());
        System.out.println("After removing values of List : " + studentIdList);

        //In order to get all Index and Values in a line by line manner
        //We can use for each Loop
        System.out.println("Printing all the value of the Student Id line by line :");

        for (Integer e: studentIdList) {
            System.out.println(e);

        }
    }
}
