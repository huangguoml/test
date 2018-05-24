package cn.sunline.edsp.app;

import cn.sunline.edsp.microcore.Bootstrap;
import cn.sunline.ltts.core.api.config.ConfigManagerFactory;

/**
 * 
 * 客户系统服务启动类
 * 
 * @author ljm
 *
 */
public class Application 
{
	//启动方法
	public static void main(String[] args) 
	{
		// 默认配置的指定
	    System.setProperty(ConfigManagerFactory.SETTING_FILE,"setting.dev.properties");
	    System.setProperty("log4j.configurationFile", "ltts_log_dev.xml");
		System.setProperty("ltts.home", System.getProperty("user.dir"));
		System.setProperty("ltts.vmid", "CustInfoServer");
		System.setProperty("ltts.log.home", "logs");
		
		//启动
		Bootstrap.main(new String[]{"start"});
	}
}
