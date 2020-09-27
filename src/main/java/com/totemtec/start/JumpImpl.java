package com.totemtec.start;

import org.springframework.stereotype.Component;

@Component
public class JumpImpl implements Jump {
    public void duJump() {
        System.out.println("跳～跳～跳～");
    }
}