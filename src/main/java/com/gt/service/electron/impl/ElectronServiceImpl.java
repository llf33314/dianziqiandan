/** 
 * <pre>项目名称:electron 
 * 文件名称:ElectronServiceImpl.java 
 * 包名:com.gt.service.electron.impl 
 * 创建日期:2017年5月22日下午2:43:35 
 * Copyright (c) 2017, chenjh123@gmail.com All Rights Reserved.</pre> 
 */  
package com.gt.service.electron.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.mapper.TElectronMainMapper;
import com.gt.pojo.TElectronMain;
import com.gt.service.electron.ElectronService;
import com.gt.util.Page;
import com.gt.util.CommonUtil;

/** 
 * <pre>项目名称：electron    
 * 类名称：ElectronServiceImpl    
 * 类描述：     电子受理单
 * 创建人：王博 1048595679@qq.com  
 * 创建时间：2017年5月22日 下午2:43:35    
 * 修改人：王博 z1048595679@qq.com     
 * 修改时间：2017年5月22日 下午2:43:35    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class ElectronServiceImpl implements ElectronService {

	@Autowired
	public TElectronMainMapper	tElectronMapper;
	
	
	/* 
	 *	查询 分页 电子受理单
	 */
	@Override
	public Page PageList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		int pageNum = (CommonUtil.isEmpty(params.get("pageNum")) || CommonUtil.toInteger(params.get("pageNum")) < 1) ? 1 : CommonUtil.toInteger(params.get("pageNum"));
		int pageSize = 10;
		if( params.get("size") != null && StringUtils.isNotEmpty(params.get("size").toString())){
			pageSize =  CommonUtil.toInteger(params.get("size"));
		}
		Page page = null;
		if (params.get("t_agreement") != null) {
			CommonUtil.toInteger(params.get("t_agreement"));
		}
		try {
			int rowCount = tElectronMapper.getTotalCountByMap(params);
			page = new Page(pageNum, pageSize, rowCount, "");
			params.put("pageNum", pageNum);
			params.put("start", pageSize * (pageNum - 1));
			params.put("size",pageSize);
			List<Map<String, Object>> list = tElectronMapper.pageList(params);
			page.setSubList(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return page;
	}
	
	/* 
	 * 添加 电子受理单信息
	 */
	public void insertElectron(TElectronMain electron) {
		// TODO Auto-generated method stub
		tElectronMapper.insert(electron);
	}
	
	/* 
	 * 通过ID查询电子受理单信息
	 */
	@Override
	public TElectronMain selectElectronListBYid(TElectronMain electron) {
		// TODO Auto-generated method stub
		return tElectronMapper.selectByPrimaryKey(electron.gettId());
	}
	
	/* 
	 * 修改 电子受理单信息
	 */
	@Override
	public void updateElectron(TElectronMain electron) {
		// TODO Auto-generated method stub
		tElectronMapper.updateByPrimaryKeySelective(electron);
	}
	
	/* 
	 * 删除 电子受理单信息
	 */
	@Override
	public void updateElectronByDel(TElectronMain electron) {
		// TODO Auto-generated method stub
		tElectronMapper.updateByPrimaryKeySelective(electron);
	}
	/* 
	 * 审核审批通过
	 */
	@Override
	public void auditPass(TElectronMain electron) {
		// TODO Auto-generated method stub
		tElectronMapper.updateByPrimaryKeySelective(electron);
	}
	/* 
	 * 回填图片
	 */
	@Override
	public void deletePicture(TElectronMain electron) {
		// TODO Auto-generated method stub
		electron.settIdentityCard(null);
		electron.settIdentityCard2(null);
		electron.settBusiness(null);
		electron.settSign(null);
		tElectronMapper.updateByBackfillKeySelective(electron);
	}
	
}
