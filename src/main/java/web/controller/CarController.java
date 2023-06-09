package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static web.model.CarService.kolvoCars;

@Controller
public class CarController {

    public static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("vax", "lada", 227));
        cars.add(new Car("las", "mazda", 222));
        cars.add(new Car("gada", "laba", 222123));
        cars.add(new Car("veslo", "mazda3", 224322));
        cars.add(new Car("salo", "mazda7", 253622));
    }

    @GetMapping(value = "/cars")
    public String PrintCars(ModelMap model, @RequestParam (defaultValue = "5") int count) {
        model.addAttribute("cars", kolvoCars(count));
        return "cars";
    }

}
