//loop using for-each loop

import java.util.ArrayList;
public class EnhancedLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
