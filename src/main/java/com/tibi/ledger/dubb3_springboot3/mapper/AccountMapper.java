package com.tibi.ledger.dubb3_springboot3.mapper;

import com.mybatisflex.core.BaseMapper;
import com.tibi.ledger.dubb3_springboot3.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * AccountMapper
 * <p>
 * Created on: 2025/2/13
 *
 * @author lijian
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
