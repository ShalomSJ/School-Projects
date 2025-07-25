//size of an arraylist

import java.util.ArrayList;
public class Size {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //size
        System.out.println(cars.size());
    }
}
