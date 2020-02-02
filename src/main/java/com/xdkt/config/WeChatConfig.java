package com.xdkt.config;

/**
 * created by Leo徐忠春
 * created Time 2020/1/10-8:51
 * email 1437665365@qq.com
 */

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 配置类
 */
@Configuration
@PropertySource(value = "classpath:weixinapplication.properties")
@Data
public class WeChatConfig {
    //公众号appId
    @Value("${wxpay.appid}")
    private String appId;
    //公众号号秘钥
    @Value("${wxpay.appsecret}")
    private String appsecret;

    public WeChatConfig() {
    }

    public String getAppId() {
        return appId;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }
}
