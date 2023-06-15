package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImlp implements CarService{

    public static  List<Car> cars = new ArrayList<>();

     static {
        cars.add(new Car("vax", "lada", 227));
        cars.add(new Car("las", "mazda", 222));
        cars.add(new Car("gada", "laba", 222123));
        cars.add(new Car("veslo", "mazda3", 224322));
        cars.add(new Car("salo", "mazda7", 253622));
     }

     @Override
    public List<Car> ListCar(List<Car> cars, int value) {
        if (value > cars.size()) {
            value = cars.size();
        }
        return cars.subList(0, value);
    }
}
