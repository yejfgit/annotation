package com.yejf.test.controller;

/**
 * Created by hzyejinfu on 2017/9/14.
 */
import com.yejf.test.annotation.Controller;
import com.yejf.test.annotation.Quatifier;
import com.yejf.test.annotation.RequestMapping;
import com.yejf.test.service.MyService;
import com.yejf.test.service.impl.SpringmvcServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller("yejf")
public class SpringmvcController {
    @Quatifier("MyServiceImpl")
    MyService myService;
    @Quatifier("SpringmvcServiceImpl")
    SpringmvcServiceImpl smService;

    @RequestMapping("insert")
    public String insert(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.insert(null);
        smService.insert(null);
        return null;
    }

    @RequestMapping("delete")
    public String delete(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.delete(null);
        smService.delete(null);
        return null;
    }

    @RequestMapping("update")
    public String update(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.update(null);
        smService.update(null);
        return null;
    }

    @RequestMapping("select")
    public String select(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.select(null);
        smService.select(null);
        return null;
    }
}
