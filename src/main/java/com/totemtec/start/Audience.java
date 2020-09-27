package com.totemtec.start;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

    //表演前 手机静音
    @Before("execution(* com.totemtec.start.Performance.perform(..))")
    public void silenceCellPhone(){
        System.out.println("大家把手机都静音了啊！！！");
    }

    //表演成功-clap
    @AfterReturning("execution(** com.totemtec.start.Performance.perform(..))")
    public void clap(){
        System.out.println("表演成功，鼓掌👏👏👏");
    }

    //表演失败-退款
    @AfterThrowing("execution(** com.totemtec.start.Performance.perform(..))")
    public void refund(){
        System.out.println("表演失败，退款～～～");
    }

}
