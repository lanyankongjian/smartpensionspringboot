package com.example.smartpensionspringboot.liqing.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 页面类
 *
 * @param <T>
 */
public class Pager<T> {
    private Integer pageNum = 1;
    private Integer pageSize = 10;
    private Long total = 0L;
    private List<T> rows = new ArrayList<>();

    public Pager(Integer pageNum, Integer pageSize) {
        this.setPageNum(pageNum);
        this.setPageSize(pageSize);
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if (pageNum != null) {
            this.pageNum = pageNum;
        }
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize != null) {
            this.pageSize = pageSize;
        }
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
