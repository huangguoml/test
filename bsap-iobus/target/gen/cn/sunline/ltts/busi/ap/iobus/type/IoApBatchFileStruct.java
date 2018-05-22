
package cn.sunline.ltts.busi.ap.iobus.type;

	 /**
	  * 批量文件相关复合类型定义
	  * 批量文件相关复合类型定义
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface IoApBatchFileStruct {
	 /**
	  * 批量文件登记输入信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApBatchFileStruct.IoApPlwjXinxIn", longname="批量文件登记输入信息" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApPlwjXinxIn {
 	
	 /**
	  * 当前DCN号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="当前DCN号")
		public String getCudcnno();
	 /**
	  * 当前DCN号
	  *
	  */
		public void setCudcnno(String cudcnno);
		
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
	  * 文件ID号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件ID号")
		public String getFileid();
	 /**
	  * 文件ID号
	  *
	  */
		public void setFileid(String fileid);
		
	 /**
	  * 文件名称
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件名称")
		public String getFilena();
	 /**
	  * 文件名称
	  *
	  */
		public void setFilena(String filena);
		
	 /**
	  * 批量文件类别
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量文件类别")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_BTFLTP getBtfltp();
	 /**
	  * 批量文件类别
	  *
	  */
		public void setBtfltp(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_BTFLTP btfltp);
		
	 /**
	  * 总笔数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="总笔数")
		public Long getTotanm();
	 /**
	  * 总笔数
	  *
	  */
		public void setTotanm(Long totanm);
		
	 /**
	  * 文件属性信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件属性信息")
		public String getFilepr();
	 /**
	  * 文件属性信息
	  *
	  */
		public void setFilepr(String filepr);
		
	 /**
	  * DCN编号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="DCN编号")
		public String getCdcnno();
	 /**
	  * DCN编号
	  *
	  */
		public void setCdcnno(String cdcnno);
		
		public String toString();
	

		}
	 /**
	  * 批量文件信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApBatchFileStruct.IoApPlwjXinxInfo", longname="批量文件信息" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApPlwjXinxInfo {
 	
	 /**
	  * DCN编号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="DCN编号")
		public String getCdcnno();
	 /**
	  * DCN编号
	  *
	  */
		public void setCdcnno(String cdcnno);
		
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
	  * 文件ID号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件ID号")
		public String getFileid();
	 /**
	  * 文件ID号
	  *
	  */
		public void setFileid(String fileid);
		
	 /**
	  * 文件名称
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件名称")
		public String getFilena();
	 /**
	  * 文件名称
	  *
	  */
		public void setFilena(String filena);
		
	 /**
	  * 批量文件类别
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量文件类别")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_BTFLTP getBtfltp();
	 /**
	  * 批量文件类别
	  *
	  */
		public void setBtfltp(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_BTFLTP btfltp);
		
	 /**
	  * 已读取笔数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="已读取笔数")
		public Long getReadct();
	 /**
	  * 已读取笔数
	  *
	  */
		public void setReadct(Long readct);
		
	 /**
	  * 记录次序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="记录次序号")
		public Long getRecdno();
	 /**
	  * 记录次序号
	  *
	  */
		public void setRecdno(Long recdno);
		
	 /**
	  * 批量文件状态标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量文件状态标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_BTFLST getBtflst();
	 /**
	  * 批量文件状态标志
	  *
	  */
		public void setBtflst(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_BTFLST btflst);
		
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
	  * 文件属性信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件属性信息")
		public String getFilepr();
	 /**
	  * 文件属性信息
	  *
	  */
		public void setFilepr(String filepr);
		
		public String toString();
	

		}
	 /**
	  * 文件批量任务信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApBatchFileStruct.IoApWjplrwxxInfo", longname="文件批量任务信息" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApWjplrwxxInfo {
 	
	 /**
	  * 委托号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="委托号")
		public String getEntrno();
	 /**
	  * 委托号
	  *
	  */
		public void setEntrno(String entrno);
		
	 /**
	  * DCN编号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="DCN编号")
		public String getCdcnno();
	 /**
	  * DCN编号
	  *
	  */
		public void setCdcnno(String cdcnno);
		
	 /**
	  * 主调DCN号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="主调DCN号")
		public String getMdcnno();
	 /**
	  * 主调DCN号
	  *
	  */
		public void setMdcnno(String mdcnno);
		
	 /**
	  * 批量文件类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量文件类型")
		public String getBtflmd();
	 /**
	  * 批量文件类型
	  *
	  */
		public void setBtflmd(String btflmd);
		
	 /**
	  * 批量交易组编号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量交易组编号")
		public String getBttrno();
	 /**
	  * 批量交易组编号
	  *
	  */
		public void setBttrno(String bttrno);
		
	 /**
	  * 批量发起渠道
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量发起渠道")
		public String getBtlach();
	 /**
	  * 批量发起渠道
	  *
	  */
		public void setBtlach(String btlach);
		
	 /**
	  * 批量发起日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量发起日期")
		public String getBtladt();
	 /**
	  * 批量发起日期
	  *
	  */
		public void setBtladt(String btladt);
		
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
	  * 总笔数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="总笔数")
		public Long getTotanm();
	 /**
	  * 总笔数
	  *
	  */
		public void setTotanm(Long totanm);
		
	 /**
	  * 成功笔数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="成功笔数")
		public Long getSuccnm();
	 /**
	  * 成功笔数
	  *
	  */
		public void setSuccnm(Long succnm);
		
	 /**
	  * 失败笔数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="失败笔数")
		public Long getFailnm();
	 /**
	  * 失败笔数
	  *
	  */
		public void setFailnm(Long failnm);
		
	 /**
	  * 开始时间
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="开始时间")
		public Long getStartm();
	 /**
	  * 开始时间
	  *
	  */
		public void setStartm(Long startm);
		
	 /**
	  * 结束时间
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="结束时间")
		public Long getEndttm();
	 /**
	  * 结束时间
	  *
	  */
		public void setEndttm(Long endttm);
		
	 /**
	  * 文件批量状态
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件批量状态")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_FLBTST getFlbtst();
	 /**
	  * 文件批量状态
	  *
	  */
		public void setFlbtst(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_FLBTST flbtst);
		
	 /**
	  * 批量发起流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量发起流水")
		public String getBtstsq();
	 /**
	  * 批量发起流水
	  *
	  */
		public void setBtstsq(String btstsq);
		
	 /**
	  * 文件信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件信息")
		public String getFiletx();
	 /**
	  * 文件信息
	  *
	  */
		public void setFiletx(String filetx);
		
	 /**
	  * 本地文件路径
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="本地文件路径")
		public String getLocaph();
	 /**
	  * 本地文件路径
	  *
	  */
		public void setLocaph(String locaph);
		
	 /**
	  * 错误信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="错误信息")
		public String getErrotx();
	 /**
	  * 错误信息
	  *
	  */
		public void setErrotx(String errotx);
		
	 /**
	  * 错误堆栈
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="错误堆栈")
		public String getErrosk();
	 /**
	  * 错误堆栈
	  *
	  */
		public void setErrosk(String errosk);
		
		public String toString();
	

		}
	 /**
	  * 批量主表总记录数和处理总数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApBatchFileStruct.IoApTotlInfo", longname="批量主表总记录数和处理总数" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApTotlInfo {
 	
	 /**
	  * 总笔数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="总笔数")
		public Long getTotanm();
	 /**
	  * 总笔数
	  *
	  */
		public void setTotanm(Long totanm);
		
	 /**
	  * 处理总笔数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="处理总笔数")
		public Long getDistnm();
	 /**
	  * 处理总笔数
	  *
	  */
		public void setDistnm(Long distnm);
		
		public String toString();
	

		}

}

