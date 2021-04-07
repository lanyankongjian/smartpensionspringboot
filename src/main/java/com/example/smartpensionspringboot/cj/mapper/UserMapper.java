package com.example.smartpensionspringboot.cj.mapper;

import com.example.smartpensionspringboot.cj.pojos.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User Login(@Param("userName") String userName,@Param("userPass") String userPass);
}
