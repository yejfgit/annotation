package com.yejf.test.service;

import java.util.Map;

/**
 * Created by hzyejinfu on 2017/9/14.
 */
public interface SpringmvcService {
    int insert(Map map);

    int delete(Map map);

    int update(Map map);

    int select(Map map);
}
