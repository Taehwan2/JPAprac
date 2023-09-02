package com.example.JPAPRAC.repository;

import com.example.JPAPRAC.domain.King;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class KingRepositoryTest {

        @Autowired
        private KingRepository kingRepository;

        @Test
        void crud(){
            System.out.println(kingRepository.findById(1L).get().getName());
        }
        @Test
        void crud2() {
                // 엔터티 생성
                King king1 = King.builder()
                        .name("태태")
                        .email("eas@gmail.com")
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .build();

                // 엔터티 저장
                kingRepository.save(king1);

                // 저장된 엔터티 조회
                Optional<King> retrievedKing = kingRepository.findById(1L);

                assertTrue(retrievedKing.isPresent());
                assertEquals("태태", retrievedKing.get().getName());

                // 다른 엔터티들도 추가로 생성, 저장 및 조회 가능
        }

}