
package cn.sunline.ltts.busi.iobus.servicetype.ap.fbat;

	 /**
	  * 文件批量信息登记服务定义
	  * 文件批量信息登记服务定义
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchReg", longname="文件批量信息登记服务定义", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApFileBatchReg {
	 /**
	  * 保存文件批量任务(明细)(新增或者更新)
	  *
	  */
	public void saveIoApWjplrwxx(final cn.sunline.ltts.busi.ap.iobus.type.IoApBatchFileStruct.IoApWjplrwxxInfo wjplrwxx);
	
	 /**
	  * 保存文件批量任务(明细)(新增或者更新)
	  *
	  */
	public static interface SaveIoApWjplrwxx {
	
	
	
	
	}
	 /**
	  * 追加的方式保存文件批量任务(明细)(新增或者更新)
	  *
	  */
	public void appendApWjplrw(final cn.sunline.ltts.busi.ap.iobus.type.IoApBatchFileStruct.IoApWjplrwxxInfo wjplrwxx);
	
	 /**
	  * 追加的方式保存文件批量任务(明细)(新增或者更新)
	  *
	  */
	public static interface AppendWjplrw {
	
	
	
	
	}
	 /**
	  * 查询文件批量任务(明细)
	  *
	  */
	public cn.sunline.ltts.busi.ap.iobus.type.IoApBatchFileStruct.IoApWjplrwxxInfo selWjplrwxx(String weituoho, String dcnbianh);
	
	 /**
	  * 查询文件批量任务(明细)
	  *
	  */
	public static interface SelIoApWjplrwxx {
	
	
	
	
	}
	 /**
	  * 带锁查询文件批量任务(明细)
	  *
	  */
	public cn.sunline.ltts.busi.ap.iobus.type.IoApBatchFileStruct.IoApWjplrwxxInfo selWjplrwWithLock(String weituoho, String dcnbianh);
	
	 /**
	  * 带锁查询文件批量任务(明细)
	  *
	  */
	public static interface SelIoApWjplrwWithLock {
	
	
	
	
	}
	 /**
	  * 查询文件批量任务(明细)列表
	  *
	  */
	public cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.IoApBatchFileStruct.IoApWjplrwxxInfo> selIoApWjplrwxxLst(String weituoho);
	
	 /**
	  * 查询文件批量任务(明细)列表
	  *
	  */
	public static interface SelIoApWjplrwxxLst {
	
	
	
	
	}
	 /**
	  * 保存文件批量信息（主表）(新增或更新)
	  *
	  */
	public void saveIoApWjplxx(final cn.sunline.ltts.busi.ap.iobus.type.IoApBatchFileStruct.IoApWjplrwxxInfo wjplrwxx);
	
	 /**
	  * 保存文件批量信息（主表）(新增或更新)
	  *
	  */
	public static interface SaveIoApWjplxx {
	
	
	
	
	}
	 /**
	  * 查询文件批量信息（主表）
	  *
	  */
	public cn.sunline.ltts.busi.ap.iobus.type.IoApBatchFileStruct.IoApWjplrwxxInfo selIoApWjplxx(String weituoho);
	
	 /**
	  * 查询文件批量信息（主表）
	  *
	  */
	public static interface SelIoApWjplxx {
	
	
	
	
	}
	 /**
	  * 带锁查询文件批量信息（主表）
	  *
	  */
	public cn.sunline.ltts.busi.ap.iobus.type.IoApBatchFileStruct.IoApWjplrwxxInfo selIoApWjplxxWithLock(String weituoho);
	
	 /**
	  * 带锁查询文件批量信息（主表）
	  *
	  */
	public static interface SelIoApWjplxxWithLock {
	
	
	
	
	}
	 /**
	  * 追加的方式保存文件批量信息（主表）
	  *
	  */
	public void appendApWjplxx(final cn.sunline.ltts.busi.ap.iobus.type.IoApBatchFileStruct.IoApWjplrwxxInfo wjplrwxx);
	
	 /**
	  * 追加的方式保存文件批量信息（主表）
	  *
	  */
	public static interface AppendApWjplxx {
	
	
	
	
	}
}

