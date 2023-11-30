package com.example.fundyapi.service.user.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Schema(name = "로그인 토큰 Response")
public class SignInResponse {
    @Schema(description = "인증 타입", example = "Bearer")
    private String grantType;
    @Schema(description = "액세스 토큰", example = "adfadfaf123hjlafhdjkadfhjk")
    private String token;
}