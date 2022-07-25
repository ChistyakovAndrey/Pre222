package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private CarDaoImp carDaoImp;
    private final List<Car> carList;

    @Autowired
    public CarServiceImp(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
        carList = this.carDaoImp.getCarList();
    }

    public List<Car> getCarsByCountParam(int count) {
        return count >= 0 && count < 5 ? carList.stream().limit(count).toList() : carList;
    }

//    public List<Car> getCarList() {
//        return carList;
//    }
}
