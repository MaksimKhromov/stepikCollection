package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CarCollection cars = new CarArrayList();
        for (int i = 0; i < 10; i++) {
            cars.add(new Car("brand" + i, i));
        }
        for (var o : cars){
            System.out.println(o.getBrand() + " " + o.getNumber());
        }
    }
}