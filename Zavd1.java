import java.util.ArrayList;
import java.util.Random;

public class Zavd1 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Driver> drivers = new ArrayList<>();

        // Додавання машинок
        drivers.add(new Driver("Roman", 30, 7));
        drivers.add(new Driver("Valentin", 28, 3));
        drivers.add(new Driver("Pavlo", 33, 2));
        drivers.add(new Driver("Victor", 40, 10));
        drivers.add(new Driver("Oleg", 27, 1));
        drivers.add(new Driver("Artem", 31, 8));
        drivers.add(new Driver("Oles", 35, 12));
        drivers.add(new Driver("Max", 26, 4));
        drivers.add(new Driver("Anton", 38, 5));
        drivers.add(new Driver("Igor", 29, 6));

        cars.add(new Car("Mazda", 150, drivers.get(0), 10000, 2010));
        cars.add(new Car("Toyota", 120, drivers.get(1), 8000, 2012));
        cars.add(new Car("Ford", 140, drivers.get(2), 9000, 2011));
        cars.add(new Car("Nissan", 110, drivers.get(3), 7500, 2013));
        cars.add(new Car("Chevrolet", 130, drivers.get(4), 8500, 2015));
        cars.add(new Car("Honda", 160, drivers.get(5), 11000, 2014));
        cars.add(new Car("BMW", 180, drivers.get(6), 12000, 2016));
        cars.add(new Car("Mercedes", 200, drivers.get(7), 15000, 2017));
        cars.add(new Car("Audi", 170, drivers.get(8), 13000, 2019));
        cars.add(new Car("Volkswagen", 190, drivers.get(9), 14000, 2018));

        // Ремонт мотору та заміна водіїв
        for (int i = 0; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            car.setEnginePower(car.getEnginePower() * 1.1);
            car.setDriver(drivers.get(i / 2));
        }

        // Збільшення потужності та ціни
        for (int i = 1; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            car.setEnginePower(car.getEnginePower() * 1.1);
            car.setPrice(car.getPrice() * 1.05);
        }

        // Перевірка досвіду водіїв
        for (Driver driver : drivers) {
            if (driver.getExperience() < 5 && driver.getAge() > 25) {
                driver.setExperience(driver.getExperience() + 1);
            }
        }

        // Вибір рандомного елемента
        Car randomCar = getRandomCar(cars);
        System.out.println("Автомобіль марки " + randomCar.getBrand() + " з водієм " + randomCar.getDriver().getName() + " виїхав за вами.");

        // Водій прибув на місце
        System.out.println("Водій " + randomCar.getDriver().getName() + " прибув на місце.");
    }

    public static Car getRandomCar(ArrayList<Car> cars) {
        Random random = new Random();
        int index = random.nextInt(cars.size());
        return cars.get(index);
    }
}
