package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class mycomarator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {

        return o2.getDisp() -o1.getDisp();
    }
}

public class Main3 {

    public static void main(String[] args) {
        List<Car> list = Arrays.asList(new Car(4000),
                                        new Car(1200),
                                        new Car(1000));
        list = new ArrayList<>(list);

        Collections.sort(list, new mycomarator());
        System.out.println();
    }


}
