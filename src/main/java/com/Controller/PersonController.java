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
@RequestMapping("/person")
    public Person person(){
        Person person1 = new Person();
        person1.setAge(16);
        person1.setName("aming");
        person1.setSex('男');
        return person1;
}
}
