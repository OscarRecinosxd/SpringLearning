package com.oscarrecinos.todo_application.loggin;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username,String password){
        if (username.equalsIgnoreCase("oscar") && password.equalsIgnoreCase("1234")) {
            return true;
        } else {
            return false;
        }
    }
    
}
