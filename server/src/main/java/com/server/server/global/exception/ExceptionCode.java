package com.server.server.global.exception;

import lombok.Getter;

public enum ExceptionCode {
    MEMBER_NOT_FOUND(404, "Member not found"),
    MEMBER_EXISTS(409, "Member exists"),
    RECIPE_NOT_FOUND(404, "Recipe not found"),
    RECOMMEND_NOT_FOUND(404, "Recommend not found"),

    INGREDIENT_NOT_FOUND(404,"Ingredient net found");

    @Getter
    private int status;

    @Getter
    private String message;

    ExceptionCode(int code, String message) {
        this.status = code;
        this.message = message;
    }
}