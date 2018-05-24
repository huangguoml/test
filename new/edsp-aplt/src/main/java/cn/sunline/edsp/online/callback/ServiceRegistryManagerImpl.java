package cn.sunline.edsp.online.callback;

import java.util.List;

import cn.sunline.edsp.plugin.dtsp.custom.extension.CustomRPCServiceProcess;
import cn.sunline.edsp.service.type.controller.IServiceRegistry;
import cn.sunline.ltts.core.api.logging.BizLog;
import cn.sunline.ltts.core.api.logging.BizLogUtil;
/**
 *  获取服务注册信息<br/>
 * 1、每个服务如果需要对外提供服务的话，需要将自身的服务信息注册到注册中心<br/>
 * 2、每次服务访问的时候，需要通过已注册的服务信息来判断当前JVM是否注册了该服务，若未注册则拒绝访问<br/>
 * 
 *  注：类中的方法可以根据业务逻辑更改实现，这里使用平台的默认实现逻辑。<br/>
 *    平台默认实现使用表ksys_fwcjxx配置，自行实现时可以参考此表进行配置
 * 
 * @author LJM
 *
 */
public class ServiceRegistryManagerImpl extends CustomRPCServiceProcess 
{
	private static final BizLog logger = BizLogUtil.getBizLog(ServiceRegistryManagerImpl.class);
	
	/**
	 * 查询服务注册信息：通过外部访问标识查询表中该服务是否暴露出去（模型ID）
	 * 
	 * @param visitidentity 外部调用标识
	 * 
	 * @return 服务注册信息
	 */
	@Override
	public IServiceRegistry getServiceRegistry(String visitIdentity) 
	{
		logger.info("***getServiceRegistry***");
		return super.getServiceRegistry(visitIdentity);
	}

	
	/**
	 * 获取当前JVM需要注册的服务列表
	 * 
	 * @param subSystemId 子系统id，相当于是注册服务的一种类别
	 * 
	 * @return 服务注册信息List
	 */
	@Override
	public List<IServiceRegistry> getServiceRegistryList(String subSystemId) 
	{
		logger.info("***getServiceRegistryList***");
		return super.getServiceRegistryList(subSystemId);
	}
	
}
