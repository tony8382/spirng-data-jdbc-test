package com.lyyang.repository;

import com.lyyang.entity.Account;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Integer> {

    @Override
    List<Account> findAll();

    String dd = "SELECT * FROM account m WHERE m.email = :email";

    @Query(dd)
    List<Account> findByEmail(@Param("email") String email);

}
