package com.meyame.welcomegameback.repository;

import com.meyame.welcomegameback.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
