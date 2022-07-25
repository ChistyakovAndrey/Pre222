package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImp implements CarDao {
    private List<Car> carList;
    public CarDaoImp(){
        List<Car> list = new ArrayList<>();
        list.add(new Car("Tahoe", "Black", 625));
        list.add(new Car("Duster", "Black", 135));
        list.add(new Car("X6", "Blue metallic", 330));
        list.add(new Car("Matiz", "Pink", 80));
        list.add(new Car("Pathfinder", "Silver metallic", 250));
        carList = list;
    }
    @Override
    public List<Car> getCarList() {
        System.out.println();
        return carList;
    }
}
