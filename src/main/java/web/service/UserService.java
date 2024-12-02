package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    void save(User user);
    User getById(int id);
    void delete(int id);
    void update(User user, int id);
}
