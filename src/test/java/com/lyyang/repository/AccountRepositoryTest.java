package com.lyyang.repository;

import com.lyyang.SpringJdbcProjectApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class AccountRepositoryTest extends SpringJdbcProjectApplicationTests {

    @Autowired
    AccountRepository accountRepository;


    @Test
    void findAll() {
        log.info("{}", accountRepository.findAll());
    }
}