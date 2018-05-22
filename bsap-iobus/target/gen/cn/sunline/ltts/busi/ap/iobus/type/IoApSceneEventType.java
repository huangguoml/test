
package cn.sunline.ltts.busi.ap.iobus.type;

	 /**
	  * 批量文件相关复合类型定义
	  * 事件场景符合类型定义
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface IoApSceneEventType {
	 /**
	  * 场景匹配参数
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApSceneEventType.IoApCjppIn", longname="场景匹配参数" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApCjppIn {
 	
	 /**
	  * 事件编号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件编号")
		public String getEvetno();
	 /**
	  * 事件编号
	  *
	  */
		public void setEvetno(String evetno);
		
	 /**
	  * 交易渠道号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易渠道号")
		public String getServno();
	 /**
	  * 交易渠道号
	  *
	  */
		public void setServno(String servno);
		
	 /**
	  * 场景维度代码集合
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="场景维度代码集合")
		public cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.IoApSceneEventType.IoApCjppWdu> getLstCjwdDaim();
	 /**
	  * 场景维度代码集合
	  *
	  */
		public void setLstCjwdDaim(cn.sunline.ltts.core.api.model.dm.Options<cn.sunline.ltts.busi.ap.iobus.type.IoApSceneEventType.IoApCjppWdu> lstCjwdDaim);
		
		public String toString();
	

		}
	 /**
	  * 场景匹配维度
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApSceneEventType.IoApCjppWdu", longname="场景匹配维度" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApCjppWdu {
 	
	 /**
	  * 场景维度代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="场景维度代码")
		public String getDimecd();
	 /**
	  * 场景维度代码
	  *
	  */
		public void setDimecd(String dimecd);
		
	 /**
	  * 场景维度值
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="场景维度值")
		public String getDimevl();
	 /**
	  * 场景维度值
	  *
	  */
		public void setDimevl(String dimevl);
		
		public String toString();
	

		}
	 /**
	  * 场景匹配输出
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApSceneEventType.IoApCjppOut", longname="场景匹配输出" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApCjppOut {
 	
	 /**
	  * 场景代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="场景代码")
		public String getScencd();
	 /**
	  * 场景代码
	  *
	  */
		public void setScencd(String scencd);
		
		public String toString();
	

		}

}

