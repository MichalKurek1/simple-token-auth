package pl.vrum.springBackend.Service;

import pl.vrum.springBackend.Model.User;

import java.util.Optional;

public interface UserAuthenticationService {

    Optional<String> login(String username, String password);

    Optional<User> findByToken(String token);

    void logout(User user);
}

