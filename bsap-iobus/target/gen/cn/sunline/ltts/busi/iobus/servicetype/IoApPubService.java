
package cn.sunline.ltts.busi.iobus.servicetype;

	 /**
	  * 基础平台通用业务服务
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApPubService", longname="基础平台通用业务服务", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApPubService {
	 /**
	  * 查询服务实现定义
	  *
	  */
	public cn.sunline.ltts.busi.iobus.type.IoApPubComplex.KnpSvcxCt getKnpSvcxByKey(String svtpid, String svimky);
	
	 /**
	  * 查询服务实现定义
	  *
	  */
	public static interface getKnpSvcxByKey {
	
	
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="getKnpSvcxByKey.Printer", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Printer {
 	
	

	}
	
	}
}

