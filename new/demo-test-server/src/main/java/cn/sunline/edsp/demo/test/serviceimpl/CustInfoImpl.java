package cn.sunline.edsp.demo.test.serviceimpl;

import cn.sunline.edsp.demo.test.tables.DemoTable.Kapp_demo_custinfoDao;
import cn.sunline.edsp.demo.test.tables.DemoTable.kapp_demo_custinfo;
import cn.sunline.ltts.biz.global.SysUtil;
import cn.sunline.ltts.core.api.logging.BizLog;
import cn.sunline.ltts.core.api.logging.BizLogUtil;

/**
 * 客户信息服务实现
 * 
 */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.ConfigType(value = "CustInfoImpl", longname = "客户信息服务实现", type = cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)
public class CustInfoImpl implements
		cn.sunline.edsp.demo.test.servicetype.CustInfo {
	
	private static final BizLog logger = BizLogUtil.getBizLog(CustInfoImpl.class);
	
	/**
	 * 创建客户信息服务
	 * 
	 */
	public void createCustInfo(
			final cn.sunline.edsp.demo.test.servicetype.CustInfo.createCustInfo.Input input,
			final cn.sunline.edsp.demo.test.servicetype.CustInfo.createCustInfo.Output output) 
	{
		logger.info("******createCustInfo******");
		
		kapp_demo_custinfo cust = SysUtil.getInstance(kapp_demo_custinfo.class);
		
		String custId = "000" + System.currentTimeMillis();
		String custserialnum = "busi" + System.currentTimeMillis();
		cust.setCustid(custId);
		cust.setCustname(input.getCustname());
		cust.setIdcardno(input.getIdcardno());
		cust.setTelenum(input.getTelenum());
		cust.setAddr(input.getAddr());
		cust.setBusistatus(input.getBusistatus());
		cust.setCustserialnum(custserialnum);
		
		//添加记录
		Kapp_demo_custinfoDao.insert(cust);
		
		output.setCustid(custId);
		output.setBusistatus(input.getBusistatus());
		output.setCustserialnum(custserialnum);
	}
}
