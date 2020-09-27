package com.totemtec.start;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JumpIntroducer {
    @DeclareParents(value = "com.totemtec.start.Performance+", defaultImpl = JumpImpl.class)
    public static Jump jump;
}
