package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Stream;

import java.util.List;

public interface StreamService {
    /**
     * 查看费用流水
     */
    public List<Stream> getStream();

    /**
     * 新增费用流水
     */
    public int addStream(Stream stream);
}
