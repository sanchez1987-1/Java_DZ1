package org.example;

import org.example.environment.Cat;
import org.example.technics.Car;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cat cat_obj = new Cat(10,5,"белая","Мурка","Вася");
        String name = cat_obj.getName();
        System.out.printf("Кошку зовут: %s\n",name);
        String speech = cat_obj.says();
        System.out.printf("Кошка говорит: %s\n",speech);
        String food = cat_obj.eats("мышка");
        System.out.printf("Кошкина еда: %s\n",food);
        System.out.println("--------");
        Car car_obj = new Car(4,5, (double) 1000);
        car_obj.usage();
    }
}