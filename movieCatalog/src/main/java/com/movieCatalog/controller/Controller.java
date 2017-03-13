package com.movieCatalog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rdbv on 3/13/2017.
 */
@RestController
public class Controller {
    @RequestMapping("/")
    public String init() {
        return "Hello World!";
    }
}
