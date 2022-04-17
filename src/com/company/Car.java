package com.company;

/**
 * Создать классы с геттерами и сеттерами
 * Собрать объект класса Автомобиль!
 * Для этого, нужно разработать класс Сar, с атрибутами.
 * ВАЖНО! Мы начинаем писать более взрослые классы, т о давайте добавим пару полей из других классов,
 * например Engine, Transmission, Wheel[] (масив колес).
 * Все эти классы тоже должны содержать сеттеры и геттеры)
 * Для всех атрибутов сгенерировать методы get/set:
 * Открыть меню (или нажать alt+ins)
 * <p>
 * Обратите внимание, если мы используем геттеры/сеттеры, то поля лучше помечать private.
 */

public class Car {

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int year;
    private double price;
    private String model;

    void makeCar(String name, int price){
        Car car = new Car();


    }

}
