
package cn.sunline.ltts.busi.online.trans.namedsql;

@cn.sunline.ltts.frw.model.annotation.Generated
/**
* 分页测试--
* @author 
* @Date 
*/
public class PageDao {

	
	/**
	 * sql[查询分页测试]的fullId
	 *
	 */
	public static final String namedsql_selectPageInfo = "Page.selectPageInfo";
			
   /**
	 * 查询分页测试
	 *
	 * <p>
	 *
	 *
 	 * @return Page 翻页实例
	 * @exception cn.sunline.ltts.core.api.exception.LTTSDaoLockException [] Failed!Lock timeouts!
	 */
	public static cn.sunline.ltts.core.api.lang.Page<cn.sunline.ltts.busi.online.trans.tables.OnlineT.kapp_custInfo> selectPageInfo(long start, long count, long totlCount , boolean nullException)throws cn.sunline.ltts.core.api.exception.LTTSSqlRuntimeException, cn.sunline.ltts.core.api.exception.LTTSDaoLockException , cn.sunline.ltts.core.api.exception.LTTSDaoNoDataFoundException {
		try {
			return cn.sunline.ltts.busi.sdk.util.DaoUtil.selectPageWithCount(namedsql_selectPageInfo, new cn.sunline.ltts.core.api.lang.Params() ,(int)start, (int)count, (int)totlCount, nullException);		
		}  catch (cn.sunline.ltts.core.api.exception.LTTSDaoNoDataFoundException e2) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoNoDataFoundException("[查询分页测试] Failed! Can't find the corresponding record.", e2);
		} catch (cn.sunline.ltts.core.api.exception.LTTSDaoLockException e4) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoLockException("[查询分页测试] Failed!Lock timeouts!", e4);
		}catch (cn.sunline.ltts.core.api.exception.LTTSDaoException e5) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoException("[查询分页测试] Failed! There are other errors!", e5);
		}
	}
	
   /**
	 * 查询分页测试
	 *
	 * <p>
	 *
	 *
	 * @return java.util.List<OnlineT.kapp_custInfo>
	 * @exception cn.sunline.ltts.core.api.exception.LTTSDaoLockException [] Failed!Lock timeouts!
	 */
	public static java.util.List<cn.sunline.ltts.busi.online.trans.tables.OnlineT.kapp_custInfo> selectPageInfo(long start, long count , boolean nullException)throws cn.sunline.ltts.core.api.exception.LTTSSqlRuntimeException, cn.sunline.ltts.core.api.exception.LTTSDaoLockException , cn.sunline.ltts.core.api.exception.LTTSDaoNoDataFoundException {
		try {
			return cn.sunline.ltts.busi.sdk.util.DaoUtil.selectPage(namedsql_selectPageInfo, new cn.sunline.ltts.core.api.lang.Params() ,(int)start, (int)count, nullException);		
		}  catch (cn.sunline.ltts.core.api.exception.LTTSDaoNoDataFoundException e2) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoNoDataFoundException("[查询分页测试] Failed! Can't find the corresponding record.", e2);
		} catch (cn.sunline.ltts.core.api.exception.LTTSDaoLockException e4) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoLockException("[查询分页测试] Failed!Lock timeouts!", e4);
		}catch (cn.sunline.ltts.core.api.exception.LTTSDaoException e5) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoException("[查询分页测试] Failed! There are other errors!", e5);
		}
	}
	
   /**
	 * 查询分页测试
	 *
	 * <p>
	 *
	 *
 	 * @return Page 翻页实例
	 * @exception cn.sunline.ltts.core.api.exception.LTTSDaoLockException [] Failed!Lock timeouts!
	 */
	public static cn.sunline.ltts.core.api.lang.Page<cn.sunline.ltts.busi.online.trans.tables.OnlineT.kapp_custInfo> selectPageInfo_mds(long start, long count, long totlCount , boolean nullException)throws cn.sunline.ltts.core.api.exception.LTTSSqlRuntimeException, cn.sunline.ltts.core.api.exception.LTTSDaoLockException , cn.sunline.ltts.core.api.exception.LTTSDaoNoDataFoundException {
		try {
			return cn.sunline.ltts.busi.sdk.util.DaoUtil.querySqlPage_mds(namedsql_selectPageInfo, new cn.sunline.ltts.core.api.lang.Params() ,(int)start, (int)count, (int)totlCount, nullException);		
		}  catch (cn.sunline.ltts.core.api.exception.LTTSDaoNoDataFoundException e2) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoNoDataFoundException("[查询分页测试] Failed! Can't find the corresponding record.", e2);
		} catch (cn.sunline.ltts.core.api.exception.LTTSDaoLockException e4) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoLockException("[查询分页测试] Failed!Lock timeouts!", e4);
		}catch (cn.sunline.ltts.core.api.exception.LTTSDaoException e5) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoException("[查询分页测试] Failed! There are other errors!", e5);
		}
	}
	

}