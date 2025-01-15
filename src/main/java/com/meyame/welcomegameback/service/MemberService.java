package com.meyame.welcomegameback.service;

import com.meyame.welcomegameback.domain.Member;
import com.meyame.welcomegameback.dto.MemberDto;
import com.meyame.welcomegameback.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<MemberDto> findAllMembers() {
        List<Member> members = memberRepository.findAll();

        return members.stream()
                .map(MemberDto::from)
                .toList();
    }
}
