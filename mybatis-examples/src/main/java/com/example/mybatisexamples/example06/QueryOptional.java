package com.example.mybatisexamples.example06;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryOptional {
    private String gender;
    private Integer followers;
    private Integer stars;
    private Integer repos;
    private LocalDateTime beforeCreateTime;
}
