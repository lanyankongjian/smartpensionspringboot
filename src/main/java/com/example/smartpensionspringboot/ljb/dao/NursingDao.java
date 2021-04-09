package com.example.smartpensionspringboot.ljb.dao;

import com.example.smartpensionspringboot.ljb.pojos.RecNursing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NursingDao {

    public void addNursing(RecNursing recNursing);

    public void upNursing(RecNursing recNursing);

    List<RecNursing> getNursingByOldId(@Param("oldId") long id);
}
