package com.wxf.services;

import com.wxf.dao.HkstockMapper;
import com.wxf.domain.model.Hkstock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GreetingService")
public class GreetingService {

    @Autowired
    HkstockMapper hkstockMapper;

    public String hello() {
        Hkstock hkstock = hkstockMapper.selectByPrimaryKey(1l);
        return hkstock.getHkname();
    }
}
