
package cn.sunline.ltts.busi.online.trans.serviceimpl;

import cn.sunline.ltts.biz.global.SysUtil;
import cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo.createCust.Input;
import cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo.createCust.Output;
import cn.sunline.ltts.busi.online.trans.tables.OnlineT.kapp_custInfo;


 /**
  * 创建客户实现类
  *
  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="SaveCustInfoImpl", longname="创建客户实现类", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)
public class SaveCustInfoImpl implements cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo{

	public void addCustomer(Input input, Output output) {
		// TODO Auto-generated method stub
		
	}

	public void addAcctInfo(
			cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo.createAcct.Input input,
			cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo.createAcct.Output output) {
		// TODO Auto-generated method stub
		
	}
//
//	@Override
//	public void addCustomer(Input input, Output output) {
//		String address = input.getAddress();
//		String telphone = input.getTelphone();
//		String username = input.getUsername();
//		kapp_custInfo custInfo = SysUtil.getInstance(kapp_custInfo.class);
//		custInfo.setAddress(address);
//		custInfo.setTelphone(telphone);
//		custInfo.setUsername(username);
//		custInfo.setCustno("abcd123");
//		output.setCustno("abcd123");
//	}
//
//	@Override
//	public void addAcctInfo(
//			cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo.createAcct.Input input,
//			cn.sunline.ltts.busi.online.trans.servicetype.SaveCustInfo.createAcct.Output output) {
//		System.err.println("得到："+input.getCustno());
//		output.getAccoutno();
//	}

}

