package com.playground.login;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {

    public static final String PAGE = "/login";
    private static final String HTML = "login";

    @RequestMapping(value = LoginController.PAGE)
    public String top(Model model)
    {
        return LoginController.HTML;
    }
}
