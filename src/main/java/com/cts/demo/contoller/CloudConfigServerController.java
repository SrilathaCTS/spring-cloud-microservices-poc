package com.cts.demo.contoller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class CloudConfigServerController {

	@RequestMapping("/hello")
	public String welcome() {
		System.out.println("hello");
		return "hello world";
		
	}
}
