package com.example.textchecker.repository;

import com.example.textchecker.entity.ForbiddenWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForbiddenWordRepository extends JpaRepository<ForbiddenWord, Long> {
}

