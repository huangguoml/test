
package cn.sunline.ltts.busi.ap.iobus.type;

	 /**
	  * 冲账复合类型定义
	  * 冲账复合类型定义
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface IoApReverseType {
	 /**
	  * 冲账参数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApReverseType.IoApReverseIn", longname="冲账参数" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApReverseIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS getStacps();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setStacps(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS stacps);
		
	 /**
	  * 凭证回冲标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="凭证回冲标志")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_VOBKFG getVobkfg();
	 /**
	  * 凭证回冲标志
	  *
	  */
		public void setVobkfg(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_VOBKFG vobkfg);
		
	 /**
	  * 抹账标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="抹账标志")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_CORRFG getCorrfg();
	 /**
	  * 抹账标志
	  *
	  */
		public void setCorrfg(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_CORRFG corrfg);
		
	 /**
	  * 原始主交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原始主交易流水")
		public String getOmtrsq();
	 /**
	  * 原始主交易流水
	  *
	  */
		public void setOmtrsq(String omtrsq);
		
	 /**
	  * 是否发起方流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="是否发起方流水")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getOtsqtp();
	 /**
	  * 是否发起方流水
	  *
	  */
		public void setOtsqtp(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ otsqtp);
		
		public String toString();
	

		}
	 /**
	  * 调账参数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApReverseType.IoApAjustIn", longname="调账参数" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApAjustIn {
 	
	 /**
	  * 错账日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="错账日期")
		public String getWrondt();
	 /**
	  * 错账日期
	  *
	  */
		public void setWrondt(String wrondt);
		
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
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getTranam();
	 /**
	  * 交易金额
	  *
	  */
		public void setTranam(java.math.BigDecimal tranam);
		
		public String toString();
	

		}
	 /**
	  * 柜面交易流水信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApReverseType.IoKapsGmjyls", longname="柜面交易流水信息" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoKapsGmjyls {
 	
	 /**
	  * 主交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="主交易流水")
		public String getMntrsq();
	 /**
	  * 主交易流水
	  *
	  */
		public void setMntrsq(String mntrsq);
		
	 /**
	  * 业务流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="业务流水")
		public String getBusisq();
	 /**
	  * 业务流水
	  *
	  */
		public void setBusisq(String busisq);
		
	 /**
	  * 交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易日期")
		public String getTrandt();
	 /**
	  * 交易日期
	  *
	  */
		public void setTrandt(String trandt);
		
	 /**
	  * 交易柜员
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易柜员")
		public String getTranus();
	 /**
	  * 交易柜员
	  *
	  */
		public void setTranus(String tranus);
		
	 /**
	  * 柜员流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜员流水")
		public String getUssqno();
	 /**
	  * 柜员流水
	  *
	  */
		public void setUssqno(String ussqno);
		
	 /**
	  * 交易码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易码")
		public String getPrcscd();
	 /**
	  * 交易码
	  *
	  */
		public void setPrcscd(String prcscd);
		
	 /**
	  * 交易名称
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易名称")
		public String getTranna();
	 /**
	  * 交易名称
	  *
	  */
		public void setTranna(String tranna);
		
	 /**
	  * 交易类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易类型")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_TRANTP getTrantp();
	 /**
	  * 交易类型
	  *
	  */
		public void setTrantp(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_TRANTP trantp);
		
	 /**
	  * 交易机构
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易机构")
		public String getTrbrch();
	 /**
	  * 交易机构
	  *
	  */
		public void setTrbrch(String trbrch);
		
	 /**
	  * 主机日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="主机日期")
		public String getHostdt();
	 /**
	  * 主机日期
	  *
	  */
		public void setHostdt(String hostdt);
		
	 /**
	  * 交易时间
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易时间")
		public String getTrantm();
	 /**
	  * 交易时间
	  *
	  */
		public void setTrantm(String trantm);
		
	 /**
	  * 授权柜员
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="授权柜员")
		public String getGranus();
	 /**
	  * 授权柜员
	  *
	  */
		public void setGranus(String granus);
		
	 /**
	  * 交易卡号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易卡号")
		public String getTrancd();
	 /**
	  * 交易卡号
	  *
	  */
		public void setTrancd(String trancd);
		
	 /**
	  * 交易账号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易账号")
		public String getTranac();
	 /**
	  * 交易账号
	  *
	  */
		public void setTranac(String tranac);
		
	 /**
	  * 账户名称
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="账户名称")
		public String getAcctna();
	 /**
	  * 账户名称
	  *
	  */
		public void setAcctna(String acctna);
		
	 /**
	  * 货币代号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="货币代号")
		public String getCrcycd();
	 /**
	  * 货币代号
	  *
	  */
		public void setCrcycd(String crcycd);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getTranam();
	 /**
	  * 交易金额
	  *
	  */
		public void setTranam(java.math.BigDecimal tranam);
		
	 /**
	  * 收款人卡号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="收款人卡号")
		public String getCardno();
	 /**
	  * 收款人卡号
	  *
	  */
		public void setCardno(String cardno);
		
	 /**
	  * 客户账号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户账号")
		public String getCustac();
	 /**
	  * 客户账号
	  *
	  */
		public void setCustac(String custac);
		
	 /**
	  * 收款人账户名称
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="收款人账户名称")
		public String getCustna();
	 /**
	  * 收款人账户名称
	  *
	  */
		public void setCustna(String custna);
		
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
		
	 /**
	  * 勾对标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="勾对标志")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_SQHOTG getSqhotg();
	 /**
	  * 勾对标志
	  *
	  */
		public void setSqhotg(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_SQHOTG sqhotg);
		
	 /**
	  * 勾对柜员
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="勾对柜员")
		public String getHookus();
	 /**
	  * 勾对柜员
	  *
	  */
		public void setHookus(String hookus);
		
	 /**
	  * 柜面流水状态
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="柜面流水状态")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_COSQST getCosqst();
	 /**
	  * 柜面流水状态
	  *
	  */
		public void setCosqst(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_COSQST cosqst);
		
	 /**
	  * 备用字段1
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="备用字段1")
		public String getSpaco1();
	 /**
	  * 备用字段1
	  *
	  */
		public void setSpaco1(String spaco1);
		
	 /**
	  * 备用字段2
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="备用字段2")
		public String getSpaco2();
	 /**
	  * 备用字段2
	  *
	  */
		public void setSpaco2(String spaco2);
		
	 /**
	  * 备用字段3
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="备用字段3")
		public String getSpaco3();
	 /**
	  * 备用字段3
	  *
	  */
		public void setSpaco3(String spaco3);
		
	 /**
	  * 备用字段4
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="备用字段4")
		public java.math.BigDecimal getSpaco4();
	 /**
	  * 备用字段4
	  *
	  */
		public void setSpaco4(java.math.BigDecimal spaco4);
		
	 /**
	  * 备用字段5
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="备用字段5")
		public java.math.BigDecimal getSpaco5();
	 /**
	  * 备用字段5
	  *
	  */
		public void setSpaco5(java.math.BigDecimal spaco5);
		
	 /**
	  * 备用字段6
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="备用字段6")
		public java.math.BigDecimal getSpaco6();
	 /**
	  * 备用字段6
	  *
	  */
		public void setSpaco6(java.math.BigDecimal spaco6);
		
		public String toString();
	

		}

}

