
package cn.sunline.ltts.busi.iobus.type;

	 /**
	  * 机构共用复核类型
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface IoCompPbBranch {
	 /**
	  * 机构上下级
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoCompPbBranch.PbBranchUpLow", longname="机构上下级" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface PbBranchUpLow {
 	
	 /**
	  * 上级机构
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="上级机构")
		public String getUppebr();
	 /**
	  * 上级机构
	  *
	  */
		public void setUppebr(String uppebr);
		
	 /**
	  * 下级机构
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="下级机构")
		public String getLowebr();
	 /**
	  * 下级机构
	  *
	  */
		public void setLowebr(String lowebr);
		
		public String toString();
	

		}

}

