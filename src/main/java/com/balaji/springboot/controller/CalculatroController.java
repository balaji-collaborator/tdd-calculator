package com.balaji.springboot.controller;

import com.balaji.MyCalculator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by balaji on 8/2/18.
 */
@RestController
public class CalculatroController {

    @RequestMapping(path = "calculator/add/{number1}/{number2}")
    public long add(@PathVariable("number1") int number1, @PathVariable("number2") int number2) {
        return new MyCalculator().add(number1, number2);
    }
}
