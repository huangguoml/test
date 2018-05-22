
package cn.sunline.ltts.busi.iobus.servicetype.ap.fbat;

	 /**
	  * 文件抽取器服务类型，不同文件类型都需要实现此服务类型。
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApFileExtractor", longname="文件抽取器服务类型，不同文件类型都需要实现此服务类型。", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoApFileExtractor {
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

