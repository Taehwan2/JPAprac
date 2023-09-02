package com.example.JPAPRAC.repository;

import com.example.JPAPRAC.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
