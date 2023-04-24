package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    @Override
    public List<Car> searchCar(int count, List<Car> cars) {
        List<Car> cars1 = new ArrayList<>();
        if (!cars.isEmpty()) {
            for (int i = 0; i < count; i++) {
                cars1.add(cars.get(i));
            }
            return cars1;
        } else {
            return cars;
        }
    }
}
