package com.example.cacheexamples.example01.Mapper;

import com.example.cacheexamples.example01.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class UserMapper {
    public static final List<User> USERS;
    static {
        User u1 = new User(1,"BO");
        User u2 = new User(2,"SUN");
        USERS = new ArrayList<>();
        USERS.add(u1);
        USERS.add(u2);
    }
    public User getUser(int uid){
        return USERS.stream()
                .filter(u->u.getId()==uid)
                .findFirst()
                .orElse(null);
    }
    public User updateUser(User user) {
        for (int i = 0; i < USERS.size(); i++) {
            if (Objects.equals(user.getId(), USERS.get(i).getId())) {
                USERS.set(i, user);
            }
        }
        return user;
    }
}
