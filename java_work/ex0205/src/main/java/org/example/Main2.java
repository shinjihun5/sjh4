package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {


        List<Car> list = Arrays.asList(
                new Car(1000),
                new Car(3000),
                new Car(4000),
                new Car(1200));

        Collections.sort(list);
        Collections.sort(list,
                new Comparator<Car>() {
                    @Override
                    public int compare(Car o1, Car o2) {
                        return 0;
                    }
                }

                );



        System.out.println(list);

    }
}
