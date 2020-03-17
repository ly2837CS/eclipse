package com.cssl;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

// 自动启动
@Component
public class MyRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//读取配置信息，初始化一些内容
		System.out.println("MyRunner run...");

	}

}
