package com.lyyang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Account {
    @Id
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String email;
}