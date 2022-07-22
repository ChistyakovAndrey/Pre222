package web.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.DaoImp;
import web.model.Car;
import java.util.List;

public class ServiceImp implements Service {
    private List<Car> carList = new DaoImp().getCarList();

    public Model getCarsFromParams(Model model, @RequestParam("count") Integer count) {
        if(count != null){
            List<Car> cars = count >= 0 && count < 5 ? carList.stream().limit(count).toList() : carList;
            return model.addAttribute("carList", cars);
        }
        return model.addAttribute("carList", carList);
    }

    public List<Car> getCarList() {
        return carList;
    }
}
