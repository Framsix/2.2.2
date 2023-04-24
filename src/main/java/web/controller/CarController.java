package web.controller;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping()
    public String show(@RequestParam(value = "count",defaultValue = "5") int id, Model car) {
        id = id > 5 ? 5 : id;
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada2101",2001, 100000));
        cars.add(new Car("Lada2106",2005, 120000));
        cars.add(new Car("Lada2107",2006, 140000));
        cars.add(new Car("Lada2110",2007, 160000));
        cars.add(new Car("Lada2114",2008, 180000));
        car.addAttribute("cars",carService.searchCar(id,cars));
        return "cars/carsShow";
    }

}
