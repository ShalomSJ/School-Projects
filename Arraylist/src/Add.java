//add elements to an arraylist

import java.util.ArrayList;
public class Add {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList <String> ();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        //access an element
        System.out.println(cars.get(3));

    }
}
