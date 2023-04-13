package com.example.userchecker.validator;

import com.example.userchecker.User;
import org.springframework.stereotype.Component;

@Component
public class UserExistsValidator implements Validator {
    @Override
    public boolean userIsValid(User user) {
        if (user.getName().equals("unknownUser")) {
            return false;
        }
        return true;
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
