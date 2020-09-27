package com.totemtec.start;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience2 {

    @Pointcut("execution(* com.totemtec.start.Performance.actorPerform(String)) && args(name)")
    public void per(String name){};

    @Around("per(name)")
    public void toWatch(ProceedingJoinPoint point,String name) throws Throwable {
        try{
            System.out.println(name +" 该上场啦");
            point.proceed();
            System.out.println(name +" 演出结束");
        }catch (Exception e){
            System.out.println("refund refund refund");
        }
    }
}
