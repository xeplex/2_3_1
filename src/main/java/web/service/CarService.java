package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCars();
    void saveCar(Car car);
    public Car getCar(int id);
    public void deleteCar(int id);
}
