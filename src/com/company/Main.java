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

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        Engine engine = new Engine();
        engine.setEngineName("Tesla");
        engine.setEnginePower(500);
        car.setEngine(engine);

        Transmission transmission = new Transmission();
        transmission.setTypeOfTransmission("Auto");
        transmission.setCarDrive("All_wheel_drive");
        car.setTransmission(transmission);

        Wheel wheels[] = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i].setName("Michelin ");
            wheels[i].setDiameter(20);
            wheels[i].setWidth(10);
        }
        car.setWheels(wheels);
    }
}