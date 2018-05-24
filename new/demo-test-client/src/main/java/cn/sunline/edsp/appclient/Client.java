package cn.sunline.edsp.appclient;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import cn.sunline.edsp.component.rpc.api.ReferenceConfigSun;
import cn.sunline.edsp.component.rpc.common.constants.RPCParamType;
import cn.sunline.edsp.component.rpc.common.module.AccessId;
import cn.sunline.edsp.component.rpc.rpcx.handler.RPCResult;
import cn.sunline.edsp.microcore.Bootstrap;
import cn.sunline.edsp.midware.base.model.URL;
import cn.sunline.edsp.midware.rpc.api.config.RegistryConfig;
import cn.sunline.edsp.midware.rpc.api.consumer.RPCConsumer;
import cn.sunline.ltts.core.api.config.ConfigManagerFactory;

/**
 * 测试
 *
 * @author lry
 */
public class Client {

	// 注册中心url
	private static final String registryURL = "zookeeper://127.0.0.1:2181?session=100000";

	private static Map<String, String> map = new HashMap<String, String>();
	static String confPath = "src/main/resources/json/";

	public static void main(String[] args) {
		System.setProperty(ConfigManagerFactory.SETTING_FILE, "setting.dev.properties");
		System.setProperty("log4j.configurationFile", "ltts_log_dev.xml");
		System.setProperty("ltts.home", System.getProperty("user.dir"));
		System.setProperty("ltts.vmid", "clientApp");
		System.setProperty("ltts.log.home", "logs");
		Bootstrap.start();

		String serviceId = "CI0001"; // 服务id
		String scenarioId = "01"; // 服务分组
		String version = "0.1"; // 服务版本

		Map<String, String> params = new HashMap<String, String>();
		params.put("timeout", "15000"); // 服务参数
		params.put(RPCParamType.channelpool_max.getName(), "1");

		/*** 初始化注册中心连接信息 */
		RegistryConfig registryConfig = new RegistryConfig(URL.valueOf(registryURL));

		/*** 初始化调用实例类 */
		ReferenceConfigSun configSun = new ReferenceConfigSun(serviceId, scenarioId, version, params);
		configSun.setAppId("01001");
		RPCConsumer.init(registryConfig, configSun);
		
		// 执行远程服务
		try {
			RPCResult result = new RPCResult();
			result.setData(getSendContent("test01.json"));
			Object responseObj = RPCConsumer.invoke(new AccessId(serviceId, scenarioId, version), result).getData();
			System.out.println(responseObj);
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}

	public static String getSendContent(String sendPkgFile) {
		String ret = map.get(sendPkgFile);
		if (ret != null) {
			return ret;
		}

		try {
			File pkgFile = new File(confPath + sendPkgFile);
			ret = FileUtils.readFileToString(pkgFile);
			map.put(sendPkgFile, ret);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

}
