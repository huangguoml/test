
package cn.sunline.ltts.busi.online.trans.trans;

import java.util.List;


import cn.sunline.ltts.biz.global.SysUtil;
import cn.sunline.ltts.busi.online.trans.namedsql.PageDao;
import cn.sunline.ltts.busi.online.trans.tables.OnlineT.kapp_custInfo;
import cn.sunline.ltts.busi.sdk.util.DaoUtil;
import cn.sunline.ltts.core.api.logging.BizLog;
import cn.sunline.ltts.core.api.logging.BizLogUtil;


public class tr002 {
    private static final BizLog logger = BizLogUtil.getBizLog(tr002.class);
    public static void cteate( final cn.sunline.ltts.busi.online.trans.trans.intf.Tr002.Input input,  final cn.sunline.ltts.busi.online.trans.trans.intf.Tr002.Property property,  final cn.sunline.ltts.busi.online.trans.trans.intf.Tr002.Output output){
       // kapp_custInfo kapp_custInfo = SysUtil.getInstance(kapp_custInfo.class);
        List<kapp_custInfo> selectPage = DaoUtil.selectPage( PageDao.namedsql_selectPageInfo, null,0, 2);
       System.out.println( selectPage.size());
        for (kapp_custInfo kapp_custInfo : selectPage) {
            System.out.println(kapp_custInfo);
        }
    }
}
