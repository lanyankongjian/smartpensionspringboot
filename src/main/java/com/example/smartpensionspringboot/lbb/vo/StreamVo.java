package com.example.smartpensionspringboot.lbb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Arrays;

/**
 * 费用流水vo对象
 */
public class StreamVo {
    private String old_name;
    private String category_name;

    public StreamVo() {
    }

    public StreamVo(String old_name, String category_name) {
        this.old_name = old_name;
        this.category_name = category_name;
    }

    public String getOld_name() {
        return old_name;
    }

    public void setOld_name(String old_name) {
        this.old_name = old_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return "StreamVo{" +
                "old_name='" + old_name + '\'' +
                ", category_name='" + category_name + '\'' +
                '}';
    }
}
