
package cn.sunline.ltts.busi.iobus.servicetype.pb;

	 /**
	  * 公共服务
	  * 公共服务
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoPbCommSvr", longname="公共服务", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoPbCommSvr {
	 /**
	  * 生成并上传MDS文件接口
	  *
	  */
	public void genMDSFileList(String lstrdt);
	
	 /**
	  * 生成并上传MDS文件接口
	  *
	  */
	public static interface genMDSFileList {
	
	
	
	
	}
}

