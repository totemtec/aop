package com.totemtec.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    Performance performance;

    @RequestMapping("/perform")
    public void perform()
    {
        performance.perform();
    }

    @RequestMapping("/actor")
    public void actorPerform(
            @RequestParam String name
    )
    {
        performance.actorPerform(name);
    }

    @RequestMapping("/jump")
    public void jump()
    {
        Jump jump = (Jump)performance;
        jump.duJump();
    }
}
