package com.totemtec.start;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {
    public void perform() {
        System.out.println("===============表演111===============");
        System.out.println("===============表演222===============");
        System.out.println("===============表演333===============");
    }

    public void actorPerform(String name)
    {
        System.out.println("============= " + name + " 表演===============");
    }
}
