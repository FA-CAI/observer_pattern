package com.shangxue.summary.service;

import com.shangxue.summary.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-07 18:23
 **/
@Slf4j
@Service
public class UserService {
    public User get(long id){
        log.info("getuserById method ......");
        return new User();
    }

    public User get(){
        log.info("getuser  ...");
        return new User();
    }

    public void save(User user){
        log.info("save user method ......");
    }

    public boolean delete(long id)throws Exception{
        log.info("delete method ....");
        throw new Exception("spring aop ThrowAdvice演示");
    }

}
