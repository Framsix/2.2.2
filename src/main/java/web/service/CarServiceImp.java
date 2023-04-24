package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    private final CarDao carDao;
    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> searchCar(int count, List<Car> cars) {
        return carDao.searchCar(count,cars);
    }
}
