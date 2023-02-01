package facade;

import java.util.ArrayList;
import java.util.Arrays;

public class DialogBot {

    public String greet(String name) {
        if (name.contains(",")) return greet(Arrays.toString(name.split(", ")));
        if (name.equals("")) return "Hello, my Friend.";
        if (name.equals(name.toUpperCase())) return "HELLO " + name +".";

        return "Hello, " + name + ".";
    }

    public String greetMore(String[] name) {
        String result = "";
        boolean shout = false;

        ArrayList<Integer> shoutList = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {
            if(name.length == 2){
                result += name[i] + " & ";
                i++;
            }

            if (name[i].equals(name[i].toUpperCase())) {
                shoutList.add(i);
                shout = true;
                i++;
            }

            if (name[i].contains("\"")) {
                name[i] = name[i].replaceAll("\"", "");
            }

            if (i == name.length - 1 && name.length > 2) result += "& ";

            result += name[i];

            if (i < name.length - 1) result += ", ";

            if (i == name.length - 1) result += ".";

            if (shout) {
                for (Integer index : shoutList) {
                    result += " AND HELLO " + name[index] + "!";
                }
            }
        }
        return "Hello, " + result;
    }
}
