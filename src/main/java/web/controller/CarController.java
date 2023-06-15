package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImlp;



@Controller
public class CarController {

    private final CarServiceImlp carServiceImlp;

    public CarController(CarServiceImlp carServiceImlp) {
        this.carServiceImlp = carServiceImlp;
    }

    @GetMapping(value = "/cars")
    public String PrintCars(ModelMap model, @RequestParam (defaultValue = "5") int count) {
        model.addAttribute("cars", carServiceImlp.ListCar(count));
        return "cars";
    }


}
