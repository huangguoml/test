package cn.sunline.edsp.online.callback;

import cn.sunline.edsp.service.type.service.ServiceRequest;
import cn.sunline.edsp.service.type.service.ServiceResponse;
import cn.sunline.edsp.service.type.spi.ServiceProcessPointExtension;
import cn.sunline.ltts.core.api.logging.BizLog;
import cn.sunline.ltts.core.api.logging.BizLogUtil;
/**
 * 服务调用处理扩展 实现 （追加方式），对所有服务有效
 * 
 * <li>1.服务调用前处理 </li>
 * <li>2.服务调用后处理  </li>
 * <li>3.服务调用异常处理  </li><br/>
 * 
 * 注：类中的方法可根据业务需要编写处理逻辑
 * 
 * @author ljm
 */
public class ServiceProcessPointExtensionImpl implements ServiceProcessPointExtension
{
	private static final BizLog logger = BizLogUtil.getBizLog(ServiceProcessPointExtensionImpl.class);

	/**
	 * 服务前处理
	 * 
	 * @param isLocal 是否本地服务执行
	 * @param serviceRequest 服务请求数据
	 */
	@Override
	public void serviceProcessBefore(boolean isLocal, ServiceRequest serviceRequest) 
	{
		logger.info("******serviceProcessBefore******");
	}

	/**
	 * 服务后处理
	 * 
	 * @param isLocal 是否本地服务执行
	 * @param serviceRequest 服务请求数据
	 * @param serviceResponse 服务响应数据
	 */
	@Override
	public void serviceProcessAfter(boolean isLocal, ServiceRequest serviceRequest, ServiceResponse serviceResponse) 
	{
		logger.info("******serviceProcessAfter******");
	}

	/**
	 * 服务异常处理
	 * 
	 * @param isLocal 是否本地服务执行
	 * @param isCommit 本地事务是否已提交
	 * @param serviceRequest 服务请求数据
	 * @param serviceResponse 服务响应数据
	 * @param ex 异常信息
	 */
	@Override
	public void serviceProcessException(boolean isLocal, boolean isCommit, ServiceRequest serviceRequest, ServiceResponse serviceResponse, Exception ex) 
	{
		logger.info("******serviceProcessException******");
	}
}
