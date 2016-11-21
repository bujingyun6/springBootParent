package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Created by zhaohx on 2016/10/26.
 */
@Controller
public class MvcController {


    @Autowired
    private SimpMessagingTemplate messagingTemplate;//通过SimpMessagingTemplate向浏览器发送信息

    @RequestMapping("/chat")
    public void handleChat(Principal principal,String msg){//在springmvc中，可以直接在参数中获取principal,principal中包含当前用户信息
        if(principal.getName().equals("wfy")){
            messagingTemplate.convertAndSendToUser("wisely","/queue/notifications",principal.getName()+"-send:"+msg);
        }else {
            messagingTemplate.convertAndSendToUser("wfy","/queue/notifications",principal.getName()+"-send:"+msg);
        }
    }
}
