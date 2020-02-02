package com.xdkt.controller;

import com.xdkt.config.WeChatConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Leo徐忠春
 * created Time 2020/1/10-9:04
 * email 1437665365@qq.com
 */
@RestController
public class TestController {
    @Autowired
    private WeChatConfig weChatConfig;

    @RequestMapping("/config")
    public String config(){

       return weChatConfig.getAppId()+"):("+weChatConfig.getAppsecret();
    }

}
