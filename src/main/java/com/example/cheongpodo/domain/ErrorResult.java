package com.example.cheongpodo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResult {

    private String code;
    private String message;
}
