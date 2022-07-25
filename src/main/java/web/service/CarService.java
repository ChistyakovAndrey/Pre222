package web.service;

import org.springframework.ui.Model;
import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarsByCountParam(int count);
}
