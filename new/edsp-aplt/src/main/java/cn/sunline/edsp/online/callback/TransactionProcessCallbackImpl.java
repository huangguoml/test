package cn.sunline.edsp.online.callback;

import java.util.Date;

import cn.sunline.edsp.plugin.dtsp.custom.extension.CustomServiceProcessCallback;
import cn.sunline.edsp.service.type.controller.IServiceController;
import cn.sunline.edsp.service.type.controller.IServiceControllerExtension;
import cn.sunline.ltts.base.RequestData;
import cn.sunline.ltts.base.ResponseData;
import cn.sunline.ltts.engine.data.DataArea;
import cn.sunline.ltts.engine.sequence.PackageSequence;
/**
 * 交易回调类接口
 * 
 * @author ljm
 * 
 *         </br>注：执行顺序
 *         <li> getTransactionController（交易）、getBizServiceController（服务）    获取控制器</li>
 *         <li> initpackageSequence 初始化流水信息</li>
 *         <li> beforeBizEnv（交易）、beforeBizServiceEnv（服务）    前处理，公共环境变量赋值</li>
 *         <li> getTransactionCode 外部处理码转换为内部交易码</li>
 *         <li> beforeProcess 交易前处理</li>
 *         <li> afterProcess 交易后处理</li>
 *         <li> exceptionProcess 业务异常处理</li>
 *         <li> afterBizEnv（交易）、afterBizServiceEnv（服务） 环境后处理，公共响应变量往报文赋值</li>
 *         <li> registPackageSequence 登记包流水表</li>
 *
 *  注：类中可以根据业务需要自行实现逻辑，这里使用平台中custom的实现逻辑
 *
 */
public class TransactionProcessCallbackImpl extends CustomServiceProcessCallback 
{
	/**
	 * 获取交易控制器的表信息<br/>
	 * 
	 * @param controllerId 控制器ID
	 *            
	 * @return 交易控制信息对象
	 */
	@Override
	public IServiceController getTransactionController(String controllerId) 
	{
		return super.getTransactionController(controllerId);
	}
	
	/**
	 * 获取服务控制器的表信息<br/>
	 * 
	 * @param serviceId 模型ID（服务FullId）
	 *            
	 * @return 服务控制信息对象
	 */
	@Override
	public IServiceControllerExtension getBizServiceController(String serviceId) 
	{
		return (IServiceControllerExtension) this.getTransactionController(serviceId);
	}
	
	/**
     * 初始化流水信息。
     * 
     * @param dataArea 交易数据区，包含程序运行需要的大部分数据
     * 
     * return 报文流水信息
     */
	@Override
    public PackageSequence initPackageSequence(DataArea dataArea)
	{
    	return super.initPackageSequence(dataArea);
    }
	
	/**
     * 交易环境前处理，公共环境变量赋值。
     * 
     * <p><b>注意：</b>该方法无需客户化重载。
     * 
     * @param dataArea 交易数据区
     * @see #afterBizEnv(DataAreaEx)
     */
	@Override
    public void beforeBizEnv(DataArea dataArea)
	{
    	super.beforeBizEnv(dataArea);
    }
    
	/**
     * 业务服务环境前处理，公共环境变量赋值。
     * 
     * @param dataArea 交易数据区
     * 
     */
	@Override
    public void beforeBizServiceEnv(DataArea dataArea)
    {
		super.beforeBizServiceEnv(dataArea);
    }
    
	/**
     * 外部处理码至内部交易码的转换。
     * 
     * @param prcscd 外部处理码
     * @param dataArea 交易数据区
     * 
     * @return 内部处理码
     */
    public String getTransactionCode(String prcscd, DataArea dataArea)
    {
    	return super.getTransactionCode(prcscd, dataArea);
    }
	
    /**
     * 交易前处理。可在此处进行事前权限检查。
     * 
     * @param dataArea 交易数据区
     */
    public void beforeProcess(DataArea dataArea)
    {
    	super.beforeProcess(dataArea);
    }
    
    /**
     * 交易成功处理完成后调用。压力测试时可以在这里清除压力测试数据
     * 
     * 公共响应变量映射。
     * 
     * @param dataArea 交易数据区
     */
    @Override
    public void afterProcess(DataArea dataArea)
    {
    	super.afterProcess(dataArea);
    }
    
    /**
     * 业务异常处理
     * 
     * @param dataArea 交易数据区
     * @param e 业务异常信息
     * 
     */
    @Override
    public void exceptionProcess(DataArea dataArea, Throwable e)
    {
    	super.exceptionProcess(dataArea, e);
    }
    
    /**
     * 业务服务环境后处理，公共响应变量往报文赋值。
     */
    @Override
    public void afterBizServiceEnv(DataArea dataArea)
    {
    	super.afterBizServiceEnv(dataArea);
    }
    
    /**
     * 交易环境后处理，公共响应变量往报文赋值。
     * 
     * <p><b>注意：</b>该方法无需客户化重载。
     * 
     * @param dataArea 交易数据区
     * @see #beforeBizEnv(DataAreaEx)
     */
    @Override
    public void afterBizEnv(DataArea dataArea)
    {
    	super.afterBizEnv(dataArea);
    }
    
    /**
     * 登记kms_tran流水
     * 
     * @param pckgsq 报文流水
     * @param pckgdt 报文日期
     * @param request 请求数据
     * @param response 响应数据
     * @param beginTime 开始时间
     * @param cause 错误堆栈
     * @param autonomous 是否独立事务提交
     */
    @Override
    public void registPackageSequence(String pckgsq, String pckgdt,RequestData request, ResponseData response,Date beginTime,Throwable cause, boolean autonomous)
    {
    	super.registPackageSequence(pckgsq, pckgdt, request, response, beginTime, cause, autonomous);
    }
}
