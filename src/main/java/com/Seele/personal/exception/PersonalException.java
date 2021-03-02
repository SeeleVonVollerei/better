package com.Seele.personal.exception;

public class PersonalException extends RuntimeException {
    public static final String DEFAULT_EXCEPTION_CODE = "1501";
    private String code = "1501";

    public PersonalException() {
    }

    public PersonalException(String msg) {
        super(msg);
    }

    public PersonalException(String code, String msg) {
        super(msg);
        this.setCode(code);
    }

    public PersonalException(Throwable throwable) {
        super(throwable);
    }

    public PersonalException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public PersonalException(String code, String msg, Throwable throwable) {
        super(msg, throwable);
        this.setCode(code);
    }

    public PersonalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
