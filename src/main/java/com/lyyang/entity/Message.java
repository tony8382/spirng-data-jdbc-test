package com.lyyang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Message {
    @Id
    private Integer id;
    @NonNull
    private String username;
    @NonNull
    private Long millis;
    @NonNull
    private String blabla;
}