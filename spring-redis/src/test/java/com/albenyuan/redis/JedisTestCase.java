package com.albenyuan.redis;

import com.albenyuan.redis.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


/**
 * @Author Alben Yuan
 * @Date 2018-10-18 14:51
 */
@ContextConfiguration("classpath:spring-jedis.xml")
public class JedisTestCase extends BaseRedisTest {

    private static Logger logger = LoggerFactory.getLogger(JedisTestCase.class);

    @Autowired
    public void setRedisService(RedisService redisService) {
        this.redisService = redisService;
    }

}