
package cn.sunline.ltts.busi.ap.iobus.servicetype;

	 /**
	  * 批量文件信息登记
	  * 场景事件匹配
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApSceneEvent", longname="批量文件信息登记", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApSceneEvent {
	 /**
	  * 事件场景匹配
	  *
	  */
	public cn.sunline.ltts.busi.ap.iobus.type.IoApSceneEventType.IoApCjppOut prcSjcjPpei(final cn.sunline.ltts.busi.ap.iobus.type.IoApSceneEventType.IoApCjppIn cplCjppIn);
	
	 /**
	  * 事件场景匹配
	  *
	  */
	public static interface IoApSjcjPpei {
	
	
	
	
	}
}

