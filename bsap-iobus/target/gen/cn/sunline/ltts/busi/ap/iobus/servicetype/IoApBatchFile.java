
package cn.sunline.ltts.busi.ap.iobus.servicetype;

	 /**
	  * 批量文件信息登记
	  * 批量文件信息登记
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApBatchFile", longname="批量文件信息登记", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApBatchFile {
	 /**
	  * 批量文件信息列表查询
	  *
	  */
	public cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.IoApBatchFileStruct.IoApPlwjXinxInfo> selPlwjXinxList(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_BTFLST btflst, cn.sunline.ltts.busi.sys.type.BaseEnumType.E_BTFLTP btfltp, Long qishibis, Long chxunbis);
	
	 /**
	  * 批量文件信息列表查询
	  *
	  */
	public static interface IoApPlwjChaxList {
	
	
	
	
	}
}

