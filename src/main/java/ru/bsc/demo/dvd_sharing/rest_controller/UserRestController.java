package ru.bsc.demo.dvd_sharing.rest_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bsc.demo.dvd_sharing.dao.model.User;

@RestController
public class UserRestController {

    @PostMapping("/login")
    public void login(User user){

    }


}
