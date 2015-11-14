package ru.resource.app.domain.services;

import org.springframework.stereotype.Service;

/**
 * Created by Resource on 14.11.2015.
 */

@Service
public class UsefulServiceImpl implements UsefulService {

    @Override
    public String usefulMethod(String parameter) {
        return "String: " + parameter;
    }
}
