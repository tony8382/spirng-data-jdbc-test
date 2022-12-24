package com.lyyang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Set;

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

    @MappedCollection(keyColumn = "ID", idColumn = "ACCOUNT_ID")
    private Set<Message> messages;

}