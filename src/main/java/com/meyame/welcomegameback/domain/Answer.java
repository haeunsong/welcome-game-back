package com.meyame.welcomegameback.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // 프론트가 발행한 UUID

    @Lob
    private boolean answer; // 사용자가 작성한 답안 (O/X)

    // 여러 개의 Answer가 하나의 Quiz에 연결된다.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

}
