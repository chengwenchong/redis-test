package com.cheng.redis;

public class HelloRedis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedisPool.getJedis().set("name","chengwenchong");
        System.out.println(RedisPool.getJedis().get("name"));
	}

}
