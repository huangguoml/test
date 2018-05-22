
package cn.sunline.ltts.busi.iobus.servicetype.ap;

	 /**
	  * GL数据汇报服务定义
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoGLEvent", longname="GL数据汇报服务定义", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoGLEvent {
	 /**
	  * GL数据汇报(R/C-DCN DepositBatch->DepositGL)
	  *
	  */
	public void onGLEvent(String fwsxgjzi, String shijneir);
	
	 /**
	  * GL数据汇报(R/C-DCN DepositBatch->DepositGL)
	  *
	  */
	public static interface onGLEvent {
	
	
	
	
	}
	 /**
	  * GL数据汇报(AMD-DCN DepositAdmBatch->DepositGL)
	  *
	  */
	public void onGLEventForAdm(String fwsxgjzi, String shijneir);
	
	 /**
	  * GL数据汇报(AMD-DCN DepositAdmBatch->DepositGL)
	  *
	  */
	public static interface onGLEventForAdm {
	
	
	
	
	}
	 /**
	  * GL数据汇报同步服务
	  *
	  */
	public String onGLService(String fwsxgjzi, String shijneir);
	
	 /**
	  * GL数据汇报同步服务
	  *
	  */
	public static interface onGLService {
	
	
	
	
	}
}

