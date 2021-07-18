package com.example.cacheexamples.example01.entity;

import lombok.*;

@ToString
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public int id;
    public String name;
}
