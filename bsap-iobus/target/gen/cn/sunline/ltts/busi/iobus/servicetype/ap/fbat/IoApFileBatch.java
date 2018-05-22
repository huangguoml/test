
package cn.sunline.ltts.busi.iobus.servicetype.ap.fbat;

	 /**
	  * 通用文件批量业务服务
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatch", longname="通用文件批量业务服务", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApFileBatch {
	 /**
	  * DCN文件批量状态查询
	  *
	  */
	public cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.FileBatchResultInfo getStatus(String weituoho, String dcnbianh);
	
	 /**
	  * DCN文件批量状态查询
	  *
	  */
	public static interface getStatus {
	
	
	
	
	}
	 /**
	  * DCN文件批量提交
	  *
	  */
	public void doTaskProcess(final cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.FileBatchSubmitInfo plrwtjxx);
	
	 /**
	  * DCN文件批量提交
	  *
	  */
	public static interface doTaskProcess {
	
	
	
	
	}
	 /**
	  * 批量提交后通知数据文件系统
	  *
	  */
	public void doBatchSubmitBack(String busseq, String filesq, String trandt, String filenm, String flpath, String status, String descri);
	
	 /**
	  * 批量提交后通知数据文件系统
	  *
	  */
	public static interface doBatchSubmitBack {
	
	
	
	
	}
	 /**
	  * 批量提交后通知数据子系统分发文件
	  *
	  */
	public void doBatchSubmitBackToAll(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_FILETP dataid, String filenm, String flpath);
	
	 /**
	  * 批量提交后通知数据子系统分发文件
	  *
	  */
	public static interface doBatchSubmitBackToAll {
	
	
	
	
	}
	 /**
	  * 批量提交通知数据系统
	  *
	  */
	public void doBatchSubmitBackNotice(String status, String descri, cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_SYSCCD target, cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_FILETP filetp, final cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.BatchFileSubmit> fileList);
	
	 /**
	  * 批量提交通知数据系统
	  *
	  */
	public static interface doBatchSubmitBackNotice {
	
	
	
	
	}
	 /**
	  * 批量提交外调数据文件系统
	  *
	  */
	public void returnBatchSubmitNotice(String status, String descri, cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_SYSCCD target, cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_FILETP filetp, String busseq, String acctdt, final cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.BatchFileSubmit> fileList);
	
	 /**
	  * 批量提交外调数据文件系统
	  *
	  */
	public static interface returnBatchSubmitNotice {
	
	
	
	
	}
	 /**
	  * 批量通知数据文件系统同步文件
	  *
	  */
	public void doBatchSubmitBackSynNotice(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_SYSCCD source, String acctdt, cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_FILETP dataid, String filenm, String filemd, final cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.targetList> targetList);
	
	 /**
	  * 批量通知数据文件系统同步文件
	  *
	  */
	public static interface doBatchSubmitBackSynNotice {
	
	
	
	
	}
}

