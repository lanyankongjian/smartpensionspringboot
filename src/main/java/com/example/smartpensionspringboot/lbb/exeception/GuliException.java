package com.example.smartpensionspringboot.lbb.exeception;

/**
 * 异常类
 */
public class GuliException extends RuntimeException {

    private Integer code;//状态码

    private String msg;//异常信息

    public GuliException(){}


    public GuliException(Integer code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
