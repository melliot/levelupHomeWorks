package com.levelup.homework;

import java.util.concurrent.atomic.AtomicInteger;

public class Car {
    private String color;
    private String type;
    private int number;
    private int maxSpeed;

    @Override
    public String toString() {
        return "color: " + this.color + ", maxSpeed: " + this.maxSpeed + ", number: " + this.number + ", type: " + this.type + ";";
    }

    public static class CarBuilder {

        private String color;
        private int maxSpeed;

        private static final AtomicInteger count = new AtomicInteger(0);
        private String type = "passenger";

        public CarBuilder(String color, int maxSpeed){
            this.color = color;
            this.maxSpeed = maxSpeed;
        }

        public CarBuilder color(String color){
            this.color = color;
            return this;
        }
        public CarBuilder maxSpeed(int speed){
            this.maxSpeed = speed;
            return this;
        }
        public CarBuilder type(String type){
            this.type = type;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
    private Car(CarBuilder builder) {
        this.color = builder.color;
        this.type = builder.type;
        this.maxSpeed = builder.maxSpeed;
        this.number = builder.count.incrementAndGet();
    }
}
