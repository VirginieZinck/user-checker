package com.example.userchecker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void shouldValidateUser_whenNameAndPassAreValid() {

        // GIVEN
        User user = new User();
        user.setName("myName");
        user.setPassword("myPassword");

        //WHEN
        boolean userIsValid = userService.validateUser(user);

        //THEN
        assertTrue(userIsValid);
    }


    @Test
    void shouldNotValidateUser_whenPasswordIsValid() {

        // GIVEN
        User user = new User();
        user.setName("myName");
        user.setPassword("invalidPassword");

        //WHEN
        boolean userIsValid = userService.validateUser(user);

        //THEN
        assertFalse(userIsValid);
    }


    @Test
    void shouldNotValidateUser_whenUserIsUnknown() {

        // GIVEN
        User user = new User();
        user.setName("unknownUser");
        user.setPassword("myPassword");

        //WHEN
        boolean userIsValid = userService.validateUser(user);

        //THEN
        assertFalse(userIsValid);
    }
}