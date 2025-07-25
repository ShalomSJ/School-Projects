//remove an element

import java.util.ArrayList;
public class Remove {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //remove element on arraylist
        cars.remove(2);
        System.out.println(cars);

        //remove all elements in arraylist
        cars.clear();
        System.out.println("Cleared: "+cars);
    }
}
