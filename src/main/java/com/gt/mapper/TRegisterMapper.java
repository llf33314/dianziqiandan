package com.gt.mapper;

import com.gt.pojo.TRegister;
import com.gt.pojo.TRegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRegisterMapper {
    int countByExample(TRegisterExample example);

    int deleteByExample(TRegisterExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(TRegister record);

    int insertSelective(TRegister record);

    List<TRegister> selectByExample(TRegisterExample example);

    TRegister selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") TRegister record, @Param("example") TRegisterExample example);

    int updateByExample(@Param("record") TRegister record, @Param("example") TRegisterExample example);

    int updateByPrimaryKeySelective(TRegister record);

    int updateByPrimaryKey(TRegister record);

	TRegister selectLogin(TRegister tRegister);
    
    
}