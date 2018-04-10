package demolist;

import java.util.ArrayList;

public class DemoArrayList {

    public static void main(String[] args) {

        ArrayList<String>fruits = new ArrayList<>();

        fruits.add("Blueberry");
        System.out.println(fruits);

        fruits.add(0, "Cranberries");
        System.out.println(fruits);

        System.out.println(fruits.get(0));

        fruits.remove(0);
        System.out.println(fruits);

        fruits.size();
        System.out.println(fruits.size());




    }

}
