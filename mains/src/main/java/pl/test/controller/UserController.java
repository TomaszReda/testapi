package pl.test.controller;

import io.reflectoring.api.UsersApi;
import io.reflectoring.api.UsersApiDelegate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UsersApi {
    @Override
    public UsersApiDelegate getDelegate() {
        return null;
    }

    @Override
    public ResponseEntity<List<String>> usersGet() {
        return null;
    }
}
