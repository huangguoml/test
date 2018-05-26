
package cn.sunline.ltts.busi.online.trans.tables;

	 /**
	  * 联机表
	  *
	  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index

public interface OnlineT {
	 /**
	  * 客户基本信息表
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Index
		@cn.sunline.ltts.frw.model.annotation.ConfigType(value="OnlineT.kapp_custInfo", longname="客户基本信息表" , type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
		public static interface kapp_custInfo {
 	
	 /**
	  * 用户名
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="用户名")
		public String getUsername();
	 /**
	  * 用户名
	  *
	  */
		public void setUsername(String username);
		
	 /**
	  * 地址
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="地址")
		public String getAddress();
	 /**
	  * 地址
	  *
	  */
		public void setAddress(String address);
		
	 /**
	  * 电话
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="电话")
		public String getTelphone();
	 /**
	  * 电话
	  *
	  */
		public void setTelphone(String telphone);
		
	 /**
	  * 客户号
	  *
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="客户号")
		public String getCustno();
	 /**
	  * 客户号
	  *
	  */
		public void setCustno(String custno);
		
		public String toString();
	

		}
	
	/**
	  *	kapp_custInfo--客户基本信息表
	  */
	public static class Kapp_custInfoDao {
		/**
		  * 新增客户基本信息表
		  * @param entity 表实体对象
		  * @return 影响的记录数
		  * @exception LTTSDaoDuplicateException 重复键异常
		  * @exception LTTSDaoLockException 锁等待超时
		  * @exception LTTSDaoException 数据库操作的通用异常，即SQLException
		  */
		@cn.sunline.ltts.frw.model.annotation.Statement(sql="insert into kapp_custInfo(username, address, telphone, custno) values (#username#, #address#, #telphone#, #custno#)")
		public static int insert(cn.sunline.ltts.busi.online.trans.tables.OnlineT.kapp_custInfo entity) throws cn.sunline.ltts.core.api.exception.LTTSDaoException, cn.sunline.ltts.core.api.exception.LTTSDaoDuplicateException , cn.sunline.ltts.core.api.exception.LTTSDaoLockException{
			try {
				return cn.sunline.ltts.busi.sdk.util.DaoUtil.insert(cn.sunline.ltts.busi.online.trans.tables.OnlineT.kapp_custInfo.class, entity);
			} catch (cn.sunline.ltts.core.api.exception.LTTSDaoDuplicateException e1) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoDuplicateException("Register[客户基本信息表] failed,and it has been recorded!", e1);
			} catch (cn.sunline.ltts.core.api.exception.LTTSDaoLockException e2) {
                throw new cn.sunline.ltts.core.api.exception.LTTSDaoLockException("Register[客户基本信息表] failed,and lock waiting leads to timeouts!", e2);
            } catch (cn.sunline.ltts.core.api.exception.LTTSDaoException e3) {
				throw new cn.sunline.ltts.core.api.exception.LTTSDaoException("", e3);
			}
		}
		/**
		  * 新增客户基本信息表
		  * @param entity 表实体对象
		  * @return id 插入记录的id
		  * @exception LTTSDaoDuplicateException 重复键异常
		  * @exception LTTSDaoLockException 锁等待超时
		  * @exception LTTSDaoException 数据库操作的通用异常，即SQLException
		  */
		@cn.sunline.ltts.frw.model.annotation.Statement(sql="insert into kapp_custInfo(username, address, telphone, custno) values (#username#, #address#, #telphone#, #custno#)")
		public static int insertWithReturnKey(cn.sunline.ltts.busi.online.trans.tables.OnlineT.kapp_custInfo entity) throws cn.sunline.ltts.core.api.exception.LTTSDaoException, cn.sunline.ltts.core.api.exception.LTTSDaoDuplicateException , cn.sunline.ltts.core.api.exception.LTTSDaoLockException{
			try {
				return cn.sunline.ltts.busi.sdk.util.DaoUtil.insertWithReturnKey(cn.sunline.ltts.busi.online.trans.tables.OnlineT.kapp_custInfo.class, entity);
			} catch (cn.sunline.ltts.core.api.exception.LTTSDaoDuplicateException e1) {
			throw new cn.sunline.ltts.core.api.exception.LTTSDaoDuplicateException("Register[客户基本信息表] failed,and it has been recorded!", e1);
			} catch (cn.sunline.ltts.core.api.exception.LTTSDaoLockException e2) {
                throw new cn.sunline.ltts.core.api.exception.LTTSDaoLockException("Register[客户基本信息表] failed,and lock waiting leads to timeouts!", e2);
            } catch (cn.sunline.ltts.core.api.exception.LTTSDaoException e3) {
				throw new cn.sunline.ltts.core.api.exception.LTTSDaoException("", e3);
			}
		}
		
	}

}

