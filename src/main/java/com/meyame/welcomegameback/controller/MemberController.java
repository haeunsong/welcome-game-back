package com.meyame.welcomegameback.controller;

import com.meyame.welcomegameback.dto.MemberDto;
import com.meyame.welcomegameback.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
@Tag(name = "Member API", description = "member 관련 API (퀴즈 대상자)")
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    @Operation(summary = "전체 퀴즈 대상자 명단 조회", description = "퀴즈를 풀 사람을 택하기 위해, 먼저 전체 퀴즈 대상자를 조회합니다.")
    public ResponseEntity<List<MemberDto>> findAllMembers() {
        List<MemberDto> res = memberService.findAllMembers();
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }



}
