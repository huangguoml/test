
package cn.sunline.ltts.busi.iobus.servicetype.pb;

	 /**
	  * 公共冲正服务
	  * 公共冲正服务
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoPbStrikeSvcType", longname="公共冲正服务", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)

public interface IoPbStrikeSvcType {
	 /**
	  * 收费登记冲正
	  *
	  */
	public cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.iobus.type.pb.IoPbTypeStrikeInfo.ChargStrikeOutput> procPbChargStrike(final cn.sunline.ltts.busi.iobus.type.pb.IoPbTypeStrikeInfo.ProcPbChargStrikeInput strikeInput);
	
	 /**
	  * 收费登记冲正
	  *
	  */
	public static interface ProcPbChargStrike {
	
	
	
	
	}
	 /**
	  * 销记收费登记冲正
	  *
	  */
	public void procPbChargOffStrike(final cn.sunline.ltts.busi.iobus.type.pb.IoPbTypeStrikeInfo.ProcPbChargStrikeInput strikeInput);
	
	 /**
	  * 销记收费登记冲正
	  *
	  */
	public static interface ProcPbChargOffStrike {
	
	
	
	
	}
	 /**
	  * 收费调整冲正
	  *
	  */
	public void procPbChargAdjtStrike(final cn.sunline.ltts.busi.iobus.type.pb.IoPbTypeStrikeInfo.ProcPbChargStrikeInput strikeInput);
	
	 /**
	  * 收费调整冲正
	  *
	  */
	public static interface ProcPbChargAdjtStrike {
	
	
	
	
	}
}

