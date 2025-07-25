//change an element

import java.util.ArrayList;
public class Change {
    public static void main(String[] args) {
        ArrayList <String> cars= new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //change element
        cars.set(0,"Opel");
        System.out.println(cars);
    }
}