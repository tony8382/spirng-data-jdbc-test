package com.lyyang.repository;

import com.lyyang.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Integer> {

    @Override
    List<Account> findAll();
}
