package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarContriller {
    private final CarServiceImp carServiceImp;

    @Autowired
    public CarContriller(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String printCarsTable(Model model, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> carList = carServiceImp.getCarsByCountParam(count);
        model.addAttribute("carList", carList);
        return "cars";
    }
}
