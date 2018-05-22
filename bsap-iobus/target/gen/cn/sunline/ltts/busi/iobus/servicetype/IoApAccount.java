
package cn.sunline.ltts.busi.iobus.servicetype;

	 /**
	  * 账号信息查询
	  * 账号信息查询
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApAccount", longname="账号信息查询", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApAccount {
	 /**
	  * 查询账号类型
	  *
	  */
	public void queryAccountType(String acctno, final cn.sunline.ltts.busi.iobus.servicetype.IoApAccount.queryAccountType.Output output);
	
	 /**
	  * 查询账号类型
	  *
	  */
	public static interface queryAccountType {
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="queryAccountType.Output", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Output {
 	
	 /**
	  * 账号类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="账号类型")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_ACCTTP getAccttp();
	 /**
	  * 账号类型
	  *
	  */
		public void setAccttp(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_ACCTTP accttp);
		
		public String toString();
	

	}
	
	
	
	}
}

