
package cn.sunline.ltts.busi.iobus.servicetype.ap;

	 /**
	  * 通用数据汇报同步服务定义
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApService", longname="通用数据汇报同步服务定义", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApService {
	 /**
	  * 通用的数据汇报同步处理服务
	  *
	  */
	public String onService(String shijneir);
	
	 /**
	  * 通用的数据汇报同步处理服务
	  *
	  */
	public static interface onService {
	
	
	
	
	}
}

