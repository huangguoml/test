
package cn.sunline.ltts.busi.iobus.servicetype.ap.fbat;

	 /**
	  * 通用文件批量异步事件
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileBatchNotify", longname="通用文件批量异步事件", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApFileBatchNotify {
	 /**
	  * DepositAdmBatch文件批量处理结束事件（ADM发布给渠道系统）
	  *
	  */
	public void admFinish(String dcnbianh, String plwenjlx, String weituoho, cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_WENJPLZT wenjplzt, Long zongbish, Long chenggbs, Long shibaibs, String wenjiabs, String md5maaaa);
	
	 /**
	  * DepositAdmBatch文件批量处理结束事件（ADM发布给渠道系统）
	  *
	  */
	public static interface admFinish {
	
	
	
	
	}
}

