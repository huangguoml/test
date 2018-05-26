
package cn.sunline.ltts.busi.online.trans.servicetype;

	 /**
	  * 存储客户信息
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="SaveCustInfo", longname="存储客户信息", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface SaveCustInfo {
	 /**
	  * 添加客户服务
	  *
	  */
	public void addCustomer(final cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo.createCust.Input input, final cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo.createCust.Output output);
	
	 /**
	  * 添加客户服务
	  *
	  */
	public static interface createCust {
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="createCust.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
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
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="createCust.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
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
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="createCust.Output", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
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
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="createCust.Printer", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 开户服务
	  *
	  */
	public void addAcctInfo(final cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo.createAcct.Input input, final cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo.createAcct.Output output);
	
	 /**
	  * 开户服务
	  *
	  */
	public static interface createAcct {
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="createAcct.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Input {
 	
	 /**
	  * 客户号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户号")
		public String getCustno();
		public String toString();
	

	}
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="createAcct.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface InputSetter extends Input {
	 /**
	  * 客户号
	  *
	  */
		public void setCustno(String custno);
	}
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="createAcct.Output", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Output {
 	
	 /**
	  * 账户号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="账户号")
		public String getAccoutno();
	 /**
	  * 账户号
	  *
	  */
		public void setAccoutno(String accoutno);
		
		public String toString();
	

	}
	
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="createAcct.Printer", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Printer {
 	
	

	}
	
	}
}

