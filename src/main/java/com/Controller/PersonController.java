package com.Controller;

import com.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aming
 */
@RestController
public class PersonController {
@Autowired
Person person;
@RequestMapping("/hello")
    public String hello(){
    return person.toString();
}
}
