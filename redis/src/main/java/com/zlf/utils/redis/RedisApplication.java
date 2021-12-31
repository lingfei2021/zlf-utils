package com.zlf.utils.redis;

import com.zlf.utils.redis.context.ApplicationContextUtil;
import com.zlf.utils.redis.handler.RedisHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class RedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);

		RedisHandler handler = (RedisHandler)ApplicationContextUtil.getBean("redisHandler");
//		handler.test();
//		handler.keys("erp-product*");
//		handler.keys("*standard_category_tree*");
//		handler.keys("*product_attribute*");
//
//		String value = handler.getStringRedisTemplate().opsForValue().get("1:erp-product-analysis:standard_category_tree::SimpleKey []");
//		System.out.println(value);

//		handler.getStringRedisTemplate().delete("1:erp-product-analysis:standard_category_tree::SimpleKey []");
//		handler.getStringRedisTemplate().delete("Alibaba:1688:super_buy_token");
//		handler.getStringRedisTemplate().delete("erp-productp_status_count:");
//		handler.getStringRedisTemplate().delete("1:dict_details::product_attribute");
//
//		String v = String.valueOf(handler.getStringRedisTemplate().opsForValue().get("Alibaba:1688:super_buy_token"));
//		System.out.println(v);
//
//		String v1 = String.valueOf(handler.getStringRedisTemplate().opsForValue().get("Alibaba:1688:token"));
//		System.out.println(v1);
//
//		String v1 = String.valueOf(handler.getStringRedisTemplate().opsForValue().get("1:dict_details::product_attribute"));
//		System.out.println(v1);
//
//
//		String v2 = String.valueOf(handler.getRedisTemplate().opsForValue().get("Alibaba:1688:super_buy_token"));
//		System.out.println(v2);
//
//		String v12 = String.valueOf(handler.getRedisTemplate().opsForValue().get("Alibaba:1688:token"));
//		System.out.println(v12);
////

//		handler.getStringRedisTemplate().delete("erp-product:p_status_count");

//		handler.getStringRedisTemplate().opsForHash().put("erp-product:p_status_count", "000", "0");
//		handler.getStringRedisTemplate().opsForHash().increment("erp-product:p_status_count", "000", 1);

//		Map entries = handler.getStringRedisTemplate().opsForHash().entries("erp-product:p_status_count");
//		entries.keySet().stream().forEach(key ->{
//			System.out.println(key +" - "+entries.get(key).toString());
//		});

	}

}
