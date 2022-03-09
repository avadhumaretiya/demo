package com.elasticsearch.demo.exception;

public class ESRecordNotFound extends Exception{
    public ESRecordNotFound(String message){
        super(message);
    }
}
