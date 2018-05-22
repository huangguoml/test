
package cn.sunline.ltts.busi.iobus.servicetype.pb;

	 /**
	  * 柜员对外服务接口
	  * 柜员对外服务接口
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoTellWbSvcType", longname="柜员对外服务接口", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoTellWbSvcType {
	 /**
	  * 获取柜员信息
	  *
	  */
	public cn.sunline.ltts.busi.iobus.type.pb.IoTellComplexType.IoTlComp_TELLER tlGetInfo(String userid);
	
	 /**
	  * 获取柜员信息
	  *
	  */
	public static interface IoTlGetInfo {
	
	
	
	
	}
	 /**
	  * 检查柜员合法性
	  *
	  */
	public cn.sunline.ltts.busi.iobus.type.pb.IoTellComplexType.IoTlChkInfo_OUT chkTellerInfo(final cn.sunline.ltts.busi.iobus.type.pb.IoTellComplexType.IoTlChkInfo_IN ioTlChkInfoIn);
	
	 /**
	  * 检查柜员合法性
	  *
	  */
	public static interface IoTlChkInfo {
	
	
	
	
	}
	 /**
	  * 柜员权限检查
	  *
	  */
	public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ chkTellRole(String userid, String prcsid);
	
	 /**
	  * 柜员权限检查
	  *
	  */
	public static interface IoTlChkRole {
	
	
	
	
	}
	 /**
	  * 添加柜员信息
	  *
	  */
	public void addTellInfo(final cn.sunline.ltts.busi.iobus.type.pb.IoTellComplexType.IoTlComp_TELLER tellInput, final cn.sunline.ltts.busi.iobus.servicetype.pb.IoTellWbSvcType.IoAddTellInfo.Output output);
	
	 /**
	  * 添加柜员信息
	  *
	  */
	public static interface IoAddTellInfo {
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoAddTellInfo.Output", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Output {
 	
	 /**
	  * 柜员代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员代码")
		public String getUserid();
	 /**
	  * 柜员代码
	  *
	  */
		public void setUserid(String userid);
		
		public String toString();
	

	}
	
	
	
	}
	 /**
	  * 柜员注销
	  *
	  */
	public void updTellInfo(String userid);
	
	 /**
	  * 柜员注销
	  *
	  */
	public static interface IoUpTellInfo {
	
	
	
	
	}
	 /**
	  * 柜员签退
	  *
	  */
	public void upTellUslgst(String userid);
	
	 /**
	  * 柜员签退
	  *
	  */
	public static interface IoUserSigout {
	
	
	
	
	}
	 /**
	  * 重置柜员签到状态
	  *
	  */
	public void upTelluslgst(String userid, String passwd, cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ pswdfg);
	
	 /**
	  * 重置柜员签到状态
	  *
	  */
	public static interface IoResteUslgst {
	
	
	
	
	}
	 /**
	  * 查询柜员信息记录
	  *
	  */
	public cn.sunline.ltts.busi.iobus.type.pb.IoTellComplexType.IoTlUserInfos selUserInfoList(String userid, String userna, cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERST userst, Long pageno, Long recdct);
	
	 /**
	  * 查询柜员信息记录
	  *
	  */
	public static interface IoselUserInfo {
	
	
	
	
	}
}

