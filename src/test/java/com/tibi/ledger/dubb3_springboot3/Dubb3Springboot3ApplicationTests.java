package com.tibi.ledger.dubb3_springboot3;

import com.mybatisflex.core.query.QueryWrapper;
import com.tibi.ledger.dubb3_springboot3.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Dubb3Springboot3ApplicationTests {


    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads() {
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select()
                .where("age = 18");
        Account account = accountMapper.selectOneByQuery(queryWrapper);
        System.out.println(account);
    }


}
