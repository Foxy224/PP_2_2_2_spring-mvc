package web.model;

import java.util.List;

import static web.controller.CarController.cars;

public class CarService {

    public static List<Car> kolvoCars(int kolvo) {
        if (kolvo > cars.size()) {
            kolvo = cars.size();
        }
        return cars.subList(0, kolvo);
    }
}
