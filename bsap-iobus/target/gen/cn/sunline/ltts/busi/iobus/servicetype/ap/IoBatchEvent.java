
package cn.sunline.ltts.busi.iobus.servicetype.ap;

	 /**
	  * 批量数据汇报服务定义
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoBatchEvent", longname="批量数据汇报服务定义", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoBatchEvent {
	 /**
	  * R/C-DCN或ADM批量数据汇报ADM事件服务
	  *
	  */
	public void onAdmBatchEvent(String fwsxgjzi, String shijneir);
	
	 /**
	  * R/C-DCN或ADM批量数据汇报ADM事件服务
	  *
	  */
	public static interface onAdmBatchEvent {
	
	
	
	
	}
	 /**
	  * GL批量数据汇报ADM事件服务
	  *
	  */
	public void onAdmBatchEventForGL(String fwsxgjzi, String shijneir);
	
	 /**
	  * GL批量数据汇报ADM事件服务
	  *
	  */
	public static interface onAdmBatchEventForGL {
	
	
	
	
	}
	 /**
	  * GL批量数据汇报R/C-DCN事件服务
	  *
	  */
	public void onBatchEvent(String fwsxgjzi, String shijneir);
	
	 /**
	  * GL批量数据汇报R/C-DCN事件服务
	  *
	  */
	public static interface onBatchEvent {
	
	
	
	
	}
	 /**
	  * ADM批量数据汇报同步服务
	  *
	  */
	public String onAdmBatchService(String fwsxgjzi, String shijneir);
	
	 /**
	  * ADM批量数据汇报同步服务
	  *
	  */
	public static interface onAdmBatchService {
	
	
	
	
	}
	 /**
	  * R/C-DCN批量数据汇报同步服务
	  *
	  */
	public String onBatchService(String dcnbianh, String fwsxgjzi, String shijneir);
	
	 /**
	  * R/C-DCN批量数据汇报同步服务
	  *
	  */
	public static interface onBatchService {
	
	
	
	
	}
}

