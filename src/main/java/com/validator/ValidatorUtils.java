package com.validator;

import com.validator.validator.NotNullValidator;

/**
 * 数据校验的工具类
 */
public class ValidatorUtils {

    private Object value;

    private ValidatorUtils() {
    }

    public static ValidatorUtils builder(){
        return new ValidatorUtils();
    }


    public ValidatorUtils on(Object value){
        this.value = value;
        return this;
    }

    public ValidatorUtils  notNull() {
        NotNullValidator.notNull(value);
        return this;
    }

    public ValidatorUtils  notNull(String message) {
        NotNullValidator.notNull(value,message);
        return this;
    }










}
