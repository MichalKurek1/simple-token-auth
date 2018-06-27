package pl.vrum.springBackend.Service;

import pl.vrum.springBackend.Model.User;

import java.util.Optional;

public interface UserCrudService {
    User save(User user);

    Optional<User> find(String id);

    Optional<User> findByUsername(String username);

}
