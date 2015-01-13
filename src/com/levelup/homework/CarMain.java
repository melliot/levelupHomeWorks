package com.levelup.homework;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car.CarBuilder("Green", 90).type("compact").build());
        cars.add(new Car.CarBuilder("Red", 190).type("pickup").build());
        cars.add(new Car.CarBuilder("Grey", 50).type("van").build());
        cars.add(new Car.CarBuilder("Black", 50).build());

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
