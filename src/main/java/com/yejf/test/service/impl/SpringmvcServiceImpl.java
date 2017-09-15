package com.yejf.test.service.impl;

import com.yejf.test.service.SpringmvcService;

import java.util.Map;

/**
 * Created by hzyejinfu on 2017/9/14.
 */
public class SpringmvcServiceImpl implements SpringmvcService {

    @Override
    public int insert(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "insert");
        return 0;
    }

    @Override
    public int delete(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "delete");
        return 0;
    }

    @Override
    public int update(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "update");
        return 0;
    }

    @Override
    public int select(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "select");
        return 0;
    }

}