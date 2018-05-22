
package cn.sunline.ltts.busi.iobus.type.ap;

	 /**
	  * 冲账信息集
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface IoApStrikeType {
	 /**
	  * 登记冲正事件登记簿
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApRegBook", longname="登记冲正事件登记簿" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApRegBook {
 	
	 /**
	  * 交易事件
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易事件")
		public String getTranev();
	 /**
	  * 交易事件
	  *
	  */
		public void setTranev(String tranev);
		
	 /**
	  * 客户账号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户账号")
		public String getCustac();
	 /**
	  * 客户账号
	  *
	  */
		public void setCustac(String custac);
		
	 /**
	  * 交易账号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易账号")
		public String getTranac();
	 /**
	  * 交易账号
	  *
	  */
		public void setTranac(String tranac);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getTranam();
	 /**
	  * 交易金额
	  *
	  */
		public void setTranam(java.math.BigDecimal tranam);
		
	 /**
	  * 借贷标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="借贷标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_AMNTCD getAmntcd();
	 /**
	  * 借贷标志
	  *
	  */
		public void setAmntcd(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_AMNTCD amntcd);
		
	 /**
	  * 币种
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="币种")
		public String getCrcycd();
	 /**
	  * 币种
	  *
	  */
		public void setCrcycd(String crcycd);
		
	 /**
	  * 待销账序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="待销账序号")
		public String getStayno();
	 /**
	  * 待销账序号
	  *
	  */
		public void setStayno(String stayno);
		
	 /**
	  * 交易序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易序号")
		public Long getTranno();
	 /**
	  * 交易序号
	  *
	  */
		public void setTranno(Long tranno);
		
	 /**
	  * 冻结编号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冻结编号")
		public String getFrozno();
	 /**
	  * 冻结编号
	  *
	  */
		public void setFrozno(String frozno);
		
	 /**
	  * 起息日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="起息日期")
		public String getBgindt();
	 /**
	  * 起息日期
	  *
	  */
		public void setBgindt(String bgindt);
		
	 /**
	  * 事件关键字1
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件关键字1")
		public String getEvent1();
	 /**
	  * 事件关键字1
	  *
	  */
		public void setEvent1(String event1);
		
	 /**
	  * 事件关键字2
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件关键字2")
		public String getEvent2();
	 /**
	  * 事件关键字2
	  *
	  */
		public void setEvent2(String event2);
		
	 /**
	  * 事件关键字3
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件关键字3")
		public String getEvent3();
	 /**
	  * 事件关键字3
	  *
	  */
		public void setEvent3(String event3);
		
	 /**
	  * 事件关键字4
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件关键字4")
		public String getEvent4();
	 /**
	  * 事件关键字4
	  *
	  */
		public void setEvent4(String event4);
		
	 /**
	  * 事件关键字5
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件关键字5")
		public String getEvent5();
	 /**
	  * 事件关键字5
	  *
	  */
		public void setEvent5(String event5);
		
	 /**
	  * 事件关键字6
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件关键字6")
		public String getEvent6();
	 /**
	  * 事件关键字6
	  *
	  */
		public void setEvent6(String event6);
		
	 /**
	  * 事件关键字7
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件关键字7")
		public String getEvent7();
	 /**
	  * 事件关键字7
	  *
	  */
		public void setEvent7(String event7);
		
	 /**
	  * 事件关键字8
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件关键字8")
		public String getEvent8();
	 /**
	  * 事件关键字8
	  *
	  */
		public void setEvent8(String event8);
		
	 /**
	  * 事件关键字9
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件关键字9")
		public String getEvent9();
	 /**
	  * 事件关键字9
	  *
	  */
		public void setEvent9(String event9);
		
	 /**
	  * 事务级别
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事务级别")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_EVNTLV getEvntlv();
	 /**
	  * 事务级别
	  *
	  */
		public void setEvntlv(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_EVNTLV evntlv);
		
	 /**
	  * 外调流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="外调流水")
		public String getCallsq();
	 /**
	  * 外调流水
	  *
	  */
		public void setCallsq(String callsq);
		
	 /**
	  * 外调服务状态
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="外调服务状态")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_CALLST getCallst();
	 /**
	  * 外调服务状态
	  *
	  */
		public void setCallst(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_CALLST callst);
		
		public String toString();
	

		}
	 /**
	  * 内部账户冲账输入接口
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApInsideIn", longname="内部账户冲账输入接口" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApInsideIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS getStacps();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setStacps(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS stacps);
		
	 /**
	  * 账号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="账号")
		public String getTranac();
	 /**
	  * 账号
	  *
	  */
		public void setTranac(String tranac);
		
	 /**
	  * 借贷标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="借贷标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_AMNTCD getAmntcd();
	 /**
	  * 借贷标志
	  *
	  */
		public void setAmntcd(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_AMNTCD amntcd);
		
	 /**
	  * 交易序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易序号")
		public Long getTranno();
	 /**
	  * 交易序号
	  *
	  */
		public void setTranno(Long tranno);
		
	 /**
	  * 货币代号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="货币代号")
		public String getCrcycd();
	 /**
	  * 货币代号
	  *
	  */
		public void setCrcycd(String crcycd);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getTranam();
	 /**
	  * 交易金额
	  *
	  */
		public void setTranam(java.math.BigDecimal tranam);
		
	 /**
	  * 摘要代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="摘要代码")
		public String getSmrycd();
	 /**
	  * 摘要代码
	  *
	  */
		public void setSmrycd(String smrycd);
		
	 /**
	  * 红蓝字标记
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="红蓝字标记")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_COLOUR getColour();
	 /**
	  * 红蓝字标记
	  *
	  */
		public void setColour(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_COLOUR colour);
		
	 /**
	  * 原始主交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原始主交易流水")
		public String getOmtrsq();
	 /**
	  * 原始主交易流水
	  *
	  */
		public void setOmtrsq(String omtrsq);
		
		public String toString();
	

		}
	 /**
	  * 挂账冲账输入接口
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApHangUpIn", longname="挂账冲账输入接口" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApHangUpIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS getStacps();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setStacps(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS stacps);
		
	 /**
	  * 待销账序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="待销账序号")
		public String getStayno();
	 /**
	  * 待销账序号
	  *
	  */
		public void setStayno(String stayno);
		
	 /**
	  * 交易序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易序号")
		public Long getTranno();
	 /**
	  * 交易序号
	  *
	  */
		public void setTranno(Long tranno);
		
	 /**
	  * 借贷标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="借贷标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_AMNTCD getAmntcd();
	 /**
	  * 借贷标志
	  *
	  */
		public void setAmntcd(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_AMNTCD amntcd);
		
	 /**
	  * 货币代号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="货币代号")
		public String getCrcycd();
	 /**
	  * 货币代号
	  *
	  */
		public void setCrcycd(String crcycd);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getTranam();
	 /**
	  * 交易金额
	  *
	  */
		public void setTranam(java.math.BigDecimal tranam);
		
	 /**
	  * 摘要代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="摘要代码")
		public String getSmrycd();
	 /**
	  * 摘要代码
	  *
	  */
		public void setSmrycd(String smrycd);
		
	 /**
	  * 红蓝字标记
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="红蓝字标记")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_COLOUR getColour();
	 /**
	  * 红蓝字标记
	  *
	  */
		public void setColour(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_COLOUR colour);
		
	 /**
	  * 原始主交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原始主交易流水")
		public String getOmtrsq();
	 /**
	  * 原始主交易流水
	  *
	  */
		public void setOmtrsq(String omtrsq);
		
		public String toString();
	

		}
	 /**
	  * 销账冲账输入接口
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApUnHangIn", longname="销账冲账输入接口" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApUnHangIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrdsq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrdsq(String otrdsq);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS getStacps();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setStacps(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS stacps);
		
	 /**
	  * 待销账序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="待销账序号")
		public String getStayno();
	 /**
	  * 待销账序号
	  *
	  */
		public void setStayno(String stayno);
		
	 /**
	  * 交易序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易序号")
		public Long getTranno();
	 /**
	  * 交易序号
	  *
	  */
		public void setTranno(Long tranno);
		
	 /**
	  * 借贷标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="借贷标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_AMNTCD getAmntcd();
	 /**
	  * 借贷标志
	  *
	  */
		public void setAmntcd(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_AMNTCD amntcd);
		
	 /**
	  * 货币代号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="货币代号")
		public String getCrcycd();
	 /**
	  * 货币代号
	  *
	  */
		public void setCrcycd(String crcycd);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getTranam();
	 /**
	  * 交易金额
	  *
	  */
		public void setTranam(java.math.BigDecimal tranam);
		
	 /**
	  * 摘要代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="摘要代码")
		public String getZhaiyodm();
	 /**
	  * 摘要代码
	  *
	  */
		public void setZhaiyodm(String zhaiyodm);
		
	 /**
	  * 红蓝字标记
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="红蓝字标记")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_COLOUR getColour();
	 /**
	  * 红蓝字标记
	  *
	  */
		public void setColour(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_COLOUR colour);
		
	 /**
	  * 原始主交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原始主交易流水")
		public String getOmtrsq();
	 /**
	  * 原始主交易流水
	  *
	  */
		public void setOmtrsq(String omtrsq);
		
		public String toString();
	

		}
	 /**
	  * 开客户账号冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpOpcuIn", longname="开客户账号冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpOpcuIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS getStacps();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setStacps(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS stacps);
		
	 /**
	  * 客户账号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户账号")
		public String getTranac();
	 /**
	  * 客户账号
	  *
	  */
		public void setTranac(String tranac);
		
		public String toString();
	

		}
	 /**
	  * 销客户账号冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpClcuIn", longname="销客户账号冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpClcuIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS getStacps();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setStacps(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS stacps);
		
	 /**
	  * 客户账号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户账号")
		public String getTranac();
	 /**
	  * 客户账号
	  *
	  */
		public void setTranac(String tranac);
		
		public String toString();
	

		}
	 /**
	  * 开负债账号冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpOpenIn", longname="开负债账号冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpOpenIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS getStacps();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setStacps(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS stacps);
		
	 /**
	  * 负债账号 
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="负债账号 ")
		public String getTranac();
	 /**
	  * 负债账号 
	  *
	  */
		public void setTranac(String tranac);
		
		public String toString();
	

		}
	 /**
	  * 存款冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpSaveIn", longname="存款冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpSaveIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getYjiaoyrq();
	 /**
	  * 原交易日期
	  *
	  */
		public void setYjiaoyrq(String yjiaoyrq);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getYjiaoyls();
	 /**
	  * 原交易流水
	  *
	  */
		public void setYjiaoyls(String yjiaoyls);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_CZCZFLEI getCzczflei();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setCzczflei(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_CZCZFLEI czczflei);
		
	 /**
	  * 负债账号 
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="负债账号 ")
		public String getZhanghao();
	 /**
	  * 负债账号 
	  *
	  */
		public void setZhanghao(String zhanghao);
		
	 /**
	  * 交易序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易序号")
		public Long getJioyxuho();
	 /**
	  * 交易序号
	  *
	  */
		public void setJioyxuho(Long jioyxuho);
		
	 /**
	  * 借贷标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="借贷标志")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_JIEDAIBZ getJiedaibz();
	 /**
	  * 借贷标志
	  *
	  */
		public void setJiedaibz(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_JIEDAIBZ jiedaibz);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getJiaoyije();
	 /**
	  * 交易金额
	  *
	  */
		public void setJiaoyije(java.math.BigDecimal jiaoyije);
		
	 /**
	  * 摘要代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="摘要代码")
		public String getSmrycd();
	 /**
	  * 摘要代码
	  *
	  */
		public void setSmrycd(String smrycd);
		
	 /**
	  * 红蓝字记账标识
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="红蓝字记账标识")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_HOLZJZBZ getHolzjzbz();
	 /**
	  * 红蓝字记账标识
	  *
	  */
		public void setHolzjzbz(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_HOLZJZBZ holzjzbz);
		
	 /**
	  * 抹账标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="抹账标志")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_MOZHANBZ getMozhanbz();
	 /**
	  * 抹账标志
	  *
	  */
		public void setMozhanbz(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_MOZHANBZ mozhanbz);
		
		public String toString();
	

		}
	 /**
	  * 取款冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpDrawIn", longname="取款冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpDrawIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getYjiaoyrq();
	 /**
	  * 原交易日期
	  *
	  */
		public void setYjiaoyrq(String yjiaoyrq);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getYjiaoyls();
	 /**
	  * 原交易流水
	  *
	  */
		public void setYjiaoyls(String yjiaoyls);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_CZCZFLEI getCzczflei();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setCzczflei(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_CZCZFLEI czczflei);
		
	 /**
	  * 负债账号 
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="负债账号 ")
		public String getZhanghao();
	 /**
	  * 负债账号 
	  *
	  */
		public void setZhanghao(String zhanghao);
		
	 /**
	  * 交易序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易序号")
		public Long getJioyxuho();
	 /**
	  * 交易序号
	  *
	  */
		public void setJioyxuho(Long jioyxuho);
		
	 /**
	  * 借贷标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="借贷标志")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_JIEDAIBZ getJiedaibz();
	 /**
	  * 借贷标志
	  *
	  */
		public void setJiedaibz(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_JIEDAIBZ jiedaibz);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getJiaoyije();
	 /**
	  * 交易金额
	  *
	  */
		public void setJiaoyije(java.math.BigDecimal jiaoyije);
		
	 /**
	  * 摘要代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="摘要代码")
		public String getSmrycd();
	 /**
	  * 摘要代码
	  *
	  */
		public void setSmrycd(String smrycd);
		
	 /**
	  * 红蓝字记账标识
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="红蓝字记账标识")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_HOLZJZBZ getHolzjzbz();
	 /**
	  * 红蓝字记账标识
	  *
	  */
		public void setHolzjzbz(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_HOLZJZBZ holzjzbz);
		
	 /**
	  * 抹账标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="抹账标志")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_MOZHANBZ getMozhanbz();
	 /**
	  * 抹账标志
	  *
	  */
		public void setMozhanbz(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_MOZHANBZ mozhanbz);
		
		public String toString();
	

		}
	 /**
	  * 限额冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpLimit", longname="限额冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpLimit {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS getStacps();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setStacps(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS stacps);
		
	 /**
	  * 负债账号 
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="负债账号 ")
		public String getAcctno();
	 /**
	  * 负债账号 
	  *
	  */
		public void setAcctno(String acctno);
		
	 /**
	  * 客户账号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户账号")
		public String getCustac();
	 /**
	  * 客户账号
	  *
	  */
		public void setCustac(String custac);
		
	 /**
	  * 币种
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="币种")
		public String getCrcycd();
	 /**
	  * 币种
	  *
	  */
		public void setCrcycd(String crcycd);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getTranam();
	 /**
	  * 交易金额
	  *
	  */
		public void setTranam(java.math.BigDecimal tranam);
		
	 /**
	  * 产品代码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="产品代码")
		public String getChanpdma();
	 /**
	  * 产品代码
	  *
	  */
		public void setChanpdma(String chanpdma);
		
	 /**
	  * 客户账号类型
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户账号类型")
		public String getCsactp();
	 /**
	  * 客户账号类型
	  *
	  */
		public void setCsactp(String csactp);
		
	 /**
	  * 渠道条件
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="渠道条件")
		public String getChanid();
	 /**
	  * 渠道条件
	  *
	  */
		public void setChanid(String chanid);
		
	 /**
	  * 事件条件
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="事件条件")
		public String getEvenid();
	 /**
	  * 事件条件
	  *
	  */
		public void setEvenid(String evenid);
		
	 /**
	  * 场景条件
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="场景条件")
		public String getScenid();
	 /**
	  * 场景条件
	  *
	  */
		public void setScenid(String scenid);
		
		public String toString();
	

		}
	 /**
	  * 销负债账号冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpClosIn", longname="销负债账号冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpClosIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getYjiaoyrq();
	 /**
	  * 原交易日期
	  *
	  */
		public void setYjiaoyrq(String yjiaoyrq);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getYjiaoyls();
	 /**
	  * 原交易流水
	  *
	  */
		public void setYjiaoyls(String yjiaoyls);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_CZCZFLEI getCzczflei();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setCzczflei(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_CZCZFLEI czczflei);
		
	 /**
	  * 负债账号 
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="负债账号 ")
		public String getZhanghao();
	 /**
	  * 负债账号 
	  *
	  */
		public void setZhanghao(String zhanghao);
		
		public String toString();
	

		}
	 /**
	  * 冻结冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpFrozIn", longname="冻结冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpFrozIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS getStacps();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setStacps(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS stacps);
		
	 /**
	  * 原冻结编号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原冻结编号")
		public String getOfrono();
	 /**
	  * 原冻结编号
	  *
	  */
		public void setOfrono(String ofrono);
		
	 /**
	  * 原冻结序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原冻结序号")
		public Long getOfrozo();
	 /**
	  * 原冻结序号
	  *
	  */
		public void setOfrozo(Long ofrozo);
		
	 /**
	  * 原冻结终止日
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原冻结终止日")
		public String getOfrndt();
	 /**
	  * 原冻结终止日
	  *
	  */
		public void setOfrndt(String ofrndt);
		
	 /**
	  * 冻结终止日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冻结终止日期")
		public String getFreddt();
	 /**
	  * 冻结终止日期
	  *
	  */
		public void setFreddt(String freddt);
		
	 /**
	  * 原冻结分类码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原冻结分类码")
		public String getFrozcd();
	 /**
	  * 原冻结分类码
	  *
	  */
		public void setFrozcd(String frozcd);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getTranam();
	 /**
	  * 交易金额
	  *
	  */
		public void setTranam(java.math.BigDecimal tranam);
		
		public String toString();
	

		}
	 /**
	  * 解冻冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpThawIn", longname="解冻冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpThawIn {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 冲正冲账分类
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="冲正冲账分类")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS getStacps();
	 /**
	  * 冲正冲账分类
	  *
	  */
		public void setStacps(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_STACPS stacps);
		
	 /**
	  * 原冻结编号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原冻结编号")
		public String getOfrono();
	 /**
	  * 原冻结编号
	  *
	  */
		public void setOfrono(String ofrono);
		
	 /**
	  * 原冻结序号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原冻结序号")
		public Long getOfrozo();
	 /**
	  * 原冻结序号
	  *
	  */
		public void setOfrozo(Long ofrozo);
		
	 /**
	  * 原冻结分类码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原冻结分类码")
		public String getFrozcd();
	 /**
	  * 原冻结分类码
	  *
	  */
		public void setFrozcd(String frozcd);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getTranam();
	 /**
	  * 交易金额
	  *
	  */
		public void setTranam(java.math.BigDecimal tranam);
		
		public String toString();
	

		}
	 /**
	  * 倒起息冲正输入
	  * 计息起始日期指的是原倒起息的计息起始日
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpFallInst", longname="倒起息冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpFallInst {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 错账交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="错账交易金额")
		public java.math.BigDecimal getEracam();
	 /**
	  * 错账交易金额
	  *
	  */
		public void setEracam(java.math.BigDecimal eracam);
		
	 /**
	  * 错账借贷标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="错账借贷标志")
		public cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_ERACTG getEractg();
	 /**
	  * 错账借贷标志
	  *
	  */
		public void setEractg(cn.sunline.ltts.busi.sys.type.ApBaseEnumType.E_ERACTG eractg);
		
	 /**
	  * 计息起始日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="计息起始日期")
		public String getBgindt();
	 /**
	  * 计息起始日期
	  *
	  */
		public void setBgindt(String bgindt);
		
	 /**
	  * 负债账号 
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="负债账号 ")
		public String getAcctno();
	 /**
	  * 负债账号 
	  *
	  */
		public void setAcctno(String acctno);
		
	 /**
	  * 交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易日期")
		public String getTrandt();
	 /**
	  * 交易日期
	  *
	  */
		public void setTrandt(String trandt);
		
	 /**
	  * 交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易流水")
		public String getTransq();
	 /**
	  * 交易流水
	  *
	  */
		public void setTransq(String transq);
		
		public String toString();
	

		}
	 /**
	  * 日间付息冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpPayInst", longname="日间付息冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpPayInst {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 负债账号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="负债账号")
		public String getTranac();
	 /**
	  * 负债账号
	  *
	  */
		public void setTranac(String tranac);
		
		public String toString();
	

		}
	 /**
	  * 利息和利息税记账冲正输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApDpInstTally", longname="利息和利息税记账冲正输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApDpInstTally {
 	
	 /**
	  * 原交易日期
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易日期")
		public String getOtradt();
	 /**
	  * 原交易日期
	  *
	  */
		public void setOtradt(String otradt);
		
	 /**
	  * 原交易流水
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="原交易流水")
		public String getOtrasq();
	 /**
	  * 原交易流水
	  *
	  */
		public void setOtrasq(String otrasq);
		
	 /**
	  * 负债账号 
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="负债账号 ")
		public String getTranac();
	 /**
	  * 负债账号 
	  *
	  */
		public void setTranac(String tranac);
		
	 /**
	  * 借贷标志
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="借贷标志")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_AMNTCD getAmntcd();
	 /**
	  * 借贷标志
	  *
	  */
		public void setAmntcd(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_AMNTCD amntcd);
		
	 /**
	  * 交易金额
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易金额")
		public java.math.BigDecimal getTranam();
	 /**
	  * 交易金额
	  *
	  */
		public void setTranam(java.math.BigDecimal tranam);
		
		public String toString();
	

		}
	 /**
	  * 电子账户状态更新输入
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="IoApStrikeType.IoApCaUpacstIn", longname="电子账户状态更新输入" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface IoApCaUpacstIn {
 	
	 /**
	  * 客户账号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户账号")
		public String getCustac();
	 /**
	  * 客户账号
	  *
	  */
		public void setCustac(String custac);
		
	 /**
	  * 状态维度1
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="状态维度1")
		public String getDime01();
	 /**
	  * 状态维度1
	  *
	  */
		public void setDime01(String dime01);
		
	 /**
	  * 状态维度2
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="状态维度2")
		public String getDime02();
	 /**
	  * 状态维度2
	  *
	  */
		public void setDime02(String dime02);
		
	 /**
	  * 状态维度3
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="状态维度3")
		public String getDime03();
	 /**
	  * 状态维度3
	  *
	  */
		public void setDime03(String dime03);
		
	 /**
	  * 状态维度4
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="状态维度4")
		public String getDime04();
	 /**
	  * 状态维度4
	  *
	  */
		public void setDime04(String dime04);
		
	 /**
	  * 状态维度5
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="状态维度5")
		public String getDime05();
	 /**
	  * 状态维度5
	  *
	  */
		public void setDime05(String dime05);
		
	 /**
	  * 状态维度6
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="状态维度6")
		public String getDime06();
	 /**
	  * 状态维度6
	  *
	  */
		public void setDime06(String dime06);
		
	 /**
	  * 交易码
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="交易码")
		public String getPrcscd();
	 /**
	  * 交易码
	  *
	  */
		public void setPrcscd(String prcscd);
		
	 /**
	  * 面签标识
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="面签标识")
		public cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ getFacesg();
	 /**
	  * 面签标识
	  *
	  */
		public void setFacesg(cn.sunline.ltts.busi.sys.type.BaseEnumType.E_YES___ facesg);
		
		public String toString();
	

		}

}

