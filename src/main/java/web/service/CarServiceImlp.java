package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;


@Service
public class CarServiceImlp implements CarService{

    @Override
    public List<Car> ListCar(List<Car> cars, int value) {
        if (value > cars.size()) {
            value = cars.size();
        }
        return cars.subList(0, value);
    }
}
