package com.example.cacheexamples.example01.service;

import com.example.cacheexamples.example01.Mapper.UserMapper;
import com.example.cacheexamples.example01.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    public UserMapper userMapper;

    @Cacheable(value = "user",key = "#uid")
    public User getUser(int uid){
        User user = userMapper.getUser(uid);
        log.debug("called UserService getUser() user: {}", user.getName());
        return user;
    }
    @CacheEvict(value = "user",key = "#id")
    public void delUser(int id){

    }
    @CachePut(value = "user",key = "#user.id")
    public User updateUser(User user){
        User u = userMapper.updateUser(user);
        log.debug("updateUser(), user: {}", u);
        return user;
    }
}
