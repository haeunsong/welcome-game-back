package com.meyame.welcomegameback.dto;

import com.meyame.welcomegameback.domain.Member;
import com.meyame.welcomegameback.domain.Quiz;
import lombok.Builder;

@Builder
public record QuizDto (
    Long id,
    String sentence,
    String name
) {
    public static QuizDto from(Quiz quiz) {
        return QuizDto.builder()
                .id(quiz.getId())
                .sentence(quiz.getSentence())
                .name(quiz.getMember().getName())
                .build();
    }
}
