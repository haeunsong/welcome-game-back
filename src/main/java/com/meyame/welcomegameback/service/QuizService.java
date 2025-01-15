package com.meyame.welcomegameback.service;

import com.meyame.welcomegameback.domain.Quiz;
import com.meyame.welcomegameback.dto.QuizDto;
import com.meyame.welcomegameback.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository quizRepository;

    @Transactional
    public List<QuizDto> findQuizzesByMemberId(Long memberId) {
        List<Quiz> quizzes = quizRepository.findAllByMemberId(memberId);

        return quizzes.stream()
                .map(QuizDto::from)
                .toList();
    }

}
