package com.joysistvi.stage2.discussion;

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        //C — Create (add new data)
        cars.add("BMW");
        cars.add("Pickup");
        cars.add("Honda");
        cars.add(1, "Isuzu");
        cars.add (3,"SUV");

        // System.out.println(cars);

        //R — Read (retrieve/view existing data)
        System.out.println(cars.get(4));

        //U — Update (modify existing data)
        cars.set(4, "E-Bike");
        cars.set(0, "BMW");
        System.out.println(cars);

        //D — Delete (remove data)
        cars.remove("E-Bike");
        System.out.println(cars);

        cars.remove(1);
        System.out.println(cars);

        // getting the size
        System.out.println(cars.remove(cars.size() -2));

        System.out.println("\nTraversing an ArrayList using for-loop: ");
        for (int i = 0; i < cars.size(); i++) {

            if ("Pickup".equals(cars.get(i))) {
                continue;
            }
            System.out.println(cars.get(i));
        }

        System.out.println("\nTraversing an ArrayList using for-each loop:");
        for (String car : cars) {
            System.out.println(car);
        }

        cars.forEach(System.out::println);



    }
}
