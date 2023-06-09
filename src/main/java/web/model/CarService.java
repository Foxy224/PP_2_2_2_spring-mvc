package web.model;

import java.util.List;

import static web.controller.CarController.cars;

public class CarService {

    public static List<Car> kolvoCars(int kolvo) {
        return cars.subList(0, kolvo);
    }
}
