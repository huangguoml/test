
package cn.sunline.ltts.busi.ap.iobus.type.ap.fbat;

	 /**
	  * 通用文件批量相关类型定义
	  * 文件批量相关类型定义
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface IoApFileBatchType {
	 /**
	  * 文件信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchType.FileInfo", longname="文件信息" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface FileInfo {
 	
	 /**
	  * 参数名称(key)
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="参数名称(key)")
		public String getParana();
	 /**
	  * 参数名称(key)
	  *
	  */
		public void setParana(String parana);
		
	 /**
	  * 参数值(value)
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="参数值(value)")
		public String getParavl();
	 /**
	  * 参数值(value)
	  *
	  */
		public void setParavl(String paravl);
		
		public String toString();
	

		}
	 /**
	  * 业务参数信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchType.BizParmInfo", longname="业务参数信息" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface BizParmInfo {
 	
	 /**
	  * 参数名称(key)
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="参数名称(key)")
		public String getParana();
	 /**
	  * 参数名称(key)
	  *
	  */
		public void setParana(String parana);
		
	 /**
	  * 参数值(value)
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="参数值(value)")
		public String getParavl();
	 /**
	  * 参数值(value)
	  *
	  */
		public void setParavl(String paravl);
		
		public String toString();
	

		}
	 /**
	  * 文件批量执行结果信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchType.FileBatchResultInfo", longname="文件批量执行结果信息" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface FileBatchResultInfo {
 	
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
	  * 交易耗时
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易耗时")
		public Long getTrantc();
	 /**
	  * 交易耗时
	  *
	  */
		public void setTrantc(Long trantc);
		
		public String toString();
	

		}
	 /**
	  * 文件批量任务提交信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchType.FileBatchSubmitInfo", longname="文件批量任务提交信息" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface FileBatchSubmitInfo {
 	
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
	  * 批量交易组标识
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量交易组标识")
		public String getBttrid();
	 /**
	  * 批量交易组标识
	  *
	  */
		public void setBttrid(String bttrid);
		
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
	  * 业务参数列表
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="业务参数列表")
		public cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.BizParmInfo> getCanshulb();
	 /**
	  * 业务参数列表
	  *
	  */
		public void setCanshulb(cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.BizParmInfo> canshulb);
		
	 /**
	  * 文件信息列表
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件信息列表")
		public java.util.Map getFilist();
	 /**
	  * 文件信息列表
	  *
	  */
		public void setFilist(java.util.Map filist);
		
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
		
		public String toString();
	

		}
	 /**
	  * 文件抽取请求类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchType.ExtractFileIn", longname="文件抽取请求类型" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface ExtractFileIn {
 	
	 /**
	  * 委托号
	  * 委托编号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="委托号")
		public String getEntrno();
	 /**
	  * 委托号
	  * 委托编号
	  *
	  */
		public void setEntrno(String entrno);
		
	 /**
	  * 批量文件类型
	  * 文件类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量文件类型")
		public String getBtflmd();
	 /**
	  * 批量文件类型
	  * 文件类型
	  *
	  */
		public void setBtflmd(String btflmd);
		
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
	  * 业务参数列表
	  * 业务参数列表
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="业务参数列表")
		public cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.BizParmInfo> getCanshulb();
	 /**
	  * 业务参数列表
	  * 业务参数列表
	  *
	  */
		public void setCanshulb(cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.BizParmInfo> canshulb);
		
		public String toString();
	

		}
	 /**
	  * 文件抽取响应类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchType.ExtractFileOut", longname="文件抽取响应类型" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface ExtractFileOut {
 	
	 /**
	  * 批量文件类型
	  * 文件类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="批量文件类型")
		public String getBtflmd();
	 /**
	  * 批量文件类型
	  * 文件类型
	  *
	  */
		public void setBtflmd(String btflmd);
		
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
		
	 /**
	  * 文件信息列表
	  * 文件信息列表
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件信息列表")
		public java.util.Map getFilist();
	 /**
	  * 文件信息列表
	  * 文件信息列表
	  *
	  */
		public void setFilist(java.util.Map filist);
		
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
		
		public String toString();
	

		}
	 /**
	  * 批量文件提交类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchType.BatchFileSubmit", longname="批量文件提交类型" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface BatchFileSubmit {
 	
	 /**
	  * 文件名
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件名")
		public String getFilenm();
	 /**
	  * 文件名
	  *
	  */
		public void setFilenm(String filenm);
		
	 /**
	  * 文件md5
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件md5")
		public String getFilemd();
	 /**
	  * 文件md5
	  *
	  */
		public void setFilemd(String filemd);
		
	 /**
	  * 文件路径
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件路径")
		public String getFlpath();
	 /**
	  * 文件路径
	  *
	  */
		public void setFlpath(String flpath);
		
	 /**
	  * 附加参数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="附加参数")
		public String getParams();
	 /**
	  * 附加参数
	  *
	  */
		public void setParams(String params);
		
		public String toString();
	

		}
	 /**
	  * 目标系统集合
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchType.targetList", longname="目标系统集合" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface targetList {
 	
	 /**
	  * 系统标识
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="系统标识")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_SYSCCD getTarget();
	 /**
	  * 系统标识
	  *
	  */
		public void setTarget(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_SYSCCD target);
		
		public String toString();
	

		}
	 /**
	  * 未发送通知文件业务代码集合
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchType.BatchFileBusseq", longname="未发送通知文件业务代码集合" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface BatchFileBusseq {
 	
	 /**
	  * 业务流水号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="业务流水号")
		public String getBusseq();
	 /**
	  * 业务流水号
	  *
	  */
		public void setBusseq(String busseq);
		
	 /**
	  * 文件类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="文件类型")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_FILETP getFiletp();
	 /**
	  * 文件类型
	  *
	  */
		public void setFiletp(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_FILETP filetp);
		
	 /**
	  * 记录数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="记录数")
		public Integer getRecord();
	 /**
	  * 记录数
	  *
	  */
		public void setRecord(Integer record);
		
	 /**
	  * 业务日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="业务日期")
		public String getAcctdt();
	 /**
	  * 业务日期
	  *
	  */
		public void setAcctdt(String acctdt);
		
		public String toString();
	

		}

}

