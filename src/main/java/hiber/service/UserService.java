package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getListUsers();

    List<User> getUserCarByModelAndSeries(String model, int series);
}
