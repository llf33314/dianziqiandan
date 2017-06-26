package com.gt.mapper;

import com.gt.pojo.TElectronMain;
import com.gt.pojo.TElectronMainExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TElectronMainMapper {
    int countByExample(TElectronMainExample example);

    int deleteByExample(TElectronMainExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(TElectronMain record);

    int insertSelective(TElectronMain record);

    List<TElectronMain> selectByExample(TElectronMainExample example);

    TElectronMain selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") TElectronMain record, @Param("example") TElectronMainExample example);

    int updateByExample(@Param("record") TElectronMain record, @Param("example") TElectronMainExample example);

    int updateByPrimaryKeySelective(TElectronMain record);

    int updateByPrimaryKey(TElectronMain record);
    
  	//分页
  	List<Map<String, Object>> pageList(Map<String, Object> params);

  	//条件电子受理单 总条数
  	int getTotalCountByMap(Map<String, Object> params);

	//回填信息
	void updateByBackfillKeySelective(TElectronMain electron);
}