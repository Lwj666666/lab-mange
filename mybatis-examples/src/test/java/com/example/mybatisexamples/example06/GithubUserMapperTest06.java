package com.example.mybatisexamples.example06;

import com.example.mybatisexamples.entity.GithubUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@SpringBootTest
public class GithubUserMapperTest06 {
    @Autowired
    private GithubUserMapper06 githubUserMapper06;

    @Test
    public void guthub_test(){
        QueryOptional queryOptional = QueryOptional.builder()
                .stars(10)
                .repos(10)
                .beforeCreateTime(LocalDateTime.of(2018,1,5,2,25))
                .build();
        List<GithubUser> githubUsers = githubUserMapper06.listByOptionals(queryOptional);
        for (GithubUser g : githubUsers) {
            log.debug("{}/{}",
                    g.getId(),
                    g.getName());
        }
    }
    @Test
    public void guthub2_test(){
        QueryOptional queryOptional = QueryOptional.builder()
                .stars(10)
                .beforeCreateTime(LocalDateTime.of(2018,1,5,2,25))
                .build();
        List<GithubUser> githubUsers = githubUserMapper06.githubUserResult(queryOptional);
        for (GithubUser g : githubUsers) {
            log.debug("{}/{}",
                    g.getId(),
                    g.getName());
        }
    }
}
