package com.example.smartpensionspringboot.ljb.util;

import lombok.Data;

@Data
public class Result {
    private Boolean status = true;
    private String message;
    private int code = 200;
    private int currentPage;
    private int pageSize;
    private long total;
    private Object data;

    public Result() {
    }

    public Result(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
