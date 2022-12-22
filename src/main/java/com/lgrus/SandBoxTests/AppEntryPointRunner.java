package com.lgrus.SandBoxTests;

import com.lgrus.SandBoxTests.services.UserDummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppEntryPointRunner {

    private final UserDummyService userDummyService;

    @Autowired
    public AppEntryPointRunner(UserDummyService userDummyService) {
        this.userDummyService = userDummyService;
    }

    public void runApp(){
        userDummyService.fetchAllUsers().forEach(System.out::println);
        System.out.println("SUCCESS!");
    }
}

