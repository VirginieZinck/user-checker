package com.example.userchecker.validator;

import com.example.userchecker.User;

public interface Validator {

    public boolean userIsValid(User user);

    public int getPriority();
}

