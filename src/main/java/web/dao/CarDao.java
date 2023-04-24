package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> searchCar(int count, List<Car> cars);
}
