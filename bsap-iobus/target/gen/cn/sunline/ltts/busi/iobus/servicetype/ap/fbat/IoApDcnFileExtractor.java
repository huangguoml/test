
package cn.sunline.ltts.busi.iobus.servicetype.ap.fbat;

	 /**
	  * R/C-DCN文件抽取器服务类型
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApDcnFileExtractor", longname="R/C-DCN文件抽取器服务类型", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApDcnFileExtractor {
	 /**
	  * 文件抽取
	  *
	  */
	public cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.ExtractFileOut extractFile(final cn.sunline.ltts.busi.ap.iobus.type.ap.fbat.IoApFileBatchType.ExtractFileIn input);
	
	 /**
	  * 文件抽取
	  *
	  */
	public static interface extractFile {
	
	
	
	
	}
}

