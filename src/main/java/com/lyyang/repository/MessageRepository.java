package com.lyyang.repository;

import com.lyyang.entity.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {

    @Override
    List<Message> findAll();
}
