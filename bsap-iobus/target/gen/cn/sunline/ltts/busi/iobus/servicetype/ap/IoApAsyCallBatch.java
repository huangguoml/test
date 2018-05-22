
package cn.sunline.ltts.busi.iobus.servicetype.ap;

	 /**
	  * 通用异步调用批量服务
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApAsyCallBatch", longname="通用异步调用批量服务", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApAsyCallBatch {
	 /**
	  * 通用异步调用批量程序
	  *
	  */
	public String prcAsyCallBtch(final cn.sunline.ltts.busi.iobus.servicetype.ap.IoApAsyCallBatch.prcAsyCallBtch.Input input);
	
	 /**
	  * 通用异步调用批量程序
	  *
	  */
	public static interface prcAsyCallBtch {
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="prcAsyCallBtch.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Input {
 	
	 /**
	  * 异步批量业务类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="异步批量业务类型")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_BTTYPE getBttype();
		public String toString();
	

	}
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="prcAsyCallBtch.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface InputSetter extends Input {
	 /**
	  * 异步批量业务类型
	  *
	  */
		public void setBttype(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_BTTYPE bttype);
	}
	
	
	
	
	}
	 /**
	  * 更新处理总笔数
	  *
	  */
	public void updateTotlAfterParse(String taskid, Long chulizbs);
	
	 /**
	  * 更新处理总笔数
	  *
	  */
	public static interface updateTotlAfterParse {
	
	
	
	
	}
	 /**
	  * 更新文件的下载路径
	  *
	  */
	public void updateFileDownPath(String taskid, String dwpath);
	
	 /**
	  * 更新文件的下载路径
	  *
	  */
	public static interface updateFileDownPath {
	
	
	
	
	}
	 /**
	  * 更新文件的上传路径
	  *
	  */
	public void updateFileUpPath(String taskid, String uppath);
	
	 /**
	  * 更新文件的上传路径
	  *
	  */
	public static interface updateFileUpPath {
	
	
	
	
	}
	 /**
	  * 请求文件下载前更新
	  *
	  */
	public void updateFileBeforeDownload(String taskid);
	
	 /**
	  * 请求文件下载前更新
	  *
	  */
	public static interface updateFileBeforeDownload {
	
	
	
	
	}
	 /**
	  * 请求文件下载后更新
	  *
	  */
	public void updateFileAfterDownload(String taskid);
	
	 /**
	  * 请求文件下载后更新
	  *
	  */
	public static interface updateFileAfterDownload {
	
	
	
	
	}
	 /**
	  * 请求文件入库前更新
	  *
	  */
	public void updateFileBeforeParse(String taskid);
	
	 /**
	  * 请求文件入库前更新
	  *
	  */
	public static interface updateFileBeforeParse {
	
	
	
	
	}
	 /**
	  * 请求文件入库后更新
	  *
	  */
	public void updateFileAfterParse(String taskid);
	
	 /**
	  * 请求文件入库后更新
	  *
	  */
	public static interface updateFileAfterParse {
	
	
	
	
	}
	 /**
	  * 业务处理前更新
	  *
	  */
	public void updateFileBeforeBusi(String taskid);
	
	 /**
	  * 业务处理前更新
	  *
	  */
	public static interface updateFileBeforeBusi {
	
	
	
	
	}
	 /**
	  * 业务处理后更新
	  *
	  */
	public void updateFileAfterBusi(String taskid);
	
	 /**
	  * 业务处理后更新
	  *
	  */
	public static interface updateFileAfterBusi {
	
	
	
	
	}
	 /**
	  * 写文件前处理更新
	  *
	  */
	public void updateFileBeforeResult(String taskid);
	
	 /**
	  * 写文件前处理更新
	  *
	  */
	public static interface updateFileBeforeResult {
	
	
	
	
	}
	 /**
	  * 写文件后处理更新
	  *
	  */
	public void updateFileAfterResult(String taskid);
	
	 /**
	  * 写文件后处理更新
	  *
	  */
	public static interface updateFileAfterResult {
	
	
	
	
	}
}

