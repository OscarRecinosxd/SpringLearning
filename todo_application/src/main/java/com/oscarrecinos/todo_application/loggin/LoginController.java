package com.oscarrecinos.todo_application.loggin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("username")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/login")
    public String goToLogin(){
        return "login";
    }

    @PostMapping(value="/login")
    public String goToWelcome(@RequestParam String username, String password,ModelMap model) {
        logger.debug("request param is {}");
        model.put("username", username);
        model.put("password", password);

        boolean valid = authenticationService.authenticate(username, password);

        if (valid) {
            return "WelcomePage";
        } else {
            return "login";
        }
    }

}
