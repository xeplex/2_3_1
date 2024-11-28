package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Transactional
    @Override
    public void saveCar(Car car) {
        carDao.saveCar(car);
    }

    @Transactional
    @Override
    public Car getCar(int id) {
        return carDao.getCar(id);
    }

    @Transactional
    @Override
    public void deleteCar(int id) {
        carDao.deleteCar(id);
    }
}
