package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DemoApplication {


	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("name","测试中的名字");
		return "index";
	}

	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public WiselyResponse say(WebMessage message) throws InterruptedException {
		Thread.sleep(3000);
		return new WiselyResponse("Wellcome to " + message.getName() + "!");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
