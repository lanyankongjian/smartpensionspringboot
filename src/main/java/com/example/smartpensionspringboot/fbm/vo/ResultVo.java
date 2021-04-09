package com.example.smartpensionspringboot.fbm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ResultVo {

    private Integer code;
    private String message;
    private Object  data;

    public ResultVo() {
    }

    public ResultVo(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
