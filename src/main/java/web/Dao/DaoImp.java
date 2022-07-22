package web.Dao;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class DaoImp implements Dao{
    private List<Car> carList;
    public DaoImp(){
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
        return carList;
    }
}
