package com.example.JPAPRAC.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("martin@fastcampus.com");
        user.setName("martin");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        System.out.println(">>> " + user.toString());

        // Assertion 메서드를 사용하여 필드 값을 검증
        assertEquals("martin@fastcampus.com", user.getEmail());
        assertEquals("martin", user.getName());
    }
    @Test
    void test2(){
        System.out.println("hello");
    }
}