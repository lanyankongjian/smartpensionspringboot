package com.example.smartpensionspringboot.lbb.service;

import com.example.smartpensionspringboot.lbb.pojos.Stream;
import com.example.smartpensionspringboot.lbb.vo.StreamVo;

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

    /**
     * 搜索费用流水
     * @param vo
     * @return
     */
    public List<Stream> getStreamBySearch(StreamVo vo);
}
