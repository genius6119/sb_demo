package com.zwx.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void redis(){
		Jedis jedis=new Jedis("47.93.236.80",6379);
		jedis.set("laozhang","zhenshuai");
		jedis.mset("laozhang1","zhenshuai1","laozhang2","zhenshuai2","laozhang3","zhenshuai3");
		System.out.println(jedis.get("laozhang"));
	}

}
