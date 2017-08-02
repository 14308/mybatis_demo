package com.example.demo.exception;

/**
 * Created by 陆小凤 on 2017/7/26.
 */
public class ValidationException extends  RuntimeException{
    public ValidationException(String massage,Throwable e) {
        super(massage,e);
    }
}
