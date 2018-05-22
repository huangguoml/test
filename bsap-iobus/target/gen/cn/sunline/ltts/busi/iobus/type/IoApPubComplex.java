
package cn.sunline.ltts.busi.iobus.type;

	 /**
	  * 基础平台通用对象
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface IoApPubComplex {
	 /**
	  * 业务服务实现定义表复合类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApPubComplex.KnpSvcxCt", longname="业务服务实现定义表复合类型" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface KnpSvcxCt {
 	
	 /**
	  * 业务服务类型ID
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="业务服务类型ID")
		public String getSvtpid();
	 /**
	  * 业务服务类型ID
	  *
	  */
		public void setSvtpid(String svtpid);
		
	 /**
	  * 业务服务实现关键字
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="业务服务实现关键字")
		public String getSvimky();
	 /**
	  * 业务服务实现关键字
	  *
	  */
		public void setSvimky(String svimky);
		
	 /**
	  * 业务服务实现ID
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="业务服务实现ID")
		public String getSvimid();
	 /**
	  * 业务服务实现ID
	  *
	  */
		public void setSvimid(String svimid);
		
	 /**
	  * 备注信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="备注信息")
		public String getRemark();
	 /**
	  * 备注信息
	  *
	  */
		public void setRemark(String remark);
		
		public String toString();
	

		}

}

