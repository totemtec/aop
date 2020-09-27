package com.totemtec.start;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JumpIntroducer {

    // org.aspectj.weaver.reflect.ReflectionWorld$ReflectionWorldException:
    // warning can't determine implemented interfaces of missing type
    // org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration$$Lambda$406.29369803
    @DeclareParents(value = "com.totemtec.start.Performance+", defaultImpl = JumpImpl.class)

    // work fine
//    @DeclareParents(value = "com.totemtec.start.PerformanceImpl", defaultImpl = JumpImpl.class)
    public static Jump jump;
}
