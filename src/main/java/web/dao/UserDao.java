package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAll();
    void save(User user);
    User getById(int id);
    void delete(int id);
    void update(User user, int id);
}
