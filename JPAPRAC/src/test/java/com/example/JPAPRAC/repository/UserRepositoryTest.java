package com.example.JPAPRAC.repository;

import com.example.JPAPRAC.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.jdbc.Sql;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootTest
@Sql(scripts = {"/sql-scripts/my-test-data.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){
        userRepository.findAll().forEach(System.out::println);
    }
}
