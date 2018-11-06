package com.zwx.demo.common;

import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
*@Auther z
*@Date 2018-11-06 16:08
*@Describe
*/
public class SessionUtils {
    public static String setSession(int i,HttpSession session){
        /**连接redis*/
        Jedis jedis=new Jedis("47.93.236.80",6379);
        /**判断该键为i的缓存是否存在*/
        if(jedis.exists(String.valueOf(i))){
            /**如果存在，返回value中key为sessionId的值*/
            return jedis.hmget(String.valueOf(i),"sessionId").get(0);
        }else {
            /**如果不存在，新建map保存至redis中*/
            Map<String,String> map=new HashMap<>();
            map.put("sessionId",session.getId());
            jedis.hmset(String.valueOf(i), map);
            jedis.expire(String.valueOf(i),60);
            /**返回sessionId的值*/
            String sessinId=jedis.hmget(String.valueOf(i),"sessionId").get(0);
            return sessinId;
        }
    }
}
