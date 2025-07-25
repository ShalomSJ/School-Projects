//loop through an arraylist

import java.util.ArrayList;
public class Loop {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //loop
        for (int i =0;i< cars.size();i++){
            System.out.println(cars.get(i));

        }
    }
}
