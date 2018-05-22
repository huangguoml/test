
package cn.sunline.ltts.busi.iobus.servicetype.ap;

	 /**
	  * 事件服务定义
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApEvent", longname="事件服务定义", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApEvent {
	 /**
	  * 通用的事件处理服务
	  *
	  */
	public void onEvent(String shijneir);
	
	 /**
	  * 通用的事件处理服务
	  *
	  */
	public static interface onEvent {
	
	
	
	
	}
}

