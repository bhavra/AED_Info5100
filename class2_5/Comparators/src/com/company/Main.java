package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* int arr[]= {1,4,-5,10,3,6,1,2};
        Arrays.sort(arr);
        Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));

        String strArray[] = {"bhavs", "rak", "tirupathi"};
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
*/

        Employee bhavani = new Employee("Bhavani", 25);
        Employee rakesh = new Employee("Rakesh", 30);
        Employee tirupathi  = new Employee("Tirupathi", 55);
        Employee mark = new Employee("Mark", 10);

        Employee[] employees = { bhavani, rakesh, tirupathi, mark};
        //Arrays.sort(employees,0,employees.length-1);
        Arrays.sort(employees);
        for (Employee emp: employees){
            System.out.println(emp.name + "  Age: " + emp.age);
        }
        System.out.println(bhavani.compareTo(rakesh));


        Car mercedes = new Car("Mercedes" ,"c300" , 2022, 70000 , 1);
        Car bmw = new Car("BMW" ,"x" , 2021, 80000 , 0);
        Car acura = new Car("Acura" ,"y" , 2023, 90000 , 3);
        Car audi = new Car("Audi" ,"z" , 2020, 80000 , 7);
        Car tesla = new Car("Tesla" ,"f" , 2019, 56444 , 5);

        Car[] cars = {mercedes, bmw, acura, audi, tesla};

        Comparator<Car> comparatorMake= new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getMake().compareTo(car2.getMake());
            }
        };

        Comparator<Car> comparatorPrice = new Comparator<Car>() {
            public int  compare(Car car1, Car car2) {
                return Integer.compare(car1.getPrice(), car2.getPrice());

            }
        };

        System.out.println(cars);
        Arrays.sort(cars, comparatorMake);
        System.out.println(cars);
        Arrays.sort(cars, comparatorPrice);
    }

    private static void printCars(Car[] cars){
        System.out.println("[Make,\tPrice\tModel\tColor\tMiles Driven");
        System.out.println("[");
        for (Car car : cars) {
            System.out.println(car.getMake() + "\t"
                                car.getPrice() + "\t"
                                car.getModel() + "\t"
                                car.getColor() + "\t"
                                car.getMilesDriven());
            System.out.println("]");
        }
    }
}
