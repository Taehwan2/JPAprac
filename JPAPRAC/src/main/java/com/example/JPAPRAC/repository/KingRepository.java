package com.example.JPAPRAC.repository;

import com.example.JPAPRAC.domain.King;
import com.example.JPAPRAC.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KingRepository extends JpaRepository<King,Long> {

}
