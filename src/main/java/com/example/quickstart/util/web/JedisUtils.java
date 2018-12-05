//package com.example.quickstart.util.web;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;
//
//@Slf4j
//public class JedisUtils {
//
//    /**
//     * 自动注入Redis连接实例对象线程池
//     */
//    @Autowired
//    private JedisPool jedisPool;
//
//    /**
//     * 获取Jedis对象
//     *
//     * @return
//     */
//    public synchronized Jedis getJedis() {
//        Jedis jedis = null;
//        if (jedisPool != null) {
//            try {
//                if (jedis == null) {
//                    jedis = jedisPool.getResource();
//                }
//            } catch (Exception e) {
//                log.error(e.getMessage(), e);
//            }
//        }
//        return jedis;
//    }
//
//    /**
//     * 回收Jedis对象资源
//     *
//     * @param jedis
//     */
//    public synchronized void returnResource(Jedis jedis) {
//        if (jedis != null) {
//            jedisPool.returnResource(jedis);
//        }
//    }
//
//    /**
//     * Jedis对象出异常的时候，回收Jedis对象资源
//     *
//     * @param jedis
//     */
//    public synchronized void returnBrokenResource(Jedis jedis) {
//        if (jedis != null) {
//            jedisPool.returnBrokenResource(jedis);
//        }
//
//    }
//}