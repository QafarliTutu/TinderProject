package dao;

import entity.User;

import java.util.List;
import java.util.Optional;

public interface DAO<A> {
    void save(User user);

    Optional<User> getUserByEmail(String email);

    Optional<User> getUserToShow(long id);

    void like(long who_id, int whom_id);

    List<User> getLikedUsersList(long id);
}
