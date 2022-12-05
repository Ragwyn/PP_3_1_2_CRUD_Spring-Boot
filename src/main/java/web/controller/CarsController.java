package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count,
                            ModelMap model) {
        List<String> messages = new ArrayList<>();
        CarService carService = new CarServiceImp();
        messages.add("!!!");
        messages.add("car!!! :)");
        messages.add("start");
        model.addAttribute("messages", messages);
        model.addAttribute("cars", carService.severalCars(count));
        return "cars";
    }
}
