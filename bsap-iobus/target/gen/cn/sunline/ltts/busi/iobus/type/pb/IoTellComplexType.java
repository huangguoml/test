
package cn.sunline.ltts.busi.iobus.type.pb;

	 /**
	  * 柜员对外复合类型
	  * 柜员对外复合类型
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface IoTellComplexType {
	 /**
	  * 柜员信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoTellComplexType.IoTlComp_TELLER", longname="柜员信息" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoTlComp_TELLER {
 	
	 /**
	  * 法人代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="法人代码")
		public String getCorpno();
	 /**
	  * 法人代码
	  *
	  */
		public void setCorpno(String corpno);
		
	 /**
	  * 柜员代号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员代号")
		public String getUserid();
	 /**
	  * 柜员代号
	  *
	  */
		public void setUserid(String userid);
		
	 /**
	  * 柜员姓名
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员姓名")
		public String getUserna();
	 /**
	  * 柜员姓名
	  *
	  */
		public void setUserna(String userna);
		
	 /**
	  * 柜员属性
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员属性")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USFORM getUsform();
	 /**
	  * 柜员属性
	  *
	  */
		public void setUsform(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USFORM usform);
		
	 /**
	  * 所属部门
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="所属部门")
		public String getBrchno();
	 /**
	  * 所属部门
	  *
	  */
		public void setBrchno(String brchno);
		
	 /**
	  * 级别
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="级别")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERLV getUserlv();
	 /**
	  * 级别
	  *
	  */
		public void setUserlv(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERLV userlv);
		
	 /**
	  * 客户经理标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户经理标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getManage();
	 /**
	  * 客户经理标志
	  *
	  */
		public void setManage(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ manage);
		
	 /**
	  * 启用日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="启用日期")
		public String getStatdt();
	 /**
	  * 启用日期
	  *
	  */
		public void setStatdt(String statdt);
		
	 /**
	  * 终止日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="终止日期")
		public String getStopdt();
	 /**
	  * 终止日期
	  *
	  */
		public void setStopdt(String stopdt);
		
	 /**
	  * 柜员启用标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员启用标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getUsusfg();
	 /**
	  * 柜员启用标志
	  *
	  */
		public void setUsusfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ ususfg);
		
	 /**
	  * 柜员状态
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员状态")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERST getUserst();
	 /**
	  * 柜员状态
	  *
	  */
		public void setUserst(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERST userst);
		
	 /**
	  * 备用字段1
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="备用字段1")
		public String getResefl();
	 /**
	  * 备用字段1
	  *
	  */
		public void setResefl(String resefl);
		
	 /**
	  * 维护日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="维护日期")
		public String getDatetm();
	 /**
	  * 维护日期
	  *
	  */
		public void setDatetm(String datetm);
		
	 /**
	  * 时间戳
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="时间戳")
		public Long getTimetm();
	 /**
	  * 时间戳
	  *
	  */
		public void setTimetm(Long timetm);
		
	 /**
	  * 柜员角色代码
	  * 柜员角色代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员角色代码")
		public String getUsrole();
	 /**
	  * 柜员角色代码
	  * 柜员角色代码
	  *
	  */
		public void setUsrole(String usrole);
		
	 /**
	  * 柜员类型
	  * 柜员类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员类型")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERTP getUsertp();
	 /**
	  * 柜员类型
	  * 柜员类型
	  *
	  */
		public void setUsertp(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERTP usertp);
		
	 /**
	  * 员工编号
	  * 员工编号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="员工编号")
		public String getUsercd();
	 /**
	  * 员工编号
	  * 员工编号
	  *
	  */
		public void setUsercd(String usercd);
		
	 /**
	  * 客户号
	  * 客户号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户号")
		public String getCustno();
	 /**
	  * 客户号
	  * 客户号
	  *
	  */
		public void setCustno(String custno);
		
	 /**
	  * 风险级别
	  * 风险级别
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="风险级别")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USRKLV getUsrklv();
	 /**
	  * 风险级别
	  * 风险级别
	  *
	  */
		public void setUsrklv(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USRKLV usrklv);
		
	 /**
	  * 柜员介质标识
	  * 柜员介质标识
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员介质标识")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USLGTP getUslgtp();
	 /**
	  * 柜员介质标识
	  * 柜员介质标识
	  *
	  */
		public void setUslgtp(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USLGTP uslgtp);
		
	 /**
	  * 授权卡号
	  * 授权卡号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="授权卡号")
		public String getAucdno();
	 /**
	  * 授权卡号
	  * 授权卡号
	  *
	  */
		public void setAucdno(String aucdno);
		
	 /**
	  * 柜员卡序号
	  * 柜员卡序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员卡序号")
		public String getUscdid();
	 /**
	  * 柜员卡序号
	  * 柜员卡序号
	  *
	  */
		public void setUscdid(String uscdid);
		
	 /**
	  * 柜员密码
	  * 柜员密码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员密码")
		public String getPasswd();
	 /**
	  * 柜员密码
	  * 柜员密码
	  *
	  */
		public void setPasswd(String passwd);
		
	 /**
	  * 密码修改日期
	  * 密码修改日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="密码修改日期")
		public String getPwdmdt();
	 /**
	  * 密码修改日期
	  * 密码修改日期
	  *
	  */
		public void setPwdmdt(String pwdmdt);
		
	 /**
	  * 密码有效天数
	  * 密码有效天数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="密码有效天数")
		public Integer getVlidts();
	 /**
	  * 密码有效天数
	  * 密码有效天数
	  *
	  */
		public void setVlidts(Integer vlidts);
		
	 /**
	  * 密码不可重复次数
	  * 密码不可重复次数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="密码不可重复次数")
		public Integer getUnrpct();
	 /**
	  * 密码不可重复次数
	  * 密码不可重复次数
	  *
	  */
		public void setUnrpct(Integer unrpct);
		
	 /**
	  * 密码允许错误次数
	  * 密码允许错误次数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="密码允许错误次数")
		public Integer getPwaect();
	 /**
	  * 密码允许错误次数
	  * 密码允许错误次数
	  *
	  */
		public void setPwaect(Integer pwaect);
		
	 /**
	  * 密码错误次数
	  * 密码错误次数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="密码错误次数")
		public Integer getPwerct();
	 /**
	  * 密码错误次数
	  * 密码错误次数
	  *
	  */
		public void setPwerct(Integer pwerct);
		
	 /**
	  * 现金尾箱总限额
	  * 现金尾箱总限额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="现金尾箱总限额")
		public java.math.BigDecimal getLachbx();
	 /**
	  * 现金尾箱总限额
	  * 现金尾箱总限额
	  *
	  */
		public void setLachbx(java.math.BigDecimal lachbx);
		
	 /**
	  * 币种控制标志
	  * 币种控制标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="币种控制标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getCyctfg();
	 /**
	  * 币种控制标志
	  * 币种控制标志
	  *
	  */
		public void setCyctfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ cyctfg);
		
	 /**
	  * 币种同步标志
	  * 币种同步标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="币种同步标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getCysyfg();
	 /**
	  * 币种同步标志
	  * 币种同步标志
	  *
	  */
		public void setCysyfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ cysyfg);
		
	 /**
	  * 交易组别列表
	  * 交易组别列表
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易组别列表")
		public String getGptrls();
	 /**
	  * 交易组别列表
	  * 交易组别列表
	  *
	  */
		public void setGptrls(String gptrls);
		
	 /**
	  * 授权组别列表
	  * 授权组别列表
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="授权组别列表")
		public String getGpauls();
	 /**
	  * 授权组别列表
	  * 授权组别列表
	  *
	  */
		public void setGpauls(String gpauls);
		
	 /**
	  * 产品交易列表
	  * 产品交易列表
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="产品交易列表")
		public String getPdtrls();
	 /**
	  * 产品交易列表
	  * 产品交易列表
	  *
	  */
		public void setPdtrls(String pdtrls);
		
	 /**
	  * 产品授权列表
	  * 产品授权列表
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="产品授权列表")
		public String getPdauls();
	 /**
	  * 产品授权列表
	  * 产品授权列表
	  *
	  */
		public void setPdauls(String pdauls);
		
	 /**
	  * 删减交易
	  * 删减交易
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="删减交易")
		public String getRedutr();
	 /**
	  * 删减交易
	  * 删减交易
	  *
	  */
		public void setRedutr(String redutr);
		
	 /**
	  * 删减产品
	  * 删减产品
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="删减产品")
		public String getRedupd();
	 /**
	  * 删减产品
	  * 删减产品
	  *
	  */
		public void setRedupd(String redupd);
		
	 /**
	  * 签到时间
	  * 签到时间
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="签到时间")
		public String getUsintm();
	 /**
	  * 签到时间
	  * 签到时间
	  *
	  */
		public void setUsintm(String usintm);
		
	 /**
	  * 签退时间
	  * 签退时间
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="签退时间")
		public String getUsoutm();
	 /**
	  * 签退时间
	  * 签退时间
	  *
	  */
		public void setUsoutm(String usoutm);
		
	 /**
	  * 性别
	  * 性别
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="性别")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_SEXTYP getTmnlid();
	 /**
	  * 性别
	  * 性别
	  *
	  */
		public void setTmnlid(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_SEXTYP tmnlid);
		
	 /**
	  * 家庭住址
	  * 家庭住址
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="家庭住址")
		public String getTmnlip();
	 /**
	  * 家庭住址
	  * 家庭住址
	  *
	  */
		public void setTmnlip(String tmnlip);
		
	 /**
	  * 柜员日结标记
	  * 柜员日结标记
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员日结标记")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getUsdtfg();
	 /**
	  * 柜员日结标记
	  * 柜员日结标记
	  *
	  */
		public void setUsdtfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ usdtfg);
		
	 /**
	  * 柜员在会计系统日结标志
	  * 柜员在会计系统日结标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员在会计系统日结标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getUsacfg();
	 /**
	  * 柜员在会计系统日结标志
	  * 柜员在会计系统日结标志
	  *
	  */
		public void setUsacfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ usacfg);
		
	 /**
	  * 柜员权限状态
	  * 柜员权限状态
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员权限状态")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USPRST getUsprst();
	 /**
	  * 柜员权限状态
	  * 柜员权限状态
	  *
	  */
		public void setUsprst(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USPRST usprst);
		
	 /**
	  * 柜员签到状态
	  * 柜员签到状态
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员签到状态")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USLGST getUslgst();
	 /**
	  * 柜员签到状态
	  * 柜员签到状态
	  *
	  */
		public void setUslgst(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USLGST uslgst);
		
	 /**
	  * 柜员会计系统签到状态
	  * 柜员会计系统签到状态
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员会计系统签到状态")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USLGST getUsacst();
	 /**
	  * 柜员会计系统签到状态
	  * 柜员会计系统签到状态
	  *
	  */
		public void setUsacst(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USLGST usacst);
		
	 /**
	  * 序列号
	  * 序列号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="序列号")
		public String getSerino();
	 /**
	  * 序列号
	  * 序列号
	  *
	  */
		public void setSerino(String serino);
		
		public String toString();
	

		}
	 /**
	  * 柜员合法性检查
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoTellComplexType.IoTlChkInfo_IN", longname="柜员合法性检查" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoTlChkInfo_IN {
 	
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
		
	 /**
	  * 柜员密码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员密码")
		public String getPasswd();
	 /**
	  * 柜员密码
	  *
	  */
		public void setPasswd(String passwd);
		
	 /**
	  * 柜员是否启用
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员是否启用")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getUsusfg();
	 /**
	  * 柜员是否启用
	  *
	  */
		public void setUsusfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ ususfg);
		
	 /**
	  * 终止日期标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="终止日期标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getStopfg();
	 /**
	  * 终止日期标志
	  *
	  */
		public void setStopfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ stopfg);
		
	 /**
	  * 是否常用密码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="是否常用密码")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getEspdfg();
	 /**
	  * 是否常用密码
	  *
	  */
		public void setEspdfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ espdfg);
		
	 /**
	  * 终止日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="终止日期")
		public String getStopdt();
	 /**
	  * 终止日期
	  *
	  */
		public void setStopdt(String stopdt);
		
	 /**
	  * 柜员是否存在
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员是否存在")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getUsexfg();
	 /**
	  * 柜员是否存在
	  *
	  */
		public void setUsexfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ usexfg);
		
	 /**
	  * 密码检查标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="密码检查标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getPswdfg();
	 /**
	  * 密码检查标志
	  *
	  */
		public void setPswdfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ pswdfg);
		
		public String toString();
	

		}
	 /**
	  * 柜员合法性检查
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoTellComplexType.IoTlChkInfo_OUT", longname="柜员合法性检查" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoTlChkInfo_OUT {
 	
	 /**
	  * 柜员为空标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员为空标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getUsnufg();
	 /**
	  * 柜员为空标志
	  *
	  */
		public void setUsnufg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ usnufg);
		
	 /**
	  * 柜员存在标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员存在标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getUsexfg();
	 /**
	  * 柜员存在标志
	  *
	  */
		public void setUsexfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ usexfg);
		
	 /**
	  * 密码检查标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="密码检查标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getPwsdfg();
	 /**
	  * 密码检查标志
	  *
	  */
		public void setPwsdfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ pwsdfg);
		
	 /**
	  * 柜员启用标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员启用标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getUsusfg();
	 /**
	  * 柜员启用标志
	  *
	  */
		public void setUsusfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ ususfg);
		
	 /**
	  * 终止日期标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="终止日期标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getStopfg();
	 /**
	  * 终止日期标志
	  *
	  */
		public void setStopfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ stopfg);
		
	 /**
	  * 常用密码标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="常用密码标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getEpwdfg();
	 /**
	  * 常用密码标志
	  *
	  */
		public void setEpwdfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ epwdfg);
		
		public String toString();
	

		}
	 /**
	  * 柜员密码修改
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoTellComplexType.IoTlChgPasswd", longname="柜员密码修改" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoTlChgPasswd {
 	
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
		
	 /**
	  * 柜员旧密码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员旧密码")
		public String getPasswd();
	 /**
	  * 柜员旧密码
	  *
	  */
		public void setPasswd(String passwd);
		
	 /**
	  * 柜员新密码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员新密码")
		public String getNwpswd();
	 /**
	  * 柜员新密码
	  *
	  */
		public void setNwpswd(String nwpswd);
		
		public String toString();
	

		}
	 /**
	  * 柜员登陆输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoTellComplexType.IoTlLogin_IN", longname="柜员登陆输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoTlLogin_IN {
 	
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
		
	 /**
	  * 柜员密码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员密码")
		public String getPasswd();
	 /**
	  * 柜员密码
	  *
	  */
		public void setPasswd(String passwd);
		
	 /**
	  * 密码检查标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="密码检查标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getPswdfg();
	 /**
	  * 密码检查标志
	  *
	  */
		public void setPswdfg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ pswdfg);
		
		public String toString();
	

		}
	 /**
	  * 柜员登陆输出
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoTellComplexType.IoTlLogin_OUT", longname="柜员登陆输出" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoTlLogin_OUT {
 	
	 /**
	  * 柜员代码
	  * 柜员
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员代码")
		public String getUserid();
	 /**
	  * 柜员代码
	  * 柜员
	  *
	  */
		public void setUserid(String userid);
		
	 /**
	  * 柜员姓名
	  * 柜员姓名
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员姓名")
		public String getUserna();
	 /**
	  * 柜员姓名
	  * 柜员姓名
	  *
	  */
		public void setUserna(String userna);
		
	 /**
	  * 所属部门
	  * 所属部门
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="所属部门")
		public String getBrchno();
	 /**
	  * 所属部门
	  * 所属部门
	  *
	  */
		public void setBrchno(String brchno);
		
	 /**
	  * 柜员角色代码
	  * 柜员角色代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员角色代码")
		public String getUsrole();
	 /**
	  * 柜员角色代码
	  * 柜员角色代码
	  *
	  */
		public void setUsrole(String usrole);
		
	 /**
	  * 系统日期
	  * 系统日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="系统日期")
		public String getSystdt();
	 /**
	  * 系统日期
	  * 系统日期
	  *
	  */
		public void setSystdt(String systdt);
		
		public String toString();
	

		}
	 /**
	  * 柜员信息输出
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoTellComplexType.IoTlUserInfo", longname="柜员信息输出" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoTlUserInfo {
 	
	 /**
	  * 柜员代码
	  * 柜员
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员代码")
		public String getUserid();
	 /**
	  * 柜员代码
	  * 柜员
	  *
	  */
		public void setUserid(String userid);
		
	 /**
	  * 柜员姓名
	  * 柜员姓名
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员姓名")
		public String getUserna();
	 /**
	  * 柜员姓名
	  * 柜员姓名
	  *
	  */
		public void setUserna(String userna);
		
	 /**
	  * 柜员密码
	  * 交易密码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员密码")
		public String getPasswd();
	 /**
	  * 柜员密码
	  * 交易密码
	  *
	  */
		public void setPasswd(String passwd);
		
	 /**
	  * 所属部门
	  * 所属部门
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="所属部门")
		public String getBrchno();
	 /**
	  * 所属部门
	  * 所属部门
	  *
	  */
		public void setBrchno(String brchno);
		
	 /**
	  * 密码允许错误次数
	  * 密码允许错误次数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="密码允许错误次数")
		public Integer getPwaect();
	 /**
	  * 密码允许错误次数
	  * 密码允许错误次数
	  *
	  */
		public void setPwaect(Integer pwaect);
		
	 /**
	  * 柜员状态
	  * 柜员状态
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员状态")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERST getUserst();
	 /**
	  * 柜员状态
	  * 柜员状态
	  *
	  */
		public void setUserst(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERST userst);
		
	 /**
	  * 柜员签到状态
	  * 柜员签到状态
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员签到状态")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USLGST getUslgst();
	 /**
	  * 柜员签到状态
	  * 柜员签到状态
	  *
	  */
		public void setUslgst(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USLGST uslgst);
		
	 /**
	  * 等级
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="等级")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERLV getUserlv();
	 /**
	  * 等级
	  *
	  */
		public void setUserlv(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_USERLV userlv);
		
	 /**
	  * 身份证号
	  * 身份证号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="身份证号")
		public String getUsercd();
	 /**
	  * 身份证号
	  * 身份证号
	  *
	  */
		public void setUsercd(String usercd);
		
	 /**
	  * 性别
	  * 性别
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="性别")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_SEXTYP getTmnlid();
	 /**
	  * 性别
	  * 性别
	  *
	  */
		public void setTmnlid(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_SEXTYP tmnlid);
		
	 /**
	  * 家庭住址
	  * 家庭住址
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="家庭住址")
		public String getTmnlip();
	 /**
	  * 家庭住址
	  * 家庭住址
	  *
	  */
		public void setTmnlip(String tmnlip);
		
		public String toString();
	

		}
	 /**
	  * 柜员信息输出对象
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoTellComplexType.IoTlUserInfos", longname="柜员信息输出对象" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoTlUserInfos {
 	
	 /**
	  * 记录数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="记录数")
		public Integer getCount();
	 /**
	  * 记录数
	  *
	  */
		public void setCount(Integer count);
		
	 /**
	  * 柜员信息列表输出
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员信息列表输出")
		public cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.iobus.type.pb.IoTellComplexType.IoTlUserInfo> getInfos();
	 /**
	  * 柜员信息列表输出
	  *
	  */
		public void setInfos(cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.iobus.type.pb.IoTellComplexType.IoTlUserInfo> infos);
		
		public String toString();
	

		}
	 /**
	  * 柜员额度管理
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoTellComplexType.IoTlUserUsqt", longname="柜员额度管理" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoTlUserUsqt {
 	
	 /**
	  * 柜员代号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员代号")
		public String getUserid();
	 /**
	  * 柜员代号
	  *
	  */
		public void setUserid(String userid);
		
	 /**
	  * 币种
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="币种")
		public String getCrcycd();
	 /**
	  * 币种
	  *
	  */
		public void setCrcycd(String crcycd);
		
	 /**
	  * 业务类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="业务类型")
		public cn.sunline.ltts.busi.sys.type.PbEnumType.E_BUSITP getBusitp();
	 /**
	  * 业务类型
	  *
	  */
		public void setBusitp(cn.sunline.ltts.busi.sys.type.PbEnumType.E_BUSITP busitp);
		
	 /**
	  * 额度值
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="额度值")
		public java.math.BigDecimal getQuotam();
	 /**
	  * 额度值
	  *
	  */
		public void setQuotam(java.math.BigDecimal quotam);
		
		public String toString();
	

		}

}

