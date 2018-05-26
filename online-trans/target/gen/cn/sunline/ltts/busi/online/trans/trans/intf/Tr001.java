
package cn.sunline.ltts.busi.online.trans.trans.intf;

@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface Tr001 {
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="tr001.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Input {
 	
	 /**
	  * 用户名
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="用户名")
		public String getUsername();
	 /**
	  * 电话
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="电话")
		public String getTelphone();
	 /**
	  * 地址
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="地址")
		public String getAddress();
		public String toString();
	

	}
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="tr001.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface InputSetter extends Input {
	 /**
	  * 用户名
	  *
	  */
		public void setUsername(String username);
	 /**
	  * 电话
	  *
	  */
		public void setTelphone(String telphone);
	 /**
	  * 地址
	  *
	  */
		public void setAddress(String address);
	}
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="tr001.Output", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Output {
 	
	 /**
	  * 客户号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户号")
		public String getCustno();
	 /**
	  * 客户号
	  *
	  */
		public void setCustno(String custno);
		
		public String toString();
	

	}
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="tr001.Property", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Property {
 	
	 /**
	  * 客户号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户号")
		public String getCustno();
	 /**
	  * 客户号
	  *
	  */
		public void setCustno(String custno);
		
		public String toString();
	

	}
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="tr001.Printer", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Printer {
 	
	

	}
	
}

