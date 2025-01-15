package com.meyame.welcomegameback.controller;

import com.meyame.welcomegameback.dto.QuizDto;
import com.meyame.welcomegameback.service.QuizService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/quizzes")
@Tag(name = "Quiz API", description = "quiz 관련 API")
public class QuizController {

    private final QuizService quizService;

    @GetMapping("/member/{memberId}")
    @Operation(summary = "선택한 member 의 전체 퀴즈 조회", description = "선택된 member 의 전체 퀴즈를 조회합니다.")
    public ResponseEntity<List<QuizDto>> findAllByMemberId(@RequestParam("memberId") Long memberId) {
        List<QuizDto> res = quizService.findQuizzesByMemberId(memberId);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}
