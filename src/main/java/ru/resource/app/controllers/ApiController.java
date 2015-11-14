package ru.resource.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.resource.app.domain.services.UsefulService;

/**
 * Created by Resource on 14.11.2015.
 */

@Controller
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private UsefulService usefulService;

    @RequestMapping(
            value = "/print_string/[string]",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8"
    )
    public @ResponseBody
    String getString(String string) {
        return usefulService.usefulMethod(string);
    }
}
