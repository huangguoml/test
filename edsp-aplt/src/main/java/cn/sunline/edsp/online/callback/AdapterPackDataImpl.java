package cn.sunline.edsp.online.callback;

import java.util.Map;

import cn.sunline.edsp.rpc.plugin.spi.impl.DefautlAdataRequestDataImpl;
import cn.sunline.ltts.core.api.logging.BizLog;
import cn.sunline.ltts.core.api.logging.BizLogUtil;
/**
 * RPC接入报文转换器
 * 注：可根据业务需要在这里编写报文转换逻辑，这里使用平台默认实现（默认实现中不做报文转换）
 * 
 * @author ljm
 *
 */
public class AdapterPackDataImpl extends DefautlAdataRequestDataImpl
{
	//日志打印
	private static final BizLog logger = BizLogUtil.getBizLog(AdapterPackDataImpl.class);

	/**
	 * 将传入的原始报文转换为平台内部JSON字符串
	 * 
	 * @param original 原始报文
	 * @param mapHeader 客户端IP和端口、服务端的服务三要素
	 * 
	 * @return 转换后的报文
	 */
	@Override
	public String toFlowRequestData(String original,Map<String, String> mapHeader) 
	{
		logger.info("*******toFlowRequestData******");
		return super.toFlowRequestData(original, mapHeader);
	}
	
	/**
	 * 平台处理完后返回转换后的JSON报文字符串
	 * 
	 * @param end 平台处理后的报文
	 * 
	 * @return 转换后的报文
	 */
	@Override
	public String toResponseData(String end) 
	{
		logger.info("*******toResponseData******");
		return super.toResponseData(end);
	}

}
