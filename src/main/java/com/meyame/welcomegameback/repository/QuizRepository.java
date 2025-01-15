package com.meyame.welcomegameback.repository;

import com.meyame.welcomegameback.domain.Quiz;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    @EntityGraph(attributePaths = {"member"})
    List<Quiz> findAllByMemberId(Long memberId);
}
