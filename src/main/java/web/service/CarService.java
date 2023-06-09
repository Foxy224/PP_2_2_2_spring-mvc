package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> ListCar(List<Car> cars, int value);
}
