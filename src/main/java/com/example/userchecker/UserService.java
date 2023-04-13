package com.example.userchecker;

import com.example.userchecker.validator.Validator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    final List<? extends Validator> validatorList;

    public UserService(List<? extends Validator> validatorList) {
        this.validatorList = validatorList;
    }

    public boolean validateUser(User user) {

        return validatorList.stream()
                .allMatch(validator -> validator.userIsValid(user));

    }
}
