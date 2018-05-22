
package cn.sunline.ltts.busi.ap.iobus.type.ap.fbat;

	 /**
	  * 应用平台批量复合类型
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface IoApBatch {
	 /**
	  * DCN数据类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApBatch.ApDCN", longname="DCN数据类型" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface ApDCN {
 	
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
	  * 批量代理明细类型
	  * 除了DCN编号，还携带有其它数据字段。
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApBatch.ApDcnForPldlmx", longname="批量代理明细类型" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface ApDcnForPldlmx extends cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApBatch.ApDCN{
 	
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
		
		public String toString();
	

		}
	 /**
	  * 批量文件信息
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApBatch.ApBatchFile", longname="批量文件信息" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface ApBatchFile {
 	
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
		
		public String toString();
	

		}

}

