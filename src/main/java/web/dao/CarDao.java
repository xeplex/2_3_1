package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getCars();
    void saveCar(Car car);
    Car getCar(int id);
    void deleteCar(int id);
}
