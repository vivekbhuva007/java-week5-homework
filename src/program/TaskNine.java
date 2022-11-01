package program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TaskNine {
    public static void main (String args[]){
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Alpha", 20);
        people.put("Beta", 30);
        people.put("Charlie", 40);
        people.put("Danny", 50);
        people.put("Echo", 60);
        people.put("Foxtrot", 70);

        for ( String i : people.keySet()) {
            System.out.println("Name:" + i + "Age:   " + people.get(i));
             //for (Map.Entry<String, Integer> TaskNine : people.entrySet()){
             //   System.out.println("Key:  "+ TaskNine + "Value:"   );

            }
        }
              {

        }
    }

