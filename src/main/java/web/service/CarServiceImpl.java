package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", 2004));
        cars.add(new Car(2, "AUDI", 2012));
        cars.add(new Car(3, "Range Rover", 2017));
        cars.add(new Car(4, "BMW", 1998));
        cars.add(new Car(5, "Porsche", 2020));
    }

    @Override
    public List<Car> listCar(int count) {
        return cars.stream().limit(count).toList();
    }

    @Override
    public List<Car> listCar() {
        return cars;
    }
}
