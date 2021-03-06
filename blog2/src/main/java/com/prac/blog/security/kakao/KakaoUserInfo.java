package com.prac.blog.security.kakao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class KakaoUserInfo {
    private Long id;
    private String email;
    private String nickname;
}