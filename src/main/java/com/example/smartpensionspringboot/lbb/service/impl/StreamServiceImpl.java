package com.example.smartpensionspringboot.lbb.service.impl;

import com.example.smartpensionspringboot.lbb.dao.StreamDao;
import com.example.smartpensionspringboot.lbb.exeception.GuliException;
import com.example.smartpensionspringboot.lbb.pojos.Stream;
import com.example.smartpensionspringboot.lbb.service.StreamService;
import com.example.smartpensionspringboot.lbb.vo.StreamVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class StreamServiceImpl implements StreamService {
    @Autowired
    private StreamDao streamDao;

    /**
     * 查看费用流水
     * @return
     */
    @Override
    public List<Stream> getStream() {
        return streamDao.getStream();
    }

    /**
     * 新增费用流水
     * @return
     */
    @Transactional
    @Override
    public int addStream(Stream stream) {
        int i = streamDao.addStream(stream);
        if (i > 0){
            return i;
        }else{
            throw new GuliException(201,"新增费用流水失败");
        }
    }

    /**
     * 搜索费用流水
     * @param vo
     * @return
     */
    @Override
    public List<Stream> getStreamBySearch(StreamVo vo) {
        return streamDao.getStreamBySearch(vo);
    }
}
