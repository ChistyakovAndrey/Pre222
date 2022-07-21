package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public static List<Car> getCarsFromParams(List<Car> cars, Integer count) {
        List<Car> list = new ArrayList<>();
        if(count == null){
            return cars;
        }
        if (count > 0) {
            if (count < 5) {
                for (int i = 0; i < count; i++) {
                    list.add(cars.get(i));
                }
            } else {
                return cars;
            }
        }
        else{
            return cars;
        }
        return list;
    }
}
