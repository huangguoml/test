package cn.sunline.edsp.online.callback;

import java.util.List;

import cn.sunline.ltts.base.dao.Operator;
import cn.sunline.ltts.base.dao.callback.EntityDaoProcessCallBack;
import cn.sunline.ltts.base.dao.clog.Clog;
import cn.sunline.ltts.core.api.logging.BizLog;
import cn.sunline.ltts.core.api.logging.BizLogUtil;
/**
 * dao处理回调类实现<br/>
 * 类中的方法只对继承了公共表字段的表的DAO操作有效,并需要在setting文件中增加相应的DAO服务配置项<br/>
 * 增加相应的DAO服务配置项 ，例如：DAO服务.是否处理参数=true<br/>
 * 注：类中的方法可根据业务需要编写处理逻辑
 * 
 * @author ljm
 *
 */
public class EntityDaoProcessCallBackImpl implements EntityDaoProcessCallBack 
{
	private static final BizLog logger = BizLogUtil.getBizLog(EntityDaoProcessCallBackImpl.class);
	
	/**
	 * dao前处理
	 * 
	 * @param tableType 表类型
	 * @param op 操作类型
	 * @param parameters dao操作参数值
	 * 
	 * 注：执行dao操作之前执行的处理，通常用于公共字段的赋值
	 */
	@Override
	public void beforeDaoProcess(final Class<?> tableType, Operator op, final Object parameters)
	{
		logger.info("***--dao前处理--***");
	}
	
	/**
	 * 参数检查
	 * 
	 * @param oldEntity 旧值
	 * @param newEntity 新值
	 * @param op 操作类型
	 * @return 检查结果 true-参数合法 false-参数不合法
	 * 
	 * 注：通常在update操作是做数据一致性检查时调用
	 */
	@Override
	public boolean checkParm(final Object oldEntity, final Object newEntity, Operator op)
	{
		logger.info("***--dao参数检查--***");
		return true;
	}
	
	/**
	 * 参数处理
	 * 
	 * @param tableType 表类型
	 * @param op 操作类型
	 * @param newEntity dao操作参数值，在此参数对象中处理参数
	 * 
	 * 注：用于在执行sql处理之前做一些数据的加密、赋值等操作；只会在update/insert操作是调用
	 */
	@Override
	public void parameterProcess(final Class<?> tableType, Operator op, final Object newEntity)
	{
		logger.info("***--dao参数处理--***");
	}
	
	/**
	 * 结果集处理
	 * @param tableType 表类型
	 * @param op 操作类型
	 * @param result 需要处理的数据及处理后的结果
	 */
	@Override
	public void resultProcess(final Class<?> tableType, Operator op, final Object result)
	{
		logger.info("***--dao结果集处理--***");
	}
	
	
	/**
	 * 登记数据变更日志
	 * 
	 * @param entity 变更信息
	 * @return 影响记录数
	 * 
	 * 注：用于update/insert/delete操作的时候登记数据变更信息
	 */
	@Override
	public int registerChangeLog(Clog entity)
	{
		logger.info("***--dao登记数据变更日志--***");
		return 0;
	}
	
	/**
	 * 登记数据变更日志
	 * 
	 * @param entity 变更信息list
	 * @return 影响记录数数组
	 * 
	 * 注：用于update/insert/delete操作的时候登记数据变更信息
	 */
	@Override
	public int[] registerChangeLogs(List<Clog> entitys)
	{
		logger.info("***--dao登记数据变更日志--***");
		return new int[0];
	}

	
	//以下方法不推荐使用
	
	/**
	 * dao前处理
	 * @param parameters
	 * <br/>注：执行dao操作之前执行的处理，通常用于公共字段的赋值
	 */
    @Deprecated
	@Override
	public void beforeDaoProcess(Class<?> paramClass, Object paramObject) {
		// TODO Auto-generated method stub
		
	}

    /**
	 * 参数检查
	 * @param oldEntity 旧值
	 * @param newEntity 新值
	 * @return 检查结果 true-参数合法 false-参数不合法
	 * <br/>注：通常在update操作是做数据一致性检查时调用
	 */
    @Deprecated
	@Override
	public boolean checkParm(Object paramObject1, Object paramObject2) {
		// TODO Auto-generated method stub
		return false;
	}

    /**
	 * 参数处理
	 * @param tableType 表类型
	 * @param newEntity 新值
	 * <br/>注：用于在执行sql处理之前做一些数据的加密、赋值等操作；只会在update/insert操作是调用
	 */
    @Deprecated
	@Override
	public void parameterProcess(Class<?> paramClass, Object paramObject) {
		// TODO Auto-generated method stub
		
	}

    /**
	 * 结果集处理
	 * @param tableType 表类型
	 * @param result	处理后返回对象
	 */
    @Deprecated
	@Override
	public void resultProcess(Class<?> paramClass, Object paramObject) {
		// TODO Auto-generated method stub
		
	}
}
