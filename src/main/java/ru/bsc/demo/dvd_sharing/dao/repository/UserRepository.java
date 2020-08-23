package ru.bsc.demo.dvd_sharing.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bsc.demo.dvd_sharing.dao.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public User getUserById(long id);

    public User getFirstByUsername(String username);

    public User getFirstByUsernameAndPassword(String username, String password);

}
