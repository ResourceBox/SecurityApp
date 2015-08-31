package ru.security.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.security.domain.model.Book;

/**
 * Created by d.mashkov on 31.08.2015.
 */

@Controller
@RequestMapping(value = "/api")
public class ApiController {

    @RequestMapping(
            value = "/book",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_PLAIN_VALUE + ";charset=utf-8"
    )
    public @ResponseBody
    String getBook() {
        return "Book";
       // return new Book("Азбука", 1000L);
    }

}
