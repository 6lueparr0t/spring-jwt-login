package com.rgbplace.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum JwtExpiration {

    ACCESS_TOKEN_EXPIRATION_TIME("JWT 만료 시간 / 1시간", 1000L * 60 * 60),
    REFRESH_TOKEN_EXPIRATION_TIME("Refresh 토큰 만료 시간 / 7일", 1000L * 60 * 60 * 24 * 7);

    private String description;
    private Long value;
}
