package cn.sun.edsp.plugin;

import cn.sunline.ltts.core.api.logging.SysLog;
import cn.sunline.ltts.core.api.logging.SysLogUtil;
import cn.sunline.ltts.core.plugin.PluginSupport;

/**
 * aplt插件<br/>
 * 在系统启动的时候会按照插件定义的顺序启动此插件
 * 
 * @author ljm
 *
 */
public class ApltPlugin extends PluginSupport
{
	//系统日志对象
	private static final SysLog logger = SysLogUtil.getBootLogger();
	
	
	/**
	 * 插件初始化，在此方法中可以执行一些插件的初始化逻辑
	 * 
	 * return true--插件初始化成功，可以启动插件，false--插件初始化失败，不启动该插件
	 * 
	 */
	@Override
	public boolean initPlugin() 
	{
		logger.info("****initPlugin***");
		return true;
	}

	/**
	 * 启动插件
	 */
	@Override
	public void startupPlugin() 
	{
		logger.info("****startupPlugin***");
	}

	/**
	 * 停止插件
	 */
	@Override
	public void shutdownPlugin() 
	{
		logger.info("****shutdownPlugin***");
	}
}
