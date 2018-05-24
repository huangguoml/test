package cn.sunline.edsp.demo.test.serviceimpl;

import cn.sunline.edsp.demo.test.tables.DemoTable.Kapp_demo_accountinfoDao;
import cn.sunline.edsp.demo.test.tables.DemoTable.kapp_demo_accountinfo;
import cn.sunline.ltts.biz.global.SysUtil;
import cn.sunline.ltts.core.api.logging.BizLog;
import cn.sunline.ltts.core.api.logging.BizLogUtil;

/**
 * 账户服务实现
 * 
 */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.ConfigType(value = "AccountInfoImpl", longname = "账户服务实现", type = cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)
public class AccountInfoImpl implements cn.sunline.edsp.demo.test.servicetype.AccountInfo 
{
	
	private static final BizLog logger = BizLogUtil.getBizLog(AccountInfoImpl.class);
	
	/**
	 * 创建账户信息
	 * 
	 */
	public void createAccountInfo(
			final cn.sunline.edsp.demo.test.servicetype.AccountInfo.createAccountInfo.Input input,
			final cn.sunline.edsp.demo.test.servicetype.AccountInfo.createAccountInfo.Output output) 
	{
		logger.info("*** createAccountInfo ***");
		
		kapp_demo_accountinfo info = SysUtil.getInstance(kapp_demo_accountinfo.class);
		
		String accountno = "0168" + System.currentTimeMillis();
		String busiSerialNum = "busi" + System.currentTimeMillis();
		info.setAccountno(accountno);
		info.setCustid(input.getCustid());
		info.setPwd(input.getPwd());
		info.setOpentdate(input.getOpentdate());
		info.setClosedate(input.getClosedate());
		info.setAccountstatus(input.getAccountstatus());
		info.setAccountserialnum(busiSerialNum);
		info.setWaiterno(input.getWaiterno());
		info.setBusistatus(input.getBusistatus());
		
		Kapp_demo_accountinfoDao.insert(info);
		
		output.setAccountno(accountno);
		output.setAccountstatus(input.getAccountstatus());
		output.setAccountserialnum(busiSerialNum);
	}
}
