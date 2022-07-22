package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.ServiceImp;

@Controller
public class CarContriller {
    @GetMapping(value = "/cars")
    public String printCarsTable(Model model, Integer count) {
        new ServiceImp().getCarsFromParams(model, count);
        return "cars";
    }
}
