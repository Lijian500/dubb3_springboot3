package com.tibi.ledger.dubb3_springboot3.controller;

import com.mybatisflex.core.query.QueryWrapper;
import com.tibi.ledger.dubb3_springboot3.Account;
import com.tibi.ledger.dubb3_springboot3.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 * <p>
 * Created on: 2025/2/13
 *
 * @author lijian
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping("/hello")
    public String hello() {
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select()
                .where("age = 18");
        Account account = accountMapper.selectOneByQuery(queryWrapper);
        System.out.println(account);
        return "Hello World!";
    }
}
