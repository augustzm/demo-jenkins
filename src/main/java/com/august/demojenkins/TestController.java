package com.august.demojenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangmin@dingchi.com
 * @Description
 * @Date
 * @Package com.august.demojenkins
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public String test(){
        return "jenkins已经成功发布";
    }
}
