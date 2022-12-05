package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao{
    private List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }

    @Override
    public List<Car> severalCars(int several) {
        List<Car> sevCars = new ArrayList<>();
        for(Car car : cars) {
            if (several > 0) {
                sevCars.add(car);
                several--;
            }
        }
        return sevCars;
    }
}