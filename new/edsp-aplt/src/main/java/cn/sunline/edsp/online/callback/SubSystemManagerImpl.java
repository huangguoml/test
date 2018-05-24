package cn.sunline.edsp.online.callback;

import cn.sunline.edsp.rpc.plugin.spi.impl.DefaultSubSystemManager;
import cn.sunline.edsp.rpc.plugin.util.DataAreaUtil;
/**
 * 控制子系统之间调用的扩展点实现
 * 注：可根据业务需要自行实现逻辑，这里使用平台默认实现
 * 
 * @author ljm
 *
 */
public class SubSystemManagerImpl extends DefaultSubSystemManager 
{
	/**
	 * 判断是否属于Core或Batch子系统，用于控制业务服务可以在Core或Batch本地调用<br/>
	 * 如果是集中式系统则默认返回false即可，分布式式系统返回true则不走外调，返回false走外调
	 * 
	 * @param targetId 目标子系统ID
	 * @param callSysId 当前子系统ID
	 * 
	 * @return true-是，false-不是
	 */
	@Override
	public boolean isCoreOrBatch(String targetId, String callSysId)
	{
		return super.isCoreOrBatch(targetId, callSysId);
	}
	
	/**
	 * 是否为域内子系统，用于识别是否外调其他子系统服务（报文处理方式不太一样）<br/>
	 * 此方法在分布式系统RPC外调接入时候使用<br/>
	 * 当有客户端外调过来时此方法根据字系统标识判断是否是内部的系统，是则执行服务处理，不是则不执行处理，并抛出异常<br/>
	 * {@link DataAreaUtil#toFlowRequestData(String, cn.sunline.ltts.engine.data.DataArea)}}
	 * 
	 * @param consumerSystemId 客户端的子系统标识
	 * 
	 * return true-是内部系统，false-不是内部系统
	 */
	@Override
	public boolean isInnerSys(String consumerSystemId)
	{
		return super.isInnerSys(consumerSystemId);
	}
	
}
