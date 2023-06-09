package com.example.demo.global.error;

import com.example.demo.global.error.exception.ErrorCode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {

    private String message;
    private String code;

    private ErrorResponse(final ErrorCode code) {

        this.message = code.getMessage();
        this.code = code.getCode();
    }

    public static ErrorResponse of(final ErrorCode code) {

        return new ErrorResponse(code);
    }
}
