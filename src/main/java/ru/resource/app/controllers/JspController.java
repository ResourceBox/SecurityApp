package ru.resource.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Resource on 14.11.2015.
 */

@Controller
@RequestMapping("/")
public class JspController {

    @RequestMapping(value = "/login")
    public String getLogin() {
        return "login";
    }

    @RequestMapping(value = "/app")
    public String getApp() {
        return "app";
    }

}
