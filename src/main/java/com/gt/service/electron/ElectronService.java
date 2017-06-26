/** 
 * <pre>项目名称:electron 
 * 文件名称:ElectronService.java 
 * 包名:com.gt.service.electron 
 * 创建日期:2017年5月22日下午2:43:06 
 * Copyright (c) 2017, chenjh123@gmail.com All Rights Reserved.</pre> 
 */  
package com.gt.service.electron;

import java.util.Map;

import com.gt.pojo.TElectronMain;
import com.gt.util.Page;



/** 
 * <pre>项目名称：electron    
 * 类名称：ElectronService    
 * 类描述：     电子受理单
 * 创建人：王博 1048595679@qq.com  
 * 创建时间：2017年5月22日 下午2:43:06    
 * 修改人：王博 z1048595679@qq.com     
 * 修改时间：2017年5月22日 下午2:43:06    
 * 修改备注：       
 * @version </pre>    
 */
public interface ElectronService {

	void insertElectron(TElectronMain electron);

	void updateElectron(TElectronMain electron);

	void updateElectronByDel(TElectronMain electron);

	TElectronMain selectElectronListBYid(TElectronMain electron);

	void auditPass(TElectronMain electron);

	void deletePicture(TElectronMain electron);

	Page PageList(Map<String, Object> params);

}
