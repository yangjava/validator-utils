package com.validator;

public class ValidatorTest {

    public static void main(String[] args) {
        ValidatorUtils.builder().on("notnull").notNull("对象1 非空校验").on("").notNull(" 对象2非空校验");

    }
}
