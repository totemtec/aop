package com.totemtec.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    Performance performance;


    @RequestMapping("/perform")
    public void test()
    {
        performance.perform();
    }
}
