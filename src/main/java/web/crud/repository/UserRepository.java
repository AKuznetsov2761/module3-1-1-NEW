package web.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.crud.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail (String email);

    User getUserByName(String name);

    void createUser(User user);

    List<User> getAllUser();

    User getUserById(long id);

    void updateUser(long id, User updatedUser);

    void deleteUser(long id);
}
