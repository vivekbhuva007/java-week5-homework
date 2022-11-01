package program;

import java.util.ArrayList;

public class TaskFour {
    public static void main(String args[]) {
        ArrayList<String> favouriteColours = new ArrayList<>();
        favouriteColours.add("Blue");
        favouriteColours.add("Red");
        favouriteColours.add("Green");
        favouriteColours.add("Yellow");
        favouriteColours.add("Black");
        favouriteColours.add("Purple");

        for (String j : favouriteColours) {
            System.out.println(j);
        }
    }
}
