package com.zlf.utils.redis;

import com.zlf.utils.redis.context.ApplicationContextUtil;
import com.zlf.utils.redis.handler.RedisHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);

		RedisHandler handler = (RedisHandler)ApplicationContextUtil.getBean("redisHandler");
//		handler.test();
		handler.keys("*test*");
		handler.keys("*category*");
	}

}
