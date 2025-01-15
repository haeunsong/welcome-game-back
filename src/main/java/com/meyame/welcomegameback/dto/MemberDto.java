package com.meyame.welcomegameback.dto;


import com.meyame.welcomegameback.domain.Member;
import lombok.Builder;

@Builder
public record MemberDto (
        Long id,
        String name
){

    public static MemberDto from(Member member) {
        return MemberDto.builder()
                .id(member.getId())
                .name(member.getName())
                .build();
    }

}