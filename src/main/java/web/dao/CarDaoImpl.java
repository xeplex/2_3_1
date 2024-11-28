package web.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;


import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Car> getCars() {
        return sessionFactory.getCurrentSession().createQuery("from Car").getResultList();
    }

    @Override
    public void saveCar(Car car) {
        sessionFactory.getCurrentSession().saveOrUpdate(car);
    }

    @Override
    public Car getCar(int id) {
        return sessionFactory.getCurrentSession().get(Car.class, id);
    }

    @Override
    public void deleteCar(int id) {
        sessionFactory.getCurrentSession()
                .createQuery("delete from Car where id = :carId")
                .setParameter("userId", id)
                .executeUpdate();
    }
}
