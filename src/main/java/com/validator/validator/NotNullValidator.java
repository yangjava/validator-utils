package com.validator.validator;


import com.validator.exception.ValidatorException;

import java.util.Collection;
import java.util.Map;

public class NotNullValidator {

    private final static String NotNullErrorMsg = "非空校验失败";

    public static void notNull(Object value,String message){
        try {
        if(value==null){
            throw  new ValidatorException(message);
        }
         if(value instanceof String){
             if(isNull((String)value,message)){
                 throw  new ValidatorException(message);
             };
         }
         else if (value instanceof Number) {
             if(isNull((Number)value,message)){
                 throw  new ValidatorException(message);
             };
         } else if (value instanceof Collection) {
             if(isNull((Collection)value,message)){
                 throw  new ValidatorException(message);
             };
         } else if (value instanceof Map) {
             if(isNull((Map)value,message)){
                 throw  new ValidatorException(message);
             };
         } else if (value instanceof Object[]) {
             if(isNull((Object[])value,message)){
                 throw  new ValidatorException(message);
             };
         }}catch (ValidatorException e) {
            throw new ValidatorException(message);
         }

    }




    public static void notNull(Object value){
        notNull(value,NotNullErrorMsg);
    }


    public static Boolean isNull(String value,String message){
        return value == null || value.length() == 0;
    }
    public static Boolean isNull(Number value,String message){
        return value == null;
    }
    public static Boolean isNull(Collection value,String message){
        return value == null || value.isEmpty();
    }
    public static Boolean isNull(Map value,String message){
        return null == value || value.isEmpty();
    }
    public static Boolean isNull(Object[] value,String message){
        return null == value || value.length == 0;
    }


}
