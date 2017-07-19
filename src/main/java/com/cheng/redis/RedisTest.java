package com.cheng.redis;

import redis.clients.jedis.Jedis;

public class RedisTest {
	public static void main(String[] args) {
		Jedis jedis=new Jedis("192.168.87.128",6379);
		jedis.auth("chengwenchong");
		System.out.println(jedis.ping());
	}
}
