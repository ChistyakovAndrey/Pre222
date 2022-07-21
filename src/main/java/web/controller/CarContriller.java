package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarContriller {
    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, HttpServletRequest request) {

        List<Car> list = new ArrayList<>();
        list.add(new Car("Tahoe", "Black", 625));
        list.add(new Car("Duster", "Black", 135));
        list.add(new Car("X6", "Blue metallic", 330));
        list.add(new Car("Matiz", "Pink", 80));
        list.add(new Car("Pathfinder", "Silver metallic", 250));

        Integer count = (request.getParameter("count") != null)
                ? Integer.parseInt(request.getParameter("count"))
                : null;
        List<Car> carList = Service.getCarsFromParams(list, count);

        model.addAttribute("carList", carList);
        return "cars";
    }
}
