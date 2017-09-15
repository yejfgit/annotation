package com.yejf.test.service.impl;

import com.yejf.test.annotation.Service;
import com.yejf.test.service.MyService;

import java.util.Map;

/**
 * Created by hzyejinfu on 2017/9/14.
 */
@Service("MyServiceImpl")
public class MyServiceImpl implements MyService {
    @Override
    public int insert(Map map) {
        System.out.println("MyServiceImpl:" + "insert");
        return 0;
    }

    @Override
    public int delete(Map map) {
        System.out.println("MyServiceImpl:" + "delete");
        return 0;
    }

    @Override
    public int update(Map map) {
        System.out.println("MyServiceImpl:" + "update");
        return 0;
    }

    @Override
    public int select(Map map) {
        System.out.println("MyServiceImpl:" + "select");
        return 0;
    }
}