package com.lgrus.SandBoxTests.services;

import com.lgrus.SandBoxTests.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class UserDummyService {
    public List<User> fetchAllUsers(){
        return Stream.of(
                new User("Hovnak", "Most"),
                new User("Luda", "MB"),
                new User("Sabca", "PRG"),
                new User("Anna", "JHL")
        ).collect(Collectors.toList());
    }
}
