package service;

import dao.DAO;
import entity.User;

import java.util.List;
import java.util.Optional;

public class UserService {
private DAO dao;

    public UserService(DAO dao) {
        this.dao = dao;
    }

   public void save(User user){
        dao.save(user);
    }

    public Optional<User> getUserByEmail(String email) {

        return dao.getUserByEmail(email);
    }

    public Optional<User> getUserToShow(long id) {
        return dao.getUserToShow(id);
    }

    public void like(long who_id, int whom_id) {
        dao.like(who_id, whom_id);
    }

    public List<User> getLikedUsersList(long id) {
        return dao.getLikedUsersList(id);
    }
}
