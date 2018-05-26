
package cn.sunline.ltts.busi.online.trans.dict;

	 /**
	  * 测试字典
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface TDict {
	 /**
	  * 联机数据
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="TDict.onlinedata", longname="联机数据" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static enum onlinedata implements cn.sunline.ltts.core.api.lang.Symbol {
            username("username", "用户名", "", 20,0 ),
            address("address", "地址", "", 100,0 ),
            telphone("telphone", "电话", "", 14,0 ),
            custno("custno", "客户号", "", 20,0 ),
            accoutno("accoutno", "账户号", "", 20,0 )
					;
			
			private String __id__;
			private String __longname__;
			private String __description__;
			private int __length__;
			private int __fractionDigits__;
			
			private onlinedata(String __id__, String __longname__, String __description__, int __length__, int __fractionDigits__){
				this.__id__ = __id__;
				this.__longname__ = __longname__;
				this.__description__ = __description__;
				this.__length__ = __length__;
				this.__fractionDigits__ = __fractionDigits__;
			}
	
			public String getId() {
				return this.__id__;
			}
			public String getDescription() {
				return this.__description__;
			}
			public String getLongName() {
				return this.__longname__;
			}
			public int getLength() {
				return this.__length__;
			}
			public int getFractionDigits() {
				return this.__fractionDigits__;
			}
		}

}

